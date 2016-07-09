package com.mycompany.icp_2151_lab_1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * From Horstmann Big Java Tests a database installation by creating and
 * querying a sample table. Call this program as java -classpath
 * driver_class_path;. TestDB propertiesFile
 */
public class SqLTester {

    /**
     *
     * @param args command line arguments
     * @throws Exception throws a File, Class or SQL exception for a missing
     * file, an incorrect file or SQL syntax or connectivity problems
     */
    public static void main(String[] args) throws Exception {

        SimpleDataSource.init("C:\\Users\\Michael\\Documents\\NetBeansProjects\\ICP_2151_Lab_2\\src\\main\\resources\\database.properties");
        try (Connection conn = SimpleDataSource.getConnection()) {
            Statement stat = conn.createStatement();
            stat.execute("CREATE TABLE Test (firstName VARCHAR(20), lastName VARCHAR(20), status VARCHAR(20))");
            stat.execute("INSERT INTO Test VALUES ('Jessie', 'Rocket', 'blasting off again')");
            stat.execute("INSERT INTO Test VALUES ('James', 'Rocket', 'blasting off again')");
            stat.execute("INSERT INTO Test VALUES ('Ash', 'Ketchum', 'catching them all')");
            ResultSet result = stat.executeQuery("SELECT * FROM Test");
            System.out.println("First Name\tLast Name\tStatus");
            System.out.println("***********\t*********\t************");
            while (result.next()) {
                System.out.print(result.getString("firstName") + "\t\t"
                        + result.getString("lastName") + "\t\t"
                        + result.getString("status") + "\n");
            }
            stat.execute("DROP TABLE Test");
        }
    }
}
