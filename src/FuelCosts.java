import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gasInTank = 0;
        double milesPerGallon = 0;
        double dollarsPerGallon = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gasInTank = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number.");
            }
        }while(!done);
        done = false;

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number.");
            }
        }while(!done);
        done = false;

        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                dollarsPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number.");
            }
        }while(!done);
        done = false;
        System.out.println("The cost to go 100 miles is " + (dollarsPerGallon * (100/milesPerGallon)) + " dollars.");
        System.out.println("With the gas currently in the tank, you can go " + (gasInTank * milesPerGallon) + " miles.");
    }
}