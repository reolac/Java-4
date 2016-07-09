package com.mycompany.icp_2151_lab_1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Responds to the CLI executing SQL statements against the Database with the selected command
 * 
 * 
 * @author Michael Smith
 * @author Huw Padrig Price
 * @since 26/2/14
 */
public class DatabaseManager {

    /**
     * Searches for the properties file to find the connection parameters for the database
     * @throws IOException if the properties file cannot be found
     * @throws ClassNotFoundException if the contents of the properties file are incorrect
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public DatabaseManager() throws IOException, ClassNotFoundException, SQLException {
        SimpleDataSource.init("C:\\Users\\Michael\\Documents\\NetBeansProjects\\"
                + "ICP_2151_Lab_2\\src\\main\\resources\\database.properties");
    }

    /**
     * Asks for an id, name and degree and creates a new entry in the student table
     * @param id student id
     * @param name student name
     * @param degree student degree
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void addStudent(String id, String name, String degree)
            throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "INSERT INTO student VALUES('" + id + "','" + name + "','"
                + degree + "')";
        stat.execute(command);
    }

    /**
     * Asks for an id, name and credits and creates a new entry in the module table
     * @param id student id
     * @param name student name
     * @param credits student degree
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void addModule(String id, String name, String credits)
            throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "INSERT INTO module VALUES('" + id + "','" + name + "',"
                + credits + ")";
        stat.execute(command);
    }

    /**
     * Asks for an id, name and credits and creates a new entry in the module table
     * @param student_id id of the student
     * @param module_id id of the module
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void addRegistration(String student_id, String module_id)
            throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "INSERT INTO registered VALUES('" + student_id + "','"
                + module_id + "')";
        stat.execute(command);
    }

    /** Closes the application when the quit option is selected
     *
     */
    public void quit() {
        System.out.println("CLI Shutting Down");
        System.exit(1);
    }

