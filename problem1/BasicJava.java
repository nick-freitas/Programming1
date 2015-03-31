/**
 * Nickolas Freitas
 * CSC 201J, S1
 * Mikhail S. Brickman
 *
 * Assignment One
 * Basic Java
 */
package problem1;


import java.util.Scanner; //allows program to use Scanner class

public class BasicJava
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in); //creates a Scanner object to obtain user input

        System.out.println("Welcome to the coolest calculator ever!"); //displays a welcome message to the user

        //Asks the user for an integer twice, each time storing it in seperate vars
        System.out.print("Please enter an integer: ");
        int NumbOne = input.nextInt();
        System.out.print("Please enter a second integer: ");
        int NumbTwo = input.nextInt();

        //Displays the sum, difference, and product of the two integers
        System.out.printf("The sum of the two integers is %d\n", NumbOne + NumbTwo);
        System.out.printf("The difference between the two integers is %d\n", NumbOne - NumbTwo);
        System.out.printf("The product of the two integers is %d\n", NumbOne * NumbTwo);

        //Analyzes if the second number is 0 or not
        if ( NumbTwo == 0 )
        {
            //Displays undefined as the quotient if the second number is 0
            System.out.print("The quotient of the two integers is undefined\n");
        }
        else
        {
            //Displays the quotient of the two integers if the second number is not 0
            System.out.printf("The quotient of the two integers is %d with a remainder of %d\n",
              NumbOne / NumbTwo, NumbOne % NumbTwo);
        }
    }
}
