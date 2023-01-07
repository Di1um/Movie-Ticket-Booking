import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Login {
    int loginno = -1;
    String CustomerName;

    public void LoginForm() {

        String[] userNames = {"Dilum", "Virat", "Smith", "Marnus", "Stokes"};
        String[] passwords = {"dilum1", "1234", "hello", "1998","1985"};
        String[] loyaltyPoint = {"20", "35", "25", "70", "60"};


        List statusUserName = Arrays.asList(userNames); // This method takes the array a which is required to be converted into a List.
        List statusPassword = Arrays.asList(passwords);

        // single scanner to capture both the inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        int userNameIndex = statusUserName.indexOf(username);
        int passwordIndex = statusPassword.indexOf(password);

        if (userNameIndex == -1) {
            System.out.println("Username is incorrect");
        } else if (passwordIndex == -1) {
            System.out.println("Password is incorrect");
        } else if (userNameIndex == passwordIndex) {
            loginno= userNameIndex;
            CustomerName = username;
            String loyaltypoint = loyaltyPoint[userNameIndex];
            clientDetails(loyaltypoint);
        } else {
            System.out.println("An error occurred. Please try again.");
        }
    }

    public void clientDetails(String loyaltypoint){

        System.out.println("Hello " + CustomerName +"!");
        System.out.println("Your Total Loyalty Points: " + loyaltypoint);

        ScopeShow scopeShow = new ScopeShow();
        scopeShow.ScopeShowTime();

    }

    public void Registration(){
        System.out.println("Welcome to the Scope Cinema member registration! Please fill in the following details to get registered:");

        Scanner cName = new Scanner(System.in);
        System.out.print("Enter your Name ");
        String newCname = cName.nextLine();

        System.out.println("Successfully Registers ");
        ScopeShow newObj = new ScopeShow();
        newObj.ScopeShowTime();
    }
}
