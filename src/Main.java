import java.sql.*;

public class Main {

    public static final String DriVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public static final String JDBC_URL = "jdbc:derby:MK;create=true";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(DriVER);
        try {
            Connection conn = DriverManager.getConnection(JDBC_URL);
            conn.createStatement().execute("create table users(name varchar (22), email varchar (50))");
            System.out.println("yuhhu");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
