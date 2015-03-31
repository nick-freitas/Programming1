package problem5;


/**
 * PriceCalc V2 adds functionality to our original PriceCalc Class.
 * <br/><br/>
 * PriceCalc V2 adds Shipping and Box Costs, while reworking the discount
 * system.
 *
 * @author nick
 */
public class PriceCalcV2 extends PriceCalc
{

    //Array Constants
    private final int[] DISCOUNT_GADGET_NUMBER =
    {
        1000, 500, 200, 100, 50, 25, 0
    };
    private final double[] DISCOUNT_PERCENTAGE =
    {
        .30, .25, .20, .15, .10, .05, 0
    };
    private final int[] SHIPPING_WEIGHT =
    {
        1000, 500, 100, 50, 10, 0
    };
    private final double[] SHIPPING_COST =
    {
        30, 20, 12, 8, 4, 2
    };
    private final int[][] BOX_UNIT_WEIGHT =
    {
        {
            50, 10
        },
        {
            40, 0
        }
    }; //{MAX,MIN}
    private final int[] BOX_FIXED_COST =
    {
        4, 2
    };

    //Constants
    private final double HANDLING = 2.95;

    //Constructors
    /**
     * No-argument constructor.
     * <br/><br/>
     * Calls the 4-argument constructor; and passes 0 in for numb, weight, ppp,
     * and tr.
     */
    public PriceCalcV2()
    {
        this(0, 0, 0, 0);
    }

    /**
     * 2-argument constructor.
     * <br/><br/>
     * Calls the 4-argument constructor; passes 0 in for numb, and weight;
     * passes 19.99 in for ppp; and passes 0.0625 in for tr.
     *
     * @param numb   The number of gadgets. Argument is an integer.
     * @param weight The weight of the gadget. Argument is a double.
     */
    public PriceCalcV2( int numb, double weight )
    {
        this(numb, weight, 9.99, .0625);
    }

    /**
     * 4-argument constructor.
     *
     * Initializes the number of gadgets, the weight of the gadget, the price
     * per pound of the gadget, and the tax rate.
     *
     * @param numb   The number of gadgets. Argument is an integer.
     * @param weight The weight of the gadget. Argument is a double.
     * @param ppp    The price per pound. Argument is a double.
     * @param tr     The tax rate. Argument is a double.
     */
    public PriceCalcV2( int numb, double weight, double ppp, double tr )
    {
        setGadgetNumber(numb);
        setGadgetWeight(weight);
        setPricePerPound(ppp);
        setTaxRate(tr);
    }

    //Overriden Methods
    @Override
    /**
     * Uses the previously defined Discount Arrays, to provide a discount
     * dependent on the number of gadgets being purchased.
     * <br/><br/>
     * Goes through the array from max to min and gives a discount when the
     * number of gadgets are greater than or equal to the value in the array.
     */
    public double getValueDiscount()
    {
        for ( int i = 0; i < DISCOUNT_GADGET_NUMBER.length; i++ )
        {
            if ( getGadgetNumber() >= DISCOUNT_GADGET_NUMBER[i] )
            {
                return getSubtotal() * DISCOUNT_PERCENTAGE[i];
            }
        }
        System.exit(7200);
        return -1;
    }

    @Override
    public double getPretax()
    {
        return getSubtotal() - getValueDiscount() +
          getShipping() + getBoxCost();
    }

    @Override
    public double getTax()
    {
        return getPretax() * getTaxRate();
    }

    @Override
    public double getTotal()
    {
        return getPretax() * ( 1 + getTaxRate() );
    }

    //New Methods
    /**
     * Determines the Shipping cost by comparing the total weight to the
     * shipping values in the array, and adding a handling charge to it.
     *
     * @return Total shipping as a double value.
     */
    public double getShipping()
    {
        for ( int i = 0; i < SHIPPING_WEIGHT.length; i++ )
        {
            if ( getTotalGadgetWeight() >= SHIPPING_WEIGHT[i] )
            {
                return HANDLING + SHIPPING_COST[i];
            }
        }
        System.exit(7300);
        return -1;
    }

    /**
     * Uses the Box Unit Weight array to determine how many of each box is
     * needed.
     *
     * @return An array of how many boxes are needed, separated by weight
     */
    public int[] getBoxNumber()
    {
        int number[] = new int[BOX_UNIT_WEIGHT[0].length];
        double weight = getTotalGadgetWeight();
        for ( int i = 0; i < BOX_UNIT_WEIGHT[0].length; i++ )
        {
            number[i] = ( int ) ( weight / BOX_UNIT_WEIGHT[0][i] );
            weight = weight - number[i] * BOX_UNIT_WEIGHT[0][i];
            if ( weight >= BOX_UNIT_WEIGHT[1][i] && weight != 0 )
            {
                number[i]++;
                weight = 0;
            }
        }
        return number;
    }

    /**
     * Return the total cost of the box.
     * <br/><br/>
     * Goes through the Array of Box Number and Box Cost, and gives a total cost
     * depending on the number of boxes that need to be used.
     *
     * @return returns the total Box Cost as a double
     */
    public double getBoxCost()
    {
        double cost = 0;
        int[] BoxNumber = getBoxNumber();
        for ( int i = 0; i < BoxNumber.length; i++ )
        {
            cost += BoxNumber[i] * BOX_FIXED_COST[i];
        }
        return cost;
    }

    //toString Method
    /**
     * Creates a formatted string with the final calculated values along with
     * their respective fields.
     * <br/><br/>
     * String is formatted accordingly:
     * <br/><br/>
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
     * <td>Shipping:</td>
     * <td>CALCULATED_VALUE</td>
     * </tr>
     * <tr>
     * <td>Box Cost:</td>
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
     * @return Returns the final calculated values with their respective fields
     *         in a formatted String.
     */
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Subtotal:\t\t$%.2f\n", getSubtotal()));
        result.append(String.format("Discount:\t\t$%.2f\n", getValueDiscount()));
        result.append(String.format("Shipping:\t\t$%.2f\n", getShipping()));
        result.append(String.format("Box Cost:\t\t$%.2f\n", getBoxCost()));
        result.append(String.format("Tax:\t\t\t$%.2f\n", getTax()));
        result.append(String.format("Total:\t\t\t$%.2f", getTotal()));
        return result.toString();
    }
}
