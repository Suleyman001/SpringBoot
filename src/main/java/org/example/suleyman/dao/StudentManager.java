package org.example.suleyman.dao;

import org.example.suleyman.model.Student;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentManager {
    private final DatabaseConnection databaseConnection;

    public StudentManager() {
        this.databaseConnection = new DatabaseConnection();
    }

    public List<Student> getAll() {
        List<Student> result = new ArrayList<>();
        try (Connection connection = databaseConnection.getConnection();
             ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM student")) {

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String grade = resultSet.getString("grade");

                result.add(new Student(id, name, age, grade));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public void addStudent(Student student) {
        String sql = "INSERT INTO student (name, age, grade) VALUES (?, ?, ?)";
        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getGrade());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    public Student getStudentById(Long id) {
        Student student = null;
        String sql = "SELECT * FROM student WHERE id = ?";
        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String grade = resultSet.getString("grade");
                student = new Student(id, name, age, grade);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public void updateStudent(Student student) {
        String sql = "UPDATE student SET name = ?, age = ?, grade = ? WHERE id = ?";
        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getGrade());
            preparedStatement.setLong(4, student.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    public void deleteStudent(long id) {
        String sql = "DELETE FROM student WHERE id = ?";
        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}
