import java.awt.event.*;

/**
 * PanelSwitcherController class will switch between view
 * 	panels when the button is pressed.
 * 
 * @author Jose Bocanegra
 *
 */
public class PanelSwitcherController implements ActionListener{

	private PanelSwitcherView view;
	private PanelSwitcherModel model;
	
	@Override
	/**
	 * actionPerformed switch panels when
	 * 	the button is pressed.
	 */
	public void actionPerformed(ActionEvent event) {
		model.switchPanel();
		view.displayPanel(model.whichPanel());
	}
	
	/**
	 * PanelSwitcherController constructor will initialize view and
	 * 	model to its own view and model.
	 * 
	 * @param view
	 * @param model
	 */
	public PanelSwitcherController(PanelSwitcherView view, PanelSwitcherModel model){
		this.view = view;
		this.model = model;
	}

}
