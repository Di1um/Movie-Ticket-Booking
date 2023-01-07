
import java.util.Scanner;

public class ScopeShow extends UserType{

    String[] MovieName ={"Interstellar","Hitman", "Gravity", "World war Z"}; // Movie list that Scope Cinema shows currently
    String[] MovieTime = {"10:30 a.m.", "2:30 p.m.", "7:00 p.m.", "10:30 p.m. "}; // time slots available for the movie

    public void ScopeShowTime() {
        System.out.println("\nToday's Movies:");
        // for loop is used here instead of while loop as for loop can be easier to understand
        for (int i = 0; i < MovieName.length; i++) {
            System.out.println((i + 1) + ": " + MovieName[i] + "\t\t" + MovieTime[i]);

        }

    bookings();

    }
    public void welcome() {
        System.out.println("Hi, Welcome to Scope Cinema, please use below commands to continue..");
        System.out.println("A) Login and buy tickets \t B) Register to buy tickets");

        Scanner select1 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter here..");
            String answer1 = select1.nextLine();
            // The loop allows the user to keep trying to enter a valid choice until they do
            // switch statement is more concise and easier to read than a series of if statements.
            switch (answer1) {
                case "A":
                    Login CustomerLog = new Login();
                    CustomerLog.LoginForm();
                    return;
                case "B":
                    System.out.println("Welcome to registration :)");
                    Login newObj = new Login();
                    newObj.Registration();
                    return;
                default:
                    System.out.println("Sorry! Invalid Choice :(");
                    break;
            }
        }
    }

    public void bookings() {
        int bookingno = 0;
        System.out.println("Select the time slot");

        Scanner TicketBook = new Scanner(System.in);
        // using while loop and try catch is better here
        // if user enters non-integer value, try-catch will handle it
        while (true) {
            System.out.print("Which one do you like to book? enter here.. ");
            String ticket1 = TicketBook.nextLine();
            try {
                bookingno = Integer.parseInt(ticket1);
                if (bookingno > 0 && bookingno <= MovieName.length) {
                    System.out.println(MovieName[bookingno - 1] + "\t" + MovieTime[bookingno - 1]);
                    bookingno = bookingno - 1;
                    tickets(bookingno);
                    return;
                } else {
                    System.out.println("Wrong choice");
                }
            } catch (Exception e) {
                System.out.println("Invalid selection number. Try again.");
            }
        }
    }


    public void tickets(int bookingDetails) {
        System.out.println("\nTicket Prices");
        System.out.println("1: " + CustomerType[0] + " " + CustomerPrice[0]);
        System.out.println("2: " + CustomerType[1] + " " + CustomerPrice[1]);

        Scanner ticketSelect = new Scanner(System.in);

        while (true) {
            System.out.print("Select 1 or 2: ");
            String ticket01 = ticketSelect.nextLine();
            try {
                int ticketType = Integer.parseInt(ticket01);
                if (ticketType == 1 || ticketType == 2) {
                    String movieName = MovieName[bookingDetails];
                    String movieTime = MovieTime[bookingDetails];
                    invoice(ticket01, movieName, movieTime, ticketType);
                    return;
                } else {
                    System.out.println("Invalid selection. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid selection. Try again.");
            }
        }
    }



}



