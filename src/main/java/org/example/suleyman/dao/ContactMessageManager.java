package org.example.suleyman.dao;

import org.example.suleyman.model.ContactMessage;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ContactMessageManager {
    private final DatabaseConnection databaseConnection;

    public ContactMessageManager() {
        this.databaseConnection = new DatabaseConnection();
    }

    public List<ContactMessage> getAll() {
        List<ContactMessage> result = new ArrayList<>();
        try (Connection connection = databaseConnection.getConnection();
             ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM `contact_messages` ORDER BY `contact_messages`.`sent_at` DESC")) {

            while (resultSet.next()) {
                String name= resultSet.getString("name");
                String email= resultSet.getString("email");
                String message= resultSet.getString("message");
                result.add(new ContactMessage(name, email, message));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean saveMessage(ContactMessage contactMessage) {
        String sql = "INSERT INTO contact_messages (name, email, message, sent_at) VALUES (?, ?, ?, NOW())";
        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, contactMessage.getName());
            preparedStatement.setString(2, contactMessage.getEmail());
            preparedStatement.setString(3, contactMessage.getMessage());

            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            System.out.println("Error saving contact message: " + e.getMessage());
            return false;
        }
    }
}
