//Name -Vincent Salazar

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many bits are in a integer?");
                int intOne = keyboard.nextInt();
        System.out.print("Is this the most used or least used?");
                int intTwo = keyboard.nextInt();

        System.out.print("How many bits are in a float?");
        float floatOne = keyboard.nextInt();
        System.out.print("What are floats digits of accuracy?");
        float floatTwo = keyboard.nextInt();

        System.out.print("How many bits are in a double?");
        double doubleOne = keyboard.nextInt();
        System.out.print("What are the doubles' digits of accuracy?");
        double doubleTwo = keyboard.nextInt();

        System.out.print("How many bits are in a short?");
        short shortOne = keyboard.nextShort();
        System.out.print("What is the min the short can go to?");
        short shortTwo = keyboard.nextShort();

        System.out.print("What are strings useful for? ");
        String function = keyboard.nextLine();

        System.out.print("What do strings print? ");
        String answer = keyboard.next();

        //add in input for all variables

        System.out.println();
        System.out.println("integer one = " + intOne + "bits" );
        System.out.println("max for integers = " + intTwo );

        System.out.println();

        System.out.print("float = " + floatOne + "bits");
        System.out.println("max for float = " + floatTwo);

        System.out.println();

        System.out.println("double =" + doubleOne + "bits");
        System.out.println("max for double =" + doubleTwo);

        System.out.println();

        System.out.println("short = " + shortOne + "bits");
        System.out.println("min for short =" + shortTwo + "bits");

        System.out.println();

        System.out.println("A string use =" + function);
        System.out.println( answer);
    }
}