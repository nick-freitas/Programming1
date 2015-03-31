package problem4;


import java.util.Scanner;

/**
 * PriceCalc test class.
 *
 * <br/><br/>
 *
 * This purpose of this class is test if PriceCalc is working and also to serve
 * as an example of how PriceCalc could be implemented.
 *
 * <br/><br/>
 *
 * The user is prompted to input a positive whole number integer for: the number
 * of Gadgets; and a positive number for: the weight of the Gadget, the price
 * per pound of the Gadget, and the tax rate. User input is taken from a
 * keyboard. And outputs, are outputted to the screen. Note: PriceCalc itself is
 * not limited to a CLI.
 *
 * <br/><br/>
 *
 * Once the user has input the purchase values, a PriceCalc object will be
 * created initializing the PriceCalc variables to user inputs.
 *
 * <br/><br/>
 *
 * The input variables are then checked to make sure their values are
 * appropriate. If any value is not appropriate, the user will be alerted and
 * asked to fix the error.
 *
 * <br/><br/>
 *
 * After input number have been checked and found to be appropriate numbers,
 * they be will display in the following format:
 *
 * <br/><br/>
 *
 * <table>
 * <tr>
 * <td>Number of Gadgets:</td>
 * <td>INPUT_VALUE Gadgets</td>
 * </tr>
 * <tr>
 * <td>Weight of Gadget:</td>
 * <td>INPUT_VALUE lb</td>
 * </tr>
 * <tr>
 * <td>Price per Pound:</td>
 * <td>$ INPUT_VALUE /lb </td>
 * </tr>
 * <tr>
 * <td>Tax Rate:</td>
 * <td>INPUT_VALUE %</td>
 * </tr>
 * </table>
 *
 * <br/><br/>
 *
 * If user is eligible for a discount, this program will print a line telling
 * that they have received a discount.
 *
 * <br/><br/>
 *
 * PriceCalc's toString() is then printed out providing the user with the
 * subtotal, the discount (if applicable), the tax, and the total due. The
 * output will either look like this:
 *
 * <br/><br/>
 *
 * <table>
 * <tr>
 * <td>Subtotal:</td>
 * <td>CALCULATED_VALUE</td>
 * </tr>
 * <tr>
 * <td>Tax:</td>
 * <td>CALCULATED_VALUE</td>
 * </tr>
 * <tr>
 * <td>Total:</td>
 * <td>CALCULATED_VALUE</td>
 * </tr>
 * </table>
 *
 * <br/>
 * or this:
 * <br/><br/>
 *
 * <table>
 * <tr>
 * <td>Subtotal:</td>
 * <td>CALCULATED_VALUE</td>
 * </tr>
 * <tr>
 * <td>Discount:</td>
 * <td>CALCULATED_VALUE</td>
 * </tr>
 * <tr>
 * <td>Tax:</td>
 * <td>CALCULATED_VALUE</td>
 * </tr>
 * <tr>
 * <td>Total:</td>
 * <td>CALCULATED_VALUE</td>
 * </tr>
 * </table>
 *
 * <br/>
 * depending on whether or not there will be a discount.
 *
 * @author Nickolas Freitas
 */
public class PriceCalcTest
{

    public static void main( String[] args )
    {

        //Import Scanner for User Inputs
        Scanner input = new Scanner(System.in);

        //Prompts User for Inputs and stores them in temporary variables
        System.out.printf("Please enter the number of Gadgets:\n");
        int gadgetNumber = input.nextInt();
        System.out.printf("Please enter the weight of the Gadget:\n");
        double gadgetWeight = input.nextDouble();
        System.out.printf("Please enter the price per pound of the Gadget:\n");
        double pricePerPound = input.nextDouble();
        System.out.printf("Please enter the tax rate:\n");
        double taxRate = ( input.nextDouble() ) / 100;

        //Creates a PriceCalc object, with temporary variables
        PriceCalc PC = new PriceCalcV2(gadgetNumber, gadgetWeight, pricePerPound, taxRate);

        //Checks if the user inputs are appropriate and asks users to change them if they aren't
        while ( !PC.checkGadgetNumber() )
        {
            System.out.println("\nERROR: The number of Gadgets cannot be less than zero!");
            System.out.printf("Please enter another number of Gadgets:\n");
            PC.setGadgetNumber(input.nextInt());
        }
        while ( !PC.checkGadgetWeight() )
        {
            System.out.println("\nERROR: The weight of the Gadget cannot be less than zero!");
            System.out.printf("Please enter another weight of the Gadget:\n");
            PC.setGadgetWeight(input.nextDouble());
        }
        while ( !PC.checkPricePerPound() )
        {
            System.out.printf(
              "\nERROR: The price per pound of the Gadget cannot be less than %.2f!\n",
              PC.getMinimumPricePerPound());
            System.out.printf("Please enter another price per pound of the Gadget:\n");
            PC.setPricePerPound(input.nextDouble());
        }
        while ( !PC.checkTaxRate() )
        {
            System.out.println("\nERROR: The tax rate cannot be less than zero!");
            System.out.printf("Please enter another tax rate:\n");
            PC.setTaxRate(input.nextDouble() / 100);
        }

        // Prints user input to the screen
        System.out.println();
        System.out.printf("Number of Gadgets:\t%d Gadgets\n", PC.getGadgetNumber());
        System.out.printf("Weight of Gadget:\t%.2f lb\n", PC.getGadgetWeight());
        System.out.printf("Price per Pound:\t$%.2f/lb\n", PC.getPricePerPound());
        System.out.printf("Tax Rate:\t\t%.2f%%\n", PC.getTaxRate() * 100);

        //Prints the total, along with the intermediates steps
        //Prints a formatted String with the final calculated values with their respective fields.
        System.out.println();
        System.out.println(PC.toString());
    }
}
