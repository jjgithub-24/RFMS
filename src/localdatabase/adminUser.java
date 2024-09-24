package localdatabase;

import java.lang.String;

import static localdatabase.employeeUser.employeeID;

public class adminUser {

    public static String[] adminID = new String[]{"1000"};
    public static String[] adminLastName = new String[]{"L0"};
    public static String[] adminavailCommands = new String[]{"adminChangeMenu", "Command2", "Command3"};

    public static void adminChangeMenu() {
        System.out.println("adminChangeMenu Test");
    }

    public static void adminListCommands() {
        for (int i = 0; i < employeeID.length; i++){
            System.out.println(adminavailCommands[i]);
        }

    }
}