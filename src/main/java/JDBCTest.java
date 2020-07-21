import java.sql.*;
import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    private static List<String> getEmployeeFirstNames() {
        List<String> firstNames = new ArrayList<>();
        Config config = new Config();
        try {
            DriverManager.registerDriver(new Driver());
            Connection conn = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT first_name FROM employees LIMIT 10");


            while (rs.next()){
                firstNames.add(rs.getString("first_name"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return firstNames;
    }

    private static List<String> getEmployeeFirstNames(int numberOfNames) {
        List<String> firstNames = new ArrayList<>();

        try {
            DriverManager.registerDriver(new Driver());
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "jayarredondo",
                    "Jaw3som313!@#"
            );
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT first_name FROM employees LIMIT " + numberOfNames);


            while (rs.next()){
                firstNames.add(rs.getString("first_name"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return firstNames;
    }

    public static void main(String[] args) {
        System.out.println(getEmployeeFirstNames());
        System.out.println(getEmployeeFirstNames(20));
    }
}
