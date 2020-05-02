package homework09;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DatabaseTest {

    @Test
    public void insertAccommodation() throws SQLException {
        Connection connection = newConnection("postgresql", "localhost", "5432", "booking", "postgres", "password");
        connection.setAutoCommit(false);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accommodation (id, type, bed_type, max_guests, description) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "guesthouse");
            preparedStatement.setString(3, "divan");
            preparedStatement.setInt(4, 3);
            preparedStatement.setString(5, "desc");
            preparedStatement.executeUpdate();
//            connection.commit();
        } finally {
            connection.rollback();
            connection.close();
        }
    }

    @Test
    public void printRoom_Fair() throws SQLException {
        Connection connection = newConnection("postgresql", "localhost", "5432", "booking", "postgres", "password");
        Database database = new Database();
        database.printRoom_fair(connection);
    }

    public Connection newConnection(
            String type, String host, String port,
            String dbName, String user,
            String password) {

        String url = "jdbc:" + type + "://" + host + ":" + port + "/" + dbName +
                "?user=" + user + "&password=" + password;
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}