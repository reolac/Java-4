package com.mycompany.mavenbankaccount;

import java.sql.*;
import java.io.*;
import java.sql.ResultSet;

/**
 *
 * @author eeu213
 */
public class HSQLTester {

    /**
     *
     * @param args command line arguments
     * @throws IOException if no input is found
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException database argument related error
     */
    public static void main(String[] args) throws IOException,
            ClassNotFoundException, SQLException {
        InputStream inputStream = new FileInputStream(new File("/database.properties"));
        

        SimpleDataSource.init(inputStream);
        Connection conn = SimpleDataSource.getConnection();
        Statement st = conn.createStatement();
        try {
            st.execute("CREATE TABLE IF NOT EXISTS accounts (balance DECIMAL(5,2))");
            st.execute("INSERT INTO accounts VALUES (999.99)");
            st.execute("INSERT INTO accounts VALUES (666.66)");

            ResultSet rs = st.executeQuery("SELECT * FROM accounts");

            while (rs.next()) {
                System.out.println(rs.getString("balance"));
            }

            st.execute("DROP TABLE accounts");
        } finally {
            System.out.println("Table created and then dropped!");
            st.close();
            conn.close();
        }
    }

}
