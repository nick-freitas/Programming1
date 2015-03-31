/**
 * Nickolas Freitas
 * CSC 201J, S1
 * Mikhail S. Brikman
 *
 * Assignment Two
 * Numerical Data
 */
package problem2;


import java.util.Scanner;

public class Protwo
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        // Prompt user for inputs
        System.out.printf("Please enter the number of Gadgets:\n");
        int gagnumb = input.nextInt();
        System.out.printf("Please enter the weight of the Gadget:\n");
        double gagmass = input.nextDouble();
        System.out.printf("Please enter the price per pound of the Gadget:\n");
        double pricepp = input.nextDouble();
        System.out.printf("Please enter the tax rate:\n");
        double taxr = ( input.nextDouble() ) / 100; // divides input tax rate by 100 so it is decimal notation for later use

        check(gagnumb, gagmass, pricepp, taxr); // checks to make sure all imputs are positive numbers
        printuserinput(gagnumb, gagmass, pricepp, taxr); // prints user inputs out to the screen
        calcprint(gagnumb, gagmass, pricepp, taxr); //calculate price before tax, discount, tax, and total price

    }

    public static void check( int numb, double mass, double pricepp, double taxrate )
    {
        // Exits program if the Number of Gadgets is less than zero
        if ( numb < 0 )
        {
            System.out.println("\nERROR: The number of Gadgets cannot be less than zero!");
            System.exit(101);
        }
        // Exits program if the Weight of the Gadget is less than zero
        else if ( mass < 0 )
        {
            System.out.println("\nERROR: The weight of the Gadget cannot be less than zero!");
            System.exit(102);
        }
        // Exits program if the Price per pound of Gadget is less than zero
        else if ( pricepp < 0 )
        {
            System.out.println(
              "\nERROR: The price per pound of the Gadget cannot be less than zero!");
            System.exit(103);
        }
        // Exits program if the tax rate is less than zero
        else if ( taxrate < 0 )
        {
            System.out.println("\nERROR: The tax rate cannot be less than zero!");
            System.exit(104);
        }
    }

    public static void printuserinput( int numb, double mass, double pricepp, double taxrate )
    {
        System.out.printf("\nNumber of Gadgets:\t%d Gadgets\n", numb); // prints Number of Gadgets
        System.out.printf("Weight of Gadget:\t%.2f lb\n", mass); // prints Weight of the Gadget
        System.out.printf("Price per Pound:\t$%.2f/lb\n", pricepp); // prints the price per pound of the Gadget
        System.out.printf("Tax Rate:\t\t%.2f%%\n", taxrate * 100); // prints the tax rate
    }

    public static void calcprint( int numb, double mass, double priceperpound, double taxrate )
    {
        // Set a Price before tax value equal to the product of the number, mass, and price per pound of the gadgets
        double pricebt = ( numb * mass * priceperpound );

        System.out.printf("\nSubtotal:\t\t$%.2f\n", pricebt); // print out the Price before Tax value

        // Value Discount if the purchase is of more than 100-pounds worth of Gadgets
        if ( ( numb * mass ) > 100 )
        {
            double valuediscount = pricebt * 0.1; // discount is 10% of the Price before tax
            pricebt = pricebt - valuediscount; // reset the Price before Tax to reflect the discount
            System.out.printf("Discount:\t\t$%.2f\n", valuediscount); // print the discount value
            System.out.printf("Subtotal with Discount:\t$%.2f\n", pricebt); // print the new Price before Tax value
        }

        double tax = pricebt * taxrate; // calculate the tax based on the current price before tax, and the tax rate
        double totalprice = pricebt + tax; //calculate the total price
        System.out.printf("Tax:\t\t\t$%.2f\n", tax); // prints the tax value
        System.out.printf("Total:\t\t\t$%.2f\n", totalprice); // prints the total value
    }

}
