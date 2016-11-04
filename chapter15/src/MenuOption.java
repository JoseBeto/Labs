/**
 * Fig. 15.7: MenuOption.java. enum type for the credit-inquiry program's
 * options.
 * 
 * @author Deitel & Associates, Inc.
 *
 */

public enum MenuOption {
    /**
     * declare contents of enum type
     */
    ZERO_BALANCE(1), CREDIT_BALANCE(2), DEBIT_BALANCE(3), END(4);

    /**
     * current menu option
     */
    private final int value;

    /**
     * constructor
     * @param value
     */
    private MenuOption(int value) {
        this.value = value;
    }
} // end enum MenuOption
