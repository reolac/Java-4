package com.mycompany.icp_2151_lab_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * From Horstmans BigJava.
   A simple data source for getting database connections. 
*/
public class SimpleDataSource
{
   private static String url;
   private static String username;
   private static String password;

   /**
      Initializes the data source.
      @param fileName the name of the property file that 
      contains the database driver, URL, username, and password
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
   */
   public static void init(String fileName)
         throws IOException, ClassNotFoundException
   {  
      Properties props = new Properties();
      FileInputStream in = new FileInputStream(fileName);
      props.load(in);

      String driver = props.getProperty("jdbc.driver");
      url = props.getProperty("jdbc.url");
      username = props.getProperty("jdbc.username");
      if (username == null) { username = ""; }
      password = props.getProperty("jdbc.password");
      if (password == null) { password = ""; }
      if (driver != null) { Class.forName(driver); }
   }

   /**
      Gets a connection to the database.
      @return the database connection
     * @throws java.sql.SQLException
   */
   public static Connection getConnection() throws SQLException
   {
      return DriverManager.getConnection(url, username, password);
   }
}
