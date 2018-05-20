/*
 * Created By Yugal Kukde
 */
package tqa.DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author YUGAL
 */
public class DBConnection {
     private static Connection conn;

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//Yugal-PC:1521/XE", "PROJECT", "java");
            System.out.println("Connection Established");
        } catch (ClassNotFoundException cnf) {
            JOptionPane.showMessageDialog(null, "Error loading Drivers:" + cnf, "Error!!", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "SQL Error:" + sql, "Error!!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static Connection getConnection() {
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Connection closed");
            } catch (SQLException sql2) {
                JOptionPane.showMessageDialog(null, "SQL Error:" + sql2, "Error!!", JOptionPane.ERROR_MESSAGE);
                System.out.println("Exception"+sql2);
            }
        }
    }
}
