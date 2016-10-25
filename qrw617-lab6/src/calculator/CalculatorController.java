package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The CalculatorController class is the controller in this
 * MVC implementation of a calculator.  Its sole function is
 * to interpret events from the GUI and update instances of 
 * CalculatorModel and CalculatorView as appropriate.
 * 
 * @author Tom Bylander
 */
public class CalculatorController implements ActionListener {
    /** 
     * The model of this MVC implementation of a calculator. 
     */
	private CalculatorModel model;
	
	/** 
	 * The view of this MVC implementation of a calculator. 
	 */
	private CalculatorView view;
	
	/**
	 * This saves the model and and view.
	 * 
	 * @param model a CalculatorModel for the functions of the calculator and the values
	 * entered by the user
	 * @param view a CalculatorView for what should be displayed in the GUI
	 */
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * Determines what to do with the event generated by the GUI.
	 * The event could correspond to a menu item or a button.
	 * The model and the view are updated as appropriate.
	 *  
	 * @param e an event from the GUI
	 */
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Exit")) {
			System.exit(0);
		} else if(command.equals("<-")){ //This will erase a single number from current number
			String str = model.getDisplayString();
			str = str.substring(0, str.length()-1);
			model.setDisplayString(str);
			model.setDisplayValue(Double.valueOf(str));
			view.update(str);
		} else if(command.equals("CE")) { //This will erase the entire current number
			model.setDisplayString("");
			model.setDisplayValue(0.0);
			view.update("0.0");
		} else if(command.equals("C")) { //This will erase everything, basically restart the application
			model.setStart(true);
			model.update("");
			view.update("0.0");
		} else if (command.equals("Two Decimal Digits")) {
			view.setDigits(2);
			view.update(model.getValue());
		} else if (command.equals("Any Decimal Digits")) {
			view.setDigits(-1);
			view.update(model.getValue());
		} else {
			model.update(command);
			view.update(model.getValue());
		}
	}
}
