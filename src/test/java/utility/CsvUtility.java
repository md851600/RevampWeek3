package utility;

import java.sql.*;

public class CsvUtility {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver by Gemini
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database",
                    "your_username", "your_password");

            // Create a statement to execute SQL queries
            Statement statement = conn.createStatement();

            // Execute a query and retrieve the results
            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table");

            // Process the results
            while (resultSet.next()) {
                // Access the data from each row
                String column1 = resultSet.getString("column_name1");
                int column2 = resultSet.getInt("column_name2");
                // 10/28 week10? must add SQLExcption and cannot call it i
            }
        } catch (SQLException igno) {
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}