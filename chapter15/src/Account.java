
// Fig. 15.9: Account.java
// Serializable Account class for storing records as objects.
import java.io.Serializable;

/**
 * Fig. 15.9: Account.java Serializable Account class for storing records as
 * objects.
 * 
 * @author Deitel & Associates, Inc.
 */
public class Account implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    /**
     * initializes an Account with default values
     */
    public Account() {
        this(0, "", "", 0.0); // call other constructor
    }

    /**
     * initializes an Account with provided values
     * 
     * @param account
     * @param firstName
     * @param lastName
     * @param balance
     */
    public Account(int account, String firstName, String lastName,
            double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    /**
     * set account number
     * 
     * @param acct
     */
    public void setAccount(int acct) {
        this.account = account;
    }

    /**
     * get account number
     * 
     * @return
     */
    public int getAccount() {
        return account;
    }

    /**
     * set first name
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get first name
     * 
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set last name
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get last name
     * 
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set balance
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * get balance
     * 
     * @return
     */
    public double getBalance() {
        return balance;
    }
} // end class AccountRecordSerializable
