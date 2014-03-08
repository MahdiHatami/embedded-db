import java.sql.*;

public class Main {

    public static final String DriVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public static final String JDBC_URL = "jdbc:derby:MK;create=true";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DriVER);
        try {
            DriverManager.getConnection(JDBC_URL).createStatement().execute("create table addresses(address varchar (22))");
            System.out.println("yeah");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
