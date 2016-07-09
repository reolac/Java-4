
package com.mycompany.icp_2151_lab_1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Prints out the command line interface
 * 
 * 
 * @author Michael Smith
 * @author Huw Padrig Price
 * @since 26/2/14
 */
public class DatabaseTextInterface {

    Scanner in = new Scanner(System.in);
    //Main Menu
    public void startInterface() throws IOException, ClassNotFoundException, SQLException {
        System.out.println("Main Menu");
        System.out.println("*******************");
        System.out.println("1. Students");
        System.out.println("2. Modules");
        System.out.println("3. Registrations");
        System.out.println("4. Reports");
        System.out.println("0. Quit");
        System.out.print(":> ");
        int ans = in.nextInt();
        interfaceCommands(ans);
    }

    public void interfaceCommands(int ans) throws IOException, ClassNotFoundException, SQLException {

        DatabaseManager manager = new DatabaseManager();
        switch (ans) {
            case 0:
                manager.quit();
            case 1: //Student Sub Menu
                System.out.println("Sub-Menu (Students)");
                System.out.println("******************");
                System.out.println("1. Add student");
                System.out.println("2. Delete student");
                System.out.println("3. Update student");
                System.out.println("4. List student");
                System.out.println("0. Return to Main Menu");
                System.out.print(":> ");
                ans = in.nextInt();
                switch (ans) {
                    case 0: //Returns to main menu
                        startInterface();
                    case 1://Add a student
                        in.nextLine();
                        System.out.print("Enter id:> ");
                        String id = in.nextLine();
                        System.out.print("Enter name:> ");
                        String name = in.nextLine();
                        System.out.print("Enter degree scheme:> ");
                        String degree = in.nextLine();
                        manager.addStudent(id, name, degree);
                        System.out.println("Added student - ID : " + id + ", Name : " + name + ", Degree : " + degree);
                        break;
                    case 2:// Delete a student
                        in.nextLine();
                        System.out.print("Enter id:> ");
                        id = in.nextLine();
                        manager.deleteStudent(id);
                        System.out.println("Deleted student - ID : " + id);
                        break;
                    case 3:// Update student details
                        in.nextLine();
                        System.out.print("Enter id:> ");
                        id = in.nextLine();
                        System.out.print("Enter name:> ");
                        name = in.nextLine();
                        System.out.print("Enter degree scheme:> ");
                        degree = in.nextLine();
                        manager.updateStudent(id, name, degree);
                        System.out.println("Updated student - ID : " + id + ", Name : " + name + ", Degree : " + degree);
                        break;

                    case 4:// Lists the student tabe
                        manager.listStudent();
                        break;
                }
                returnToMain();

            case 2: // Modules Sub-Menu
                System.out.println("Sub-Menu (Modules)");
                System.out.println("******************");
                System.out.println("1. Add module");
                System.out.println("2. Delete module");
                System.out.println("3. Update module");
                System.out.println("4. List module");
                System.out.println("0. Return to Main Menu");
                System.out.print(":> ");
                ans = in.nextInt();
                switch (ans) {
                    case 0:// Returns to main menu
                        startInterface();
                    case 1:// Add Module
                        in.nextLine();
                        System.out.print("Enter id:> ");
                        String id = in.nextLine();
                        System.out.print("Enter name:> ");
                        String name = in.nextLine();
                        System.out.print("Enter credits:> ");
                        String credits = in.nextLine();
                        manager.addModule(id, name, credits);
                        System.out.println("Added module - ID : " + id + ", "
                                + "Name : " + name + ", Credits : " + credits);
                        break;
                    case 2:// Delete Module
                        in.nextLine();
                        System.out.print("Enter id:> ");
                        id = in.nextLine();
                        manager.deleteModule(id);
                        System.out.println("Deleted module - ID : " + id);
                        break;
                    case 3: //Update module details
                        in.nextLine();
                        System.out.print("Enter id:> ");
                        id = in.nextLine();
                        System.out.print("Enter name:> ");
                        name = in.nextLine();
                        System.out.print("Enter credits:> ");
                        credits = in.nextLine();
                        manager.updateModule(id, name, credits);
                        System.out.println("Updated module - ID : " + id + ", "
                                + "Name : " + name + ", Credits : " + credits);
                        break;
                    case 4:
                        manager.listModules();
                }
                returnToMain();

            case 3://Registrations Sub Menu
                System.out.println("Sub-Menu (Registrations)");
                System.out.println("******************");
                System.out.println("1. Add registration");
                System.out.println("2. Delete registration");
                System.out.println("3. Update registation");
                System.out.println("4. List registations");
                System.out.println("0. Return to Main Menu");
                System.out.print(":> ");
                ans = in.nextInt();
                switch (ans) {
                    case 0: // return to main menu
                        startInterface();
                    case 1:// add registration
                        in.nextLine();
                        System.out.print("Enter student_id:> ");
                        String student_id = in.nextLine();
                        System.out.print("Enter module_id:> ");
                        String module_id = in.nextLine();
                        manager.addRegistration(student_id, module_id);
                        System.out.println("Added registration - Student_ID : "
                                + student_id + ", Module_ID : " + module_id);
                        break;
                    case 2:// delete registration
                        in.nextLine();
                        System.out.print("Enter student_id:> ");
                        student_id = in.nextLine();
                        manager.deleteRegistration(student_id);
                        System.out.println("Deleted registration - Student_ID : "
                                + student_id);
                        break;
                    case 3://update registration
                        in.nextLine();
                        System.out.print("Enter student_id:> ");
                        student_id = in.nextLine();
                        System.out.print("Enter module_id:> ");
                        module_id = in.nextLine();
                        manager.updateRegistrations(student_id, module_id);
                        System.out.println("Updated registration - Student_ID : "
                                + student_id + ", Module_ID : " + module_id);
                        break;
                    case 4:// list registration table
                        manager.listRegistrations();
                        break;
                }
                returnToMain();
            case 4://Reports Sub-Menu
                System.out.println("Sub-Menu (Reports)");
                System.out.println("******************");
                System.out.println("1. Modules taught by");
                System.out.println("2. Students registered on");
                System.out.println("3. Staff who teach student");
                System.out.println("4. Staff who teach more than");
                System.out.println("0. Return to Main Menu");
                System.out.print(":> ");
                ans = in.nextInt();
                switch (ans) {
                    case 0:// Return to main menu
                        startInterface();
                    case 1:// displays modules taught by staff
                        in.nextLine();
                        System.out.print("Enter staff_name:> ");
                        String staff_name = in.nextLine();
                        manager.taughtBy(staff_name);
                        break;
                    case 2:// displays each module student is registered on
                        in.nextLine();
                        System.out.print("Enter student_name:> ");
                        String student_name = in.nextLine();
                        manager.registeredOn(student_name);
                        break;
                    case 3:// displays staff names that the student takes
                        in.nextLine();
                        System.out.print("Enter student_name:> ");
                        student_name = in.nextLine();
                        manager.staffTeachStudent(student_name);
                        break;
                    case 4:// displays the staff who teach equal to or greater than the number of modules entered
                        in.nextLine();
                        System.out.print("Enter amount of modules:> ");
                        String amount = in.nextLine();
                        manager.teachMoreThan(amount);
                        break;
                }
                returnToMain();
        }
    }

    public void returnToMain() throws IOException, ClassNotFoundException, SQLException {
        System.out.println("Press 0 for Main Menu");
        System.out.print(":> ");
        int ans = in.nextInt();
        if (ans == 0) {
            startInterface();
        }
    }

}
