package org.example.suleyman.dao;

import org.example.suleyman.model.Marks;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class MarksManager {
    private final DatabaseConnection databaseConnection;

    public MarksManager() {
        this.databaseConnection = new DatabaseConnection();
    }

    public Marks getMarkById(Long id) {
        Marks result = null;
        String sql = "SELECT * FROM `marks` WHERE id = ?";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, Math.toIntExact(id));

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    long markId = resultSet.getLong("id");
                    int studentId = resultSet.getInt("studentid");
                    Date mdate = resultSet.getDate("mdate");
                    int mark = resultSet.getInt("mark");
                    String type = resultSet.getString("type");
                    int subjectId = resultSet.getInt("subjectid");

                    result = new Marks(markId, studentId, mdate, mark, type, subjectId);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching mark: " + e.getMessage());
        }
        return result;
    }

    public List<Marks> getAll() {
        List<Marks> result = new ArrayList<>();
        String sql = "SELECT * FROM `marks` ORDER BY `marks`.`id` DESC LIMIT 20";

        try (Connection connection = databaseConnection.getConnection();
             ResultSet resultSet = connection.createStatement().executeQuery(sql)) {

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                int studentId = resultSet.getInt("studentid");
                Date mdate = resultSet.getDate("mdate");
                int mark = resultSet.getInt("mark");
                String type = resultSet.getString("type");
                int subjectId = resultSet.getInt("subjectid");

                result.add(new Marks(id, studentId, mdate, mark, type, subjectId));
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching marks: " + e.getMessage());
        }
        return result;
    }

    public void addMark(Marks mark) {
        String sql = "INSERT INTO `marks` (studentid, mdate, mark, type, subjectid) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, mark.getStudentId());
            preparedStatement.setDate(2, mark.getMdate());
            preparedStatement.setInt(3, mark.getMark());
            preparedStatement.setString(4, mark.getType());
            preparedStatement.setInt(5, mark.getSubjectId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while adding mark: " + e.getMessage());
        }
    }

    public void updateMark(Marks mark) {
        String sql = "UPDATE `marks` SET studentid = ?, mdate = ?, mark = ?, type = ?, subjectid = ? WHERE id = ?";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, mark.getStudentId());
            preparedStatement.setDate(2, mark.getMdate());
            preparedStatement.setInt(3, mark.getMark());
            preparedStatement.setString(4, mark.getType());
            preparedStatement.setInt(5, mark.getSubjectId());
            preparedStatement.setLong(6, mark.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while updating mark: " + e.getMessage());
        }
    }

    public void deleteMark(long id) {
        String sql = "DELETE FROM `marks` WHERE id = ?";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while deleting mark: " + e.getMessage());
        }
    }
}
