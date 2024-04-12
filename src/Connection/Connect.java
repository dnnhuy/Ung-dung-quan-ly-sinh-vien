package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect
{
    
public static Connection openConnect() throws Exception 
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String ConnectionURL;
        ConnectionURL = "jdbc:sqlserver://localhost:1433; databaseName=QLSV_UFM;";
        String username = "sa";
        String password = "1234";
        return DriverManager.getConnection(ConnectionURL, username, password);
    }
    
public static void CloseConnect(Connection conn)
    {
        if(conn!=null)
        {
            try 
            {
                conn.close();
            } catch (SQLException ex) 
            {
               ex.printStackTrace();        
            }
        }
    }
//public static void main(String arg[]){
//    Connect connect = new Connect();
//}
}

