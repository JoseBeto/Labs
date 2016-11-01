import javax.swing.*;

/**
 * You need to add an event handler that will switch the JPanels in the view
 * when the user clicks the button.
 * 
 * @author Tom Bylander
 */
public class PanelSwitcher {

	/**
	 * main method will create the view, model,
	 * 	and controller object.
	 * @param args
	 */
    public static void main(String[] args) {
        PanelSwitcherModel model = new PanelSwitcherModel();
        PanelSwitcherView view = new PanelSwitcherView();
        //Created controller object
        PanelSwitcherController controller = new PanelSwitcherController(view, model);
        //registered controller
        view.register(controller);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(400,300);
        view.setVisible(true);
    }

}
