package calculator;

/**
 * This is the model of this MVC implementation of a calculator.
 * It performs the functions of the calculator and keeps track
 * of what the user has entered.
 * 
 * @author Tom Bylander
 */
public class CalculatorModel {
	/**
	 * This is the numeric value of the number the user is entering,
	 * or the number that was just calculated.
	 */
    private double displayValue;
    
    /**
	 * This is the previous value entered or calculated.
	 */
	private double internalValue;
	
	/**
	 * This is the String corresponding to what the user.
	 * is entering
	 */
	private String displayString;
	
	/**
	 * This is the last operation entered by the user.
	 */
	private String operation;
	
	/**
	 * This is true if the next digit entered starts a new value.
	 */
	private boolean start;
	
	/**
     * This is true if a decimal dot has been entered for the current value.
     */
    private boolean dot;

	/**
	 * Initializes the instance variables.
	 */
	public CalculatorModel() {
		displayValue = 0.0;
		displayString = "" + displayValue;
		internalValue = 0;
		dot = false;
		start = true;
		operation = "";
	}

	/**
	 * @return the String value of what was just calculated
	 * or what the user is entering
	 */
	public String getValue() {
		return displayString;
	}

	/**
	 * Updates the values maintained by the calculator based on the
	 * button that the user has just clicked.
	 * 
	 * @param text is the name of the button that the user has just clicked
	 */
	public void update(String text) {
	    if (start) {	
			internalValue = displayValue;
			displayValue = 0;
			displayString = "";
			start = false;
			dot = false;
		}
		if (text.length() == 1 && "0123456789".indexOf(text) >= 0) {
			displayString += text;
			displayValue = Double.valueOf(displayString);
		} else if (text.equals(".")) {
			if (! dot) {	
				dot = true;	
				if (displayString.equals("")) {
					displayString = "0";
				}
				displayString += ".";
			}
		} else if (text.equals("+/-")) { //Will negate current number
			displayValue *= -1;
			if(displayString.substring(0, 1).equals("-"))
				displayString = displayString.substring(1, displayString.length());
			else
				displayString = "-" + displayString;
		} else if (text.equals("x^2")) { //Will square the current number
			displayValue *= displayValue;
			displayString = "" + displayValue;
			dot = true;
		} else if (text.equals("sqrt")) { //Will square root the current number
			displayValue = Math.sqrt(displayValue);
			displayString = "" + displayValue;
			dot = true;
		} else if (text.equals("cbrt") && displayValue != 0) { //Will cube root the current number
			displayValue = Math.cbrt(displayValue);
			displayString = "" + displayValue;
			dot = true;
		} else if (text.equals("x!")) { //Will pass current value to factorial method
			displayValue = factorial(displayValue);
			displayString = "" + displayValue;
			dot = true;
		} else {
		    if (operation.equals("+")) {
				displayValue = internalValue + displayValue;
			} else if (operation.equals("-")) {
				displayValue = internalValue - displayValue;
			} else if (operation.equals("*")) {
				displayValue = internalValue * displayValue;
			} else if (operation.equals("/")) {
				displayValue = internalValue / displayValue;
			} else if (operation.equals("x^y")) { //Will raise internalValue to the power of displayValue
				displayValue = Math.pow(internalValue, displayValue);
			}
			displayString = "" + displayValue;
			// internalValue = displayValue;
			
			operation = text;
			
			start = true;
		}
	}
	
	/**
	 * Factorial method will calculate and return the factorial of d
	 * 
	 * @param d
	 * @return factorial of d
	 */
	
	public double factorial(double d) {
		double n = 1;
		for(double i = d; i > 1; i--){
			n *= i;
		}
		return n;
	}

	/**
	 * setStart allows other classes to set start boolean
	 * @param start
	 */
	
	public void setStart(boolean start) {
		this.start = start;
	}
	
	/**
	 * setDisplayValue allows other classes to set displayValue double
	 * @param displayValue
	 */

	public void setDisplayValue(double displayValue) {
		this.displayValue = displayValue;
	}
	
	/**
	 * setDisplayString allows other classes to set displayString String
	 * @param displayString
	 */

	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}
}
