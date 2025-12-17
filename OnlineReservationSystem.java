import java.util.Scanner;
public class OnlineReservationSystem {
    static Scanner sc = new Scanner(System.in);
    static String passengerName;
    static String trainName;
    static String from;
    static String to;
    static String journeyDate;
    static String classType;
    static int trainNumber;
    static boolean isBooked = false;
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("      ONLINE RESERVATION SYSTEM      ");
        System.out.println("====================================");
        // Login
        System.out.print("Enter Username: ");
        String username = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();
        if (username.equals("admin") && password.equals("1234")) {
            showMenu();
        } else {
            System.out.println("Invalid Login! Access Denied.");
        }
    }
    // Menu
    static void showMenu() {
        int choice;
        do {
            System.out.println("\n------------- MENU -------------");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    reserveTicket();
                    break;
                case 2:
                    viewTicket();
                    break;
                case 3:
                    cancelTicket();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        } while (choice != 4);
    }
    // Reserve Ticket
    static void reserveTicket() {
        sc.nextLine(); // clear buffer
        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();
        System.out.print("Enter Train Number: ");
        trainNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Train Name: ");
        trainName = sc.nextLine();
        System.out.print("Enter Class Type: ");
        classType = sc.nextLine();
        System.out.print("Enter Journey Date (DD-MM-YYYY): ");
        journeyDate = sc.nextLine();
        System.out.print("From: ");
        from = sc.nextLine();
        System.out.print("To: ");
        to = sc.nextLine();
        isBooked = true;
        System.out.println("\nTicket Reserved Successfully!");
    }
    // View Ticket
    static void viewTicket() {
        if (isBooked) {
            System.out.println("\n---------- TICKET DETAILS ----------");
            System.out.println("Passenger Name : " + passengerName);
            System.out.println("Train Number   : " + trainNumber);
            System.out.println("Train Name     : " + trainName);
            System.out.println("Class Type     : " + classType);
            System.out.println("Journey Date   : " + journeyDate);
            System.out.println("From           : " + from);
            System.out.println("To             : " + to);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
    // Cancel Ticket
    static void cancelTicket() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Ticket Cancelled Successfully!");
        } else {
            System.out.println("No ticket found to cancel.");
        }
    }
}
