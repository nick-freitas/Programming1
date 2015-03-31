package problem3;


/**
 * PriceCalc calculates the total price a customer has to pay based on the
 * gadgets they buy, along with the intermediate steps.
 *
 * <br/><br/>
 *
 * PriceCalc uses four variables in it's calculation: the number of gadgets
 * being purchased, the unit weight of an individual gadget, the price per pound
 * of the gadget and the tax rate. The greatest number of gadgets that can
 * purchased at any given time is 2,147,483,647 Gadgets.
 *
 * <br/><br/>
 *
 * PriceCalc also has three hard-coded constants: the minimum price per pound
 * that the user can input, the discount weight that will trigger the discount
 * if the weight of the user's purchase exceeds it, and the percentage that the
 * discount should be. By default the minimum price per pound is set at 1.99,
 * the discount weight is set at 100, and the discount percentage is set to 0.10
 * (10%).
 *
 * <br/><br/>
 *
 * PriceCalc has three constructors available: a no-argument constructor, a
 * two-argument constructor, and a four-argument constructor. The no-argument
 * constructor initializes all the variables to zero. The two-argument
 * constructor initializes the number of gadgets, and the unit weight to zero,
 * and initializes the price per pound and the tax rate to values hard-coded in
 * the constructor. By default these values are 19.99 for price per pound, and
 * 0.0625 (6.25%) for tax rate. The four-argument constructor initializes all
 * variables with their corresponding inputs.
 *
 * <br/><br/>
 *
 * The variables may be changed at any time by using their respective set
 * methods; setGadgetNumber(int n), setGadgetWeight (double w),
 * setPricePerPound(double p), and setTaxRate (double t). Since the variables
 * are private, set methods are the only to change them in PriceCalc.
 *
 * <br/><br/>
 *
 * Both variables and constants have get methods, which allows their values to
 * be returned; getGadgetNumber(), getGadgetWeight(), getPricePerPound(), get
 * getTaxRate(), getMinimumPricePerPound(), getDiscountWeight(), and
 * getDiscountPercentage().
 *
 * <br/><br/>
 *
 * The price before tax, the discount value, the tax, and the total, are
 * calculated at real time when they are needed by using their respective get
 * methods; getPriceBeforeTax(), getValueDiscount(), getTax(), and getTotal().
 * The greatest values can be for any of these is 1.7976931348623157e(308).
 *
 * <br/><br/>
 *
 * In order to properly determine whether or not the user should receive a
 * discount, the applyDiscount() boolean method will compare the weight of the
 * user's purchase to the weight that trigger the discount.
 *
 * <br/><br/>
 *
 * PriceCalc contains check methods to check if the variables have appropriate
 * values. For the number of gadgets, the unit weight of an individual gadget,
 * and the tax rate, the check methods make sure they are greater than zero. For
 * the price per pound, the check method makes sure the value is greater than or
 * equal to the minimum price per pound constant.
 *
 * <br/><br/>
 *
 * PriceCalc also contains a toString() method, which can return the total and
 * the calculated values as a formatted string.
 *
 * @author Nickolas Freitas
 */
public class PriceCalc
{

    // Variables
    private int gadgetNumber; // the number of gadgets
    private double gadgetWeight; // the weight of an individual gadget
    private double pricePerPound; // the price per pound of the gadgets
    private double taxRate; // the tax rate that will be used to calculate the tax

    // Constants
    private final double MINIMUM_PPP = 1.99; // the minimum price per pound that the user can set
    private final double DISCOUNT_WEIGHT = 100; // the weight of the gadgets that, if exceeded, will generate a value discount
    private final double DISCOUNT_PERCENTAGE = 0.10; // the value discount percentage

