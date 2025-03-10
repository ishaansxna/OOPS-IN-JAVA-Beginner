import java.sql.*;

public class DATABASE {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // SQLite connection string
            String url = "jdbc:sqlite:example.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connected to the database.");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}