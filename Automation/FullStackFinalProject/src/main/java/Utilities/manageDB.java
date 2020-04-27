package Utilities;

import com.sun.codemodel.JTryBlock;

import javax.swing.*;
import java.sql.DriverManager;

public class manageDB extends CommonOps
{
        public static void initConnection(String dbURL, String user, String pass)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(dbURL, user, pass);
                stmt = con.createStatement();
            }
            catch (Exception e)
            {
                System.out.println("Error Occurred while Connecting to DB, See details: " + e);
            }
        }

        public static void closeConnection()
        {
            try
            {
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error Occurred While Closing to DB, See Details: " + e);
            }
        }
}
