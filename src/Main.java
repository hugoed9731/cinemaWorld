import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuOption;

        System.out.println("Welcome to the Cinema World!");


        do {
            try{
                System.out.println("What would you like to do?");
                System.out.println("1.- Show billboard");
                System.out.println("2.- Buy tickets");
                System.out.println("3.- Exit");
                menuOption = sc.nextInt();

                switch (menuOption) {
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("See you soon Amigo!");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please type a valid option!");
                        break;
                }

                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please type a valid number.");
                sc.nextLine(); // Cleaning the buffer
            }
        } while (true);
    }
}