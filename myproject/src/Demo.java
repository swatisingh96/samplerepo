import java.sql.*;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * @author www.codejava.net
 *
 */
public class Demo {
 
    public static void main(String[] args) throws ClassNotFoundException {
 
        Connection conn = null;
 
        try {
        	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	

	 
 }
        catch(Exception e)
        {
        	System.out.println("1");
        }
        try
        {
          		 conn = DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=sa123;database=Test1");
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
 
  Statement statement = conn.createStatement();
 
  // Create table called test_table with a column called test_col holding String values
 
  statement.executeUpdate("CREATE TABLE test_table(test_col VARCHAR(254)  ) ");
 
  System.out.println("Successfully created test_table");
  

            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
