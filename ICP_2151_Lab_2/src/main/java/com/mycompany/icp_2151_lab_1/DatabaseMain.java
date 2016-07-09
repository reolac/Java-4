package com.mycompany.icp_2151_lab_1;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Main entry point to the application as a whole
 * @author Michael Smith
 * @author Huw Padrig Price
 * @since 26/2/14
 */
public class DatabaseMain {
    
    /**
     * Entry application to the CLI and DatabaseManager program
     * @param args command line arguments
     * @throws IOException if the properties file cannot be found
     * @throws ClassNotFoundException if the contents of the properties file are incorrect
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        DatabaseTextInterface tInterface = new DatabaseTextInterface();        
        tInterface.startInterface();                
    }
}