    /**
     * Lists all students from the student table including id, name and degree
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void listStudent() throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        ResultSet result = stat.executeQuery("SELECT * FROM student");
        System.out.println("student_id\tstudent_name\tdegree_scheme");
        System.out.println("***********\t************\t**************");
        while (result.next()) {
            System.out.print(result.getString("student_id") + "\t\t"
                    + result.getString("student_name") + "\t"
                    + result.getString("degree_scheme") + "\t\n");
        }
    }

    /**
     * Lists all staff from the staff table including id, name and grade
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void listStaff() throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        ResultSet result = stat.executeQuery("SELECT * FROM staff");
        System.out.println("staff_id\tstaff_name\tgrade");
        System.out.println("*********\t**********\t*****");
        while (result.next()) {
            System.out.print(result.getString("staff_id") + "\t\t"
                    + result.getString("staff_name") + "\t"
                    + result.getString("grade") + "\t\n");
        }
    }

    /**
     * Lists all modules from the module table including id, name and credits
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void listModules() throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        ResultSet result = stat.executeQuery("SELECT * FROM module");
        System.out.println("module_id\tmodule_name\t\t\tcredits");
        System.out.println("*********\t**********\t\t\t*****");
        while (result.next()) {
            System.out.printf("%-16s%-32s%s", result.getString("module_id"), result.getString("module_name"), result.getString("credits") + "\n");
        }
    }

    /**
     * Lists all registrations from the registered table including student_id and module_id
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void listRegistrations() throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        ResultSet result = stat.executeQuery("SELECT * FROM registered");
        System.out.println("student_id\tmodule_id");
        System.out.println("**********\t**********");
        while (result.next()) {
            System.out.print(result.getString("student_id") + "\t\t"
                    + result.getString("module_id") + "\n");
        }
    }

    /**
     * Lists the id's of the staff who teach the id's of the modules
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void listTaughtByStaff() throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        ResultSet result = stat.executeQuery("SELECT * FROM teaches");
        System.out.println("staff_id\tmodule_id");
        System.out.println("*********\t********");
        while (result.next()) {
            System.out.print(result.getString("staff_id") + "\t\t"
                    + result.getString("module_id") + "\n");
        }
    }

    /**
     * Asks for an existing ID and deletes that entry from the student table
     * @param id student id
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void deleteStudent(String id) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "DELETE FROM student WHERE(`student_id` = '" + id + "')";
        stat.execute(command);
    }

    /**
     * Asks for an existing ID and deletes that entry from the module table
     * @param id student id
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void deleteModule(String id) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "DELETE FROM module WHERE(`module_id` = '" + id + "')";
        stat.execute(command);
    }

    /**
     * Asks for an existing studentID and deletes that entry from the registered table
     * @param student_id student id
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void deleteRegistration(String student_id) throws SQLException { // only checks 1 key
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "DELETE FROM registered WHERE(`student_id` = '" + student_id + "')";
        stat.execute(command);
    }

    /**
     * Asks for an existing ID and new entries for name and degree and updates that entry
     * @param id student id
     * @param name student name
     * @param degree student degree
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void updateStudent(String id, String name, String degree) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "UPDATE student SET `student_name` = '" + name + "',"
                + "`degree_scheme` = '" + degree + "' WHERE `student_id` = '" + id + "'";
        stat.execute(command);
    }

    /**
     * Asks for an existing ID and new entries for name and credits and updates that entry
     * @param id module id
     * @param name module name
     * @param credits module credits
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void updateModule(String id, String name, String credits) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "UPDATE module SET `module_name` = '" + name + "',"
                + "`credits` = '" + credits + "' WHERE `module_id` = '" + id + "'";
        stat.execute(command);
    }

    /**
     * Asks for an existing studentID and new entries for moduleID and updates that entry
     * @param student_id student id
     * @param module_id student name
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void updateRegistrations(String student_id, String module_id) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "UPDATE registered SET `module_id` = '" + module_id
                + "' WHERE `student_id` = '" + student_id + "'";
        stat.execute(command);
    }

    /**
     * Asks for a staffName and lists all of the moduleNames that they teach
     * @param staff_name name of the staff
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void taughtBy(String staff_name) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "SELECT `module`.`module_id`, `module`.`module_name`"
                + "FROM `module` INNER JOIN `teaches` "
                + "ON `module`.`module_id` = `teaches`.`module_id` "
                + "JOIN `staff` ON `teaches`.`staff_id` = `staff`.`staff_id` "
                + "WHERE `staff`.`staff_name` = '" + staff_name + "'";
        ResultSet result = stat.executeQuery(command);
        System.out.println("Module ID\tName");
        System.out.println("*********\t*********************");
        while (result.next()) {
            System.out.print(result.getString("module_id") + "\t\t"
                    + result.getString("module_name") + "\n");
        }
    }

    /**
     * Asks for a studentName and displays the moduleNames that they are registered in
     * @param student_name name of the student
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void registeredOn(String student_name) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "SELECT `module`.`module_name`"
                + "FROM `student` INNER JOIN `registered` "
                + "ON `student`.`student_id` = `registered`.`student_id` "
                + "JOIN `module` ON `registered`.`module_id` = `module`.`module_id`"
                + "WHERE `student`.`student_name` = '" + student_name + "'";
        ResultSet result = stat.executeQuery(command);
        System.out.println("Module Name");
        System.out.println("*********************");

        while (result.next()) {
            System.out.println(result.getString("module_name"));
        }
    }

    /**
     * Asks for a studentName and displays the staffNames who teach that student
     * @param student_name name of the student
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void staffTeachStudent(String student_name) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "SELECT `staff`.`staff_name`\n"
                + "FROM `staff` INNER JOIN `teaches` ON `staff`.`staff_id` = `teaches`.`staff_id` \n"
                + "JOIN `registered` ON `teaches`.`module_id` = `registered`.`module_id`\n"
                + "JOIN `student` ON `registered`.`student_id` = `student`.`student_id`\n"
                + "WHERE `student`.`student_name` = '" + student_name + "';";
        ResultSet result = stat.executeQuery(command);
        System.out.println("Staff Name");
        System.out.println("***********");

        while (result.next()) {
            System.out.println(result.getString("staff_name"));
        }
    }

    /**
     * Asks for a value and displays the staffNames who teach more than or equal to the value
     * @param value number of modules taught
     * @throws SQLException if there is a connection or SQL syntax issue with the database
     */
    public void teachMoreThan(String value) throws SQLException {
        Connection conn = SimpleDataSource.getConnection();
        Statement stat = conn.createStatement();
        String command = "SELECT `staff`.`staff_name`\n"
                + "FROM `module` INNER JOIN `teaches`\n"
                + "ON `module`.`module_id` = `teaches`.`module_id`\n"
                + "JOIN `staff` ON `teaches`.`staff_id` = `staff`.`staff_id`\n"
                + "GROUP BY `staff`.`staff_name`\n"
                + "HAVING COUNT(*) >='" + value + "'";
        ResultSet result = stat.executeQuery(command);
        System.out.println("Staff Name");
        System.out.println("***********");

        while (result.next()) {
            System.out.println(result.getString("staff_name"));
        }
    }
}
