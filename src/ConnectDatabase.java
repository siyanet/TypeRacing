import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDatabase {
    private static Connection conn;
    public static void main(String[] args){
      /*  try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver is loaded");
           conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
            System.out.println("connected succesfully");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        getConnection();
    }
    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/typeracerdatabase", "root", "");
            System.out.println("connected succesfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
   /* public static void setConnection(Connection conn){
        this.conn = conn;
    }*/

}
