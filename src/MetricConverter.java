import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int meters = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the distance in meters: ");
            if (in.hasNextInt()) {
                meters = in.nextInt();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number.");
            }
        }while(!done);
        System.out.println(meters + " meters is: ");
        System.out.println((meters * 0.000621371) + " miles");
        System.out.println((meters * 3.28084) + " feet");
        System.out.println((meters * 39.3701) + " inches");
    }
}