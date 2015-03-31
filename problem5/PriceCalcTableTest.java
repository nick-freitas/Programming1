package problem5;


import java.util.Scanner;

/**
 * PriceCalc Table Test class.
 *
 * <br/><br/>
 *
 * This purpose of this class is to print a table comparing the cost of gadgets
 * with varying number, weights, unit weights, and tax rates.
 *
 * <br/><br/>
 * For each iteration of a unit weight and a tax rate, three tables are printed:
 * one with the price with the Discount but without Shipping, Box Cost, and
 * Taxes; one with the price with the Discount, Shipping, and Box Cost but
 * without Taxes; and one with the total price with the Discount, Shipping, Box
 * Cost and Taxes.
 *
 * <br/><br/>
 * The First Table will look like this:
 * <br /><br />
 *
 * <table>
 * <tr>
 * <td colspan="6">Price w/ Discount w/o Shipping, Box Cost, Taxes</td>
 * </tr>
 * <tr>
 * <td>Weight:</td>
 * <td align="right">1</td>
 * <td align="right">2</td>
 * <td align="right">3</td>
 * <td align="right">4</td>
 * <td align="right">5</td>
 * </tr>
 * <tr>
 * <td>Number:</td>
 * </tr>
 * <tr>
 * <td align="right">2</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">4</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">8</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">16</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">32</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">64</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">128</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">256</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">512</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">1024</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * </table>
 *
 * <br/><br/>
 * The Second Table will look like this:
 * <br /><br />
 * <table>
 * <tr>
 * <td colspan="6">Price w/ Discount, Shipping, Box Cost w/o Taxes</td>
 * </tr>
 * <tr>
 * <td>Weight:</td>
 * <td align="right">1</td>
 * <td align="right">2</td>
 * <td align="right">3</td>
 * <td align="right">4</td>
 * <td align="right">5</td>
 * </tr>
 * <tr>
 * <td>Number:</td>
 * </tr>
 * <tr>
 * <td align="right">2</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">4</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">8</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">16</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">32</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">64</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">128</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">256</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">512</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">1024</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * </table>
 *
 *
 * <br/><br/>
 * The Third Table will look like this:
 * <br /><br />
 *
 *
 * <table>
 * <tr>
 * <td colspan="6">Total Price w/ Discount, Shipping, Box Cost &amp; Taxes</td>
 * </tr>
 * <tr>
 * <td>Weight:</td>
 * <td align="right">1</td>
 * <td align="right">2</td>
 * <td align="right">3</td>
 * <td align="right">4</td>
 * <td align="right">5</td>
 * </tr>
 * <tr>
 * <td>Number:</td>
 * </tr>
 * <tr>
 * <td align="right">2</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">4</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">8</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">16</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">32</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">64</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">128</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">256</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">512</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * <tr>
 * <td align="right">1024</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * <td align="right">VALUE</td>
 * </tr>
 * </table>
 *
 * @author Nickolas Freitas
 */
public class PriceCalcTableTest
{

    public static void main( String[] args )
    {

        //Import Scanner for User Inputs
        Scanner input = new Scanner(System.in);

        //Hard-Coded Constant Arrays
        final int gadgetWeight[] =
        {
            1, 2, 3, 4, 5
        };
        final int gadgetNumber[] =
        {
            2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
        };
        final double pricePerPound[] =
        {
            1.00, 2.00, 3.00, 4.00, 5.00
        };
        final double taxRate[] =
        {
            0.01, 0.03, 0.05, 0.0625, .07
        };

        //Create Price Calc Object with PPP and Tax Rate set
        PriceCalc PObj = new PriceCalcV2();

        //Loop
        for ( int p = 0; p < pricePerPound.length; p++ )
        {
            PObj.setPricePerPound(pricePerPound[p]);
            for ( int t = 0; t < taxRate.length; t++ )
            {
                PObj.setTaxRate(taxRate[t]);

                //Print the PPP and Tax Rate that will be used to create the table
                System.out.println();
                System.out.printf("%s%.2f\n", "Price Per Pound: ", pricePerPound[p]);
                System.out.printf("%s%.2f%%\n", "Tax Rate: ", taxRate[t] * 100);
                System.out.println();

                //Tables
                //Price w/ Discount w/o Shipping, Box Cost, Taxes
                System.out.println("Price w/ Discount w/o Shipping, Box Cost, & Taxes");
                System.out.printf("%s\t", "Weight:");
                for ( int c = 0; c < gadgetWeight.length; c++ )
                {
                    System.out.printf("%20d", gadgetWeight[c]);
                }
                System.out.println();
                System.out.printf("%s\n", "Number:");
                for ( int n = 0; n < gadgetNumber.length; n++ )
                {
                    PObj.setGadgetNumber(gadgetNumber[n]);
                    System.out.printf("%d\t", gadgetNumber[n]);
                    for ( int w = 0; w < gadgetWeight.length; w++ )
                    {
                        PObj.setGadgetWeight(gadgetWeight[w]);
                        System.out.
                          printf("%20.2f", ( PObj.getSubtotal() - PObj.getValueDiscount() ));
                    }
                    System.out.println();
                }
                System.out.println();

                //Price w/ Discount, Shipping, Box Cost w/o Taxes
                System.out.println("Price w/ Discount, Shipping, & Box Cost w/o Taxes");
                System.out.printf("%s\t", "Weight:");
                for ( int c = 0; c < gadgetWeight.length; c++ )
                {
                    System.out.printf("%20d", gadgetWeight[c]);
                }
                System.out.println();
                System.out.printf("%s\n", "Number:");
                for ( int n = 0; n < gadgetNumber.length; n++ )
                {
                    PObj.setGadgetNumber(gadgetNumber[n]);
                    System.out.printf("%d\t", gadgetNumber[n]);
                    for ( int w = 0; w < gadgetWeight.length; w++ )
                    {
                        PObj.setGadgetWeight(gadgetWeight[w]);
                        System.out.printf("%20.2f", ( PObj.getPretax() ));
                    }
                    System.out.println();
                }
                System.out.println();

                //Total Price
                System.out.println("Total Price w/ Discount, Shipping, Box Cost & Taxes");
                System.out.printf("%s\t", "Weight:");
                for ( int c = 0; c < gadgetWeight.length; c++ )
                {
                    System.out.printf("%20d", gadgetWeight[c]);
                }
                System.out.println();
                System.out.printf("%s\n", "Number:");
                for ( int n = 0; n < gadgetNumber.length; n++ )
                {
                    PObj.setGadgetNumber(gadgetNumber[n]);
                    System.out.printf("%d\t", gadgetNumber[n]);
                    for ( int w = 0; w < gadgetWeight.length; w++ )
                    {
                        PObj.setGadgetWeight(gadgetWeight[w]);
                        System.out.printf("%20.2f", ( PObj.getTotal() ));
                    }
                    System.out.println();
                }
            }
        }

    }
}
