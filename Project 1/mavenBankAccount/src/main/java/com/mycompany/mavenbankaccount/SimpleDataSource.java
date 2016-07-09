package com.mycompany.mavenbankaccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * A simple data source for getting database connections.
 */
public class SimpleDataSource {

    private static String url;
    private static String username;
    private static String password;

    /**
     * Initializes the data source.
     *
     * @param file the name of the property file that contains the database
     * driver, url, username and password
     * @throws java.io.IOException if no input stream is found
     * @throws java.lang.ClassNotFoundException if the class is not found
     */
    public static void init(InputStream file)
            throws IOException, ClassNotFoundException {
        Properties props = new Properties();
        
        props.load(file);

        String driver = props.getProperty("jdbc.driver");
        url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        Class.forName(driver);
    }

    /**
     * Gets a connection to the database.
     *
     * @return the database connection
     * @throws java.sql.SQLException database argument or connection exception
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,
                username, password);
    }

}
