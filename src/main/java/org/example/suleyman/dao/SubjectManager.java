package org.example.suleyman.dao;

import org.example.suleyman.model.Subject;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class SubjectManager {
    private final DatabaseConnection databaseConnection;

    public SubjectManager() {
        this.databaseConnection = new DatabaseConnection();
    }

    public List<Subject> getAll() {
        List<Subject> subjects = new ArrayList<>();
        String sql = "SELECT * FROM subjects";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String sname = resultSet.getString("sname");
                String category = resultSet.getString("category");

                subjects.add(new Subject(id, sname, category));
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching subjects: " + e.getMessage());
        }

        return subjects;
    }

    public Subject getSubjectById(int id) {
        String sql = "SELECT * FROM subjects WHERE id = ?";
        Subject subject = null;

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String sname = resultSet.getString("sname");
                    String category = resultSet.getString("category");

                    subject = new Subject(id, sname, category);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching subject by id: " + e.getMessage());
        }

        return subject;
    }

    public void addSubject(Subject subject) {
        String sql = "INSERT INTO subjects (sname, category) VALUES (?, ?)";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, subject.getSname());
            preparedStatement.setString(2, subject.getCategory());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while inserting subject: " + e.getMessage());
        }
    }

    public void updateSubject(Subject subject) {
        String sql = "UPDATE subjects SET sname = ?, category = ? WHERE id = ?";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, subject.getSname());
            preparedStatement.setString(2, subject.getCategory());
            preparedStatement.setInt(3, subject.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while updating subject: " + e.getMessage());
        }
    }

    public void deleteSubject(int id) {
        String sql = "DELETE FROM subjects WHERE id = ?";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while deleting subject: " + e.getMessage());
        }
    }
}
