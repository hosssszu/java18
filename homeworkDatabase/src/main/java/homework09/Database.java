package homework09;

import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Log4j2
public class Database {

    public void connection() {
        Connection connection = newConnection(
                "postgresql",
                "localhost",
                "5432",
                "booking",
                "postgres",
                "password"
        );

        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
//            createTableAccommodation(connection);
//            createTableRoom_fair(connection);
//            createTableAccommodation_to_room_fair_relation(connection);
//            insertAccommodation(connection);
//            insertRoom_fair(connection);
//            insertAccommodation_to_room_fair_relation(connection);
            printAccommodation(connection);
//            printRoom_fair(connection);
//            printAccommodation_to_room_fair_relation(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printAccommodation_to_room_fair_relation(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from accommodation_to_room_fair_relation");
        List<Relation> relations= new ArrayList<>();
        while(resultSet.next()){
            Relation relation = new Relation();
            relation.setId(resultSet.getInt("id"));
            relation.setId_accommodation(resultSet.getInt("id_accommodation"));
            relation.setId_room_fair(resultSet.getInt("id_room_fair"));
            relations.add(relation);
        }
        for (int i = 0; i < relations.size(); i++) {
            log.info(relations.get(i));
        }
    }

    public void printRoom_fair(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from room_fair");
        List<Room_Fair> room_fairs = new ArrayList<>();
        while (resultSet.next()) {
            Room_Fair room_fair = new Room_Fair();
            room_fair.setId(resultSet.getInt("id"));
            room_fair.setValue(resultSet.getDouble("value"));
            room_fair.setSeason(resultSet.getString("season"));
            room_fairs.add(room_fair);
        }
        for (int i = 0; i < room_fairs.size(); i++) {
            log.info(room_fairs.get(i));
        }
    }

    public void printAccommodation(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from accommodation");
        List<Accommodation> accommodations = new ArrayList<>();
        while (resultSet.next()) {
            Accommodation accommodation = new Accommodation();
            accommodation.setId(resultSet.getInt("id"));
            accommodation.setType(resultSet.getString("type"));
            accommodation.setBed_type(resultSet.getString("bed_type"));
            accommodation.setMax_guests(resultSet.getInt("max_guests"));
            accommodation.setDescription(resultSet.getString("description"));
            accommodations.add(accommodation);
        }
        for (int i = 0; i < accommodations.size(); i++) {
            log.info(accommodations.get(i));
        }
    }


    public void createTableAccommodation(Connection connection) throws SQLException {
        PreparedStatement createTable = connection.prepareStatement(
                "create table accommodation " +
                        "(id serial," +
                        "type varchar(32), " +
                        "bed_type varchar(32), " +
                        "max_guests int, " +
                        "description varchar(512), " +
                        "primary key(id))");
        createTable.execute();
        connection.commit();
    }

    public void createTableRoom_fair(Connection connection) throws SQLException {
        PreparedStatement createTable = connection.prepareStatement(
                "create table room_fair " +
                        "(id serial, " +
                        "value float8, " +
                        "season varchar(32), " +
                        "primary key(id))");
        createTable.execute();
        connection.commit();
    }

    public void createTableAccommodation_to_room_fair_relation(Connection connection) throws SQLException {
        PreparedStatement createTable = connection.prepareStatement(
                "create table accommodation_to_room_fair_relation " +
                        "(id serial primary key, " +
                        "id_accommodation serial references accommodation, " +
                        "id_room_fair serial references room_fair)");
        createTable.execute();
        connection.commit();
    }

    public void insertAccommodation(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accommodation (id, type, bed_type, max_guests, description) VALUES (?, ?, ?, ?, ?)");
        preparedStatement.setInt(1, 3);
        preparedStatement.setString(2, "guesthouse");
        preparedStatement.setString(3, "divan");
        preparedStatement.setInt(4, 2);
        preparedStatement.setString(5, "desc");
        preparedStatement.executeUpdate();
        connection.commit();
    }

    public void insertRoom_fair(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO room_fair (id, value, season) VALUES (?, ?, ?)");
        preparedStatement.setInt(1, 1);
        preparedStatement.setDouble(2, 3);
        preparedStatement.setString(3, "season");
        preparedStatement.executeUpdate();
        connection.commit();
    }

    public void insertAccommodation_to_room_fair_relation(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accommodation_to_room_fair_relation (id, id_accommodation, id_room_fair) VALUES (?, ?, ?)");
        preparedStatement.setInt(1, 3);
        preparedStatement.setInt(2, 3);
        preparedStatement.setInt(3, 3);
        preparedStatement.executeUpdate();
        connection.commit();
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
