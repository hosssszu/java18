package homework09;

/**
 * Create and insert data in postgres database.
 *
 * @author Loránd
 */
public class DatabaseMain {

    public static void main(String[] args) {
        Database database = new Database();
        database.connection();
    }
}



