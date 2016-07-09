package com.mycompany.icp_2151_lab_1;

import com.ibatis.common.jdbc.ScriptRunner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;

/**
 * Runs SQL scripts from a path to populate a database with multiple tables
 * 
 * @author Michael Smith
 * @author Huw Padrig Price
 * @since 25/2/14
 */
public class Utopia {

    /**
     * Populates the database with tables and elements from the three attached scripts
     * @param args command line arguments
     * @throws Exception throws a File, Class or SQL exception for a missing
     * file, an incorrect file or SQL syntax or connectivity problems
     */
    public static void main(String[] args) throws Exception {
        SimpleDataSource.init("C:\\Users\\Michael\\Documents\\NetBeansProjects"
                + "\\ICP_2151_Lab_2\\src\\main\\resources\\database.properties");

        String destroySQLRead = "C:\\Users\\Michael\\Documents\\NetBeansProjects"
                + "\\ICP_2151_Lab_2\\src\\main\\resources\\1-destroy.sql";

        String createSQLRead = "C:\\Users\\Michael\\Documents\\NetBeansProjects"
                + "\\ICP_2151_Lab_2\\src\\main\\resources\\2-create.sql";

        String insertSQLRead = "C:\\Users\\Michael\\Documents\\NetBeansProjects"
                + "\\ICP_2151_Lab_2\\src\\main\\resources\\3-insert.sql";

        try (Connection conn = SimpleDataSource.getConnection()) {
            ScriptRunner sr = new ScriptRunner(conn, false, false);

            Reader destroySQL = new BufferedReader(
                    new FileReader(destroySQLRead));

            Reader createSQL = new BufferedReader(
                    new FileReader(createSQLRead));

            Reader insertSQL = new BufferedReader(
                    new FileReader(insertSQLRead));
            sr.runScript(destroySQL);
            sr.runScript(createSQL);
            sr.runScript(insertSQL);
        }
    }
}
