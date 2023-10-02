import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cTemp = 0;
        int fTemp = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temp in C: ");
            if (in.hasNextInt()) {
                cTemp = in.nextInt();
                fTemp = (cTemp * 9/5) + 32;
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid temp.");
            }
        }while(!done);
        System.out.println(cTemp + " degrees C is " + fTemp + " degrees F");
    }
}