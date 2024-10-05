
package gymms;
import java.sql.*;
/**
 *
 * @author france
 */
public class DBConnection {
    public static Connection getCon(){
        try{
            Class.forName("ccom.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_ms?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Avozinho2003");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
