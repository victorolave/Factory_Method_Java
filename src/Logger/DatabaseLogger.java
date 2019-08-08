package Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseLogger implements Logger{

    private String url;
    private String user;
    private String password;

    public static Connection getConnection()
    {
        Connection con = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://host:port/table",
                    "yourUser",
                    "yourPassword"
            );
            System.out.println("Connection Complete!");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        return con;
    }

    public void log(String msg) {

        Connection con = null;

        try
        {
            con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO messages (id, message) VALUES (?,?)");

            ps.setString(1, null);
            ps.setString(2, msg);

            int res = ps.executeUpdate();

            if(res > 0)
            {
                System.out.println("Guardado!");
            }
            else
            {
                System.out.println("Error in save message");
            }

            con.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