    // Constructors
    /**
     * No-argument constructor.
     * <br/><br/>
     * Calls the 4-argument constructor; and passes 0 in for numb, weight, ppp,
     * and tr.
     */
    public PriceCalc()
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
    public PriceCalc( int numb, double weight )
    {
        this(numb, weight, 19.99, .0625);
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
    public PriceCalc( int numb, double weight, double ppp, double tr )
    {
        gadgetNumber = numb;
        gadgetWeight = weight;
        pricePerPound = ppp;
        taxRate = tr;
    }

    // Set Methods
    /**
     * Changes the number of gadgets.
     *
     * @param numb The number of gadgets. Argument is an integer.
     */
    public void setGadgetNumber( int numb )
    {
        gadgetNumber = numb;
    }

    /**
     * Changes the weight of the gadget.
     *
     * @param weight The weight of the gadget. Argument is a double.
     */
    public void setGadgetWeight( double weight )
    {
        gadgetWeight = weight;
    }

    /**
     * Changes the price per pound.
     *
     * @param ppp The price per pound. Argument is a double.
     */
    public void setPricePerPound( double ppp )
    {
        pricePerPound = ppp;
    }

    /**
     * Changes the tax rate.
     *
     * @param tr The tax rate. Argument is a double.
     */
    public void setTaxRate( double tr )
    {
        taxRate = tr;
    }

    // Get Methods
    /**
     * Returns the number of gadgets.
     *
     * @return Returns the number of gadgets as an integer.
     */
    public int getGadgetNumber()
    {
        return gadgetNumber;
    }

    /**
     * Returns the weight of the gadgets.
     *
     * @return Returns the weight of the gadgets as a double.
     */
    public double getGadgetWeight()
    {
        return gadgetWeight;
    }

    /**
     * Returns the price per pound.
     *
     * @return Returns the price per pound as a double.
     */
    public double getPricePerPound()
    {
        return pricePerPound;
    }

    /**
     * Returns the tax rate.
     *
     * @return Returns the tax rate as a double.
     */
    public double getTaxRate()
    {
        return taxRate;
    }

    /**
     * Returns the minimum price per pound.
     *
     * @return Returns the minimum price per pound as a double.
     */
    public double getMinimumPricePerPound()
    {
        return MINIMUM_PPP;
    }

    /**
     * Returns the discount weight.
     *
     * @return Returns the discount weight as a double.
     */
    public double getDiscountWeight()
    {
        return DISCOUNT_WEIGHT;
    }

    /**
     * Returns the discount percentage.
     *
     * @return Returns the discount percentage as a double.
     */
    public double getDiscountPercentage()
    {
        return DISCOUNT_PERCENTAGE;
    }

    //Calculate and Get Methods
    /**
     * Calculates and return the price before tax, as the product of the number
     * of gadgets, the weight of the gadget, and the price per pound.
     *
     * @return Returns the price before tax as a double.
     */
    public double getPriceBeforeTax()
    {
        return ( getGadgetNumber() * getGadgetWeight() * getPricePerPound() );
    }

    /**
     * Calculates and returns the value discount.
     * <br/><br/>
     * Calculates and return the value discount, as the product of the price
     * before tax, and the discount percentage.
     *
     * @return Returns the value discount as a double.
     */
    public double getValueDiscount()
    {
        return ( getPriceBeforeTax() * getDiscountPercentage() );
    }

    /**
     * Calculates and returns the tax.
     * <br/><br/>
     * Calculates and returns the tax, as a product of the price before tax and
     * the tax rate, applying a discount if applicable to the price before tax
     * before the calculation occurs.
     *
     * @return Returns the tax value as a double.
     */
    public double getTax()
    {
        if ( applyDiscount() )
        {
            return ( ( getPriceBeforeTax() - getValueDiscount() ) * getTaxRate() );
        }
        else
        {
            return ( getPriceBeforeTax() * getTaxRate() );
        }
    }

    /**
     * Calculates and returns the total.
     * <br/><br/>
     * Calculates and return the total, as the the price before tax, minus the
     * value discount if applicable, plus the tax
     *
     * @return Returns the total as a double.
     */
    public double getTotal()
    {
        if ( applyDiscount() )
        {
            return ( ( getPriceBeforeTax() - getValueDiscount() ) + getTax() );
        }
        else
        {
            return ( getPriceBeforeTax() + getTax() );
        }
    }

    //applyDiscount Method
    /**
     * Determine whether or not to apply a discount.
     * <br/><br/>
     * Determine whether or not to apply a discount based whether or not the
     * weight of the gadgets exceeds the discount weight requirement.
     * <br/>
     * Returns true if a discount should be applied. Returns false if discount
     * should not be applied.
     *
     * @return Return true, if the weight of the gadgets exceeds the discount
     *         weight requirement. Returns false otherwise.
     */
    public boolean applyDiscount()
    {
        return ( ( getGadgetNumber() * getGadgetWeight() ) > getDiscountWeight() );
    }

    //Check Methods
    /**
     * Checks if the number of gadgets are greater than zero.
     *
     * @return Returns true if the number of gadgets are greater than zero.
     *         Returns false otherwise
     */
    public boolean checkGadgetNumber()
    {
        return ( getGadgetNumber() > 0 );
    }

    /**
     * Checks if the weight of the gadget is greater than zero.
     *
     * @return Returns true if the weight of the gadget is greater than zero.
     *         Returns false otherwise
     */
    public boolean checkGadgetWeight()
    {
        return ( getGadgetWeight() > 0 );
    }

    /**
     * Checks if the price per pound is greater than or equal to the minimum
     * price per pound.
     *
     * @return Returns true if the price per pound is greater than or equal to
     *         the minimum price per pound. Returns false otherwise
     */
    public boolean checkPricePerPound()
    {
        return ( getPricePerPound() >= getMinimumPricePerPound() );
    }

    /**
     * Checks if the tax rate is greater than zero.
     *
     * @return Returns true if the tax rate is greater than zero. Returns false
     *         otherwise
     */
    public boolean checkTaxRate()
    {
        return ( getTaxRate() > 0 );
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
     * <td><b>(only if applicable)</b></td>
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
        /*
         * Creates a an empty result stringBuilder and depending on whether or
         * not applyDiscount() is true or false, the calculated values, and the
         * total are appended to the stringBuilder. In the end the result
         * stringBuilder is converted to a string and returned.
         */
        if ( applyDiscount() )
        {
            result.append(String.format("Subtotal:\t\t$%.2f\n", getPriceBeforeTax()));
            result.append(String.format("Discount:\t\t$%.2f\n", getValueDiscount()));
            result.append(String.format("Tax:\t\t\t$%.2f\n", getTax()));
            result.append(String.format("Total:\t\t\t$%.2f", getTotal()));
        }
        else
        {
            result.append(String.format("Subtotal:\t\t$%.2f\n", getPriceBeforeTax()));
            result.append(String.format("Tax:\t\t\t$%.2f\n", getTax()));
            result.append(String.format("Total:\t\t\t$%.2f", getTotal()));
        }
        return result.toString();
    }
}
