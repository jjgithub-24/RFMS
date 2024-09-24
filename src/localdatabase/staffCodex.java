package localdatabase;

import static localdatabase.adminUser.*;
import static localdatabase.employeeUser.*;

import java.lang.String;
import java.util.Scanner;

public class staffCodex {

    public static boolean adminSession = false;
    public static boolean employeeSession = false;

    public static void Login(){
        Scanner userID = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        String enteredID = userID.nextLine();
        Scanner userLastName = new Scanner(System.in);
        System.out.println("Enter Employee Last Name:");
        String enteredLastName = userLastName.nextLine();

        boolean adminFound = false;

        if (enteredID.equals(adminID[0]) && enteredLastName.equals(adminLastName[0])) {
            System.out.println("Admin Login Successful");
            adminFound = true;
            adminSession = true;
        } else {
            boolean employeeFound = false;
            for (int i = 0; i < employeeID.length; i++) {
                if (enteredID.equals(employeeID[i]) && enteredLastName.equals(employeeLastName[i])) {
                    System.out.println("Employee Login Successful");
                    System.out.println("Welcome to Work " + employeeLastName[i]);
                    employeeFound = true;
                    employeeSession = true;
                    break;
                }
            }
            if (!employeeFound) {
                System.out.println("Login Failed");
            }
        }
    }
    public static void adminCommands(){
        System.out.println("How can I assist you?");
        Scanner adminInput = new Scanner(System.in);
        String adminCommand = adminInput.nextLine();
        switch (adminCommand) {
            case "list" -> adminListCommands();
            case "change menu" -> adminChangeMenu();
            case "exit" -> System.out.println("Goodbye");
        }
    }
    public static void employeeCommands(){
        System.out.println("How can I assist you?");
        System.out.println("Employee Test Login Successful");
    }
}




