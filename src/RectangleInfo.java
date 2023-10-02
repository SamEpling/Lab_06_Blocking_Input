import java.util.Scanner;

public class RectangleInfo
{

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int height = 0;
            int width = 0;
            String trash = "";
            boolean done = false;

            do {
                System.out.print("Enter the height of the rectangle: ");
                if (in.hasNextInt()) {
                    height = in.nextInt();
                    in.nextLine();
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " which is not a valid number.");
                }
            } while (!done);
            done = false;
            do {
                System.out.print("Enter the width of the rectangle: ");
                if (in.hasNextInt()) {
                    width = in.nextInt();
                    in.nextLine();
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " which is not a valid number.");
                }
            } while (!done);
            System.out.println("The area of the rectangle is " + (width * height));
            System.out.println("The perimeter of the rectangle is " + ((width + height)*2));
            System.out.println("The diagonal of the rectangle is " + (Math.sqrt(width * width + height * height)));
        }
    }