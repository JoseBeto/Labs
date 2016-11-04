import java.io.IOException;
import javax.swing.JFrame;

/**
 * Fig. 15.13: JFileChooserTest.java Tests class JFileChooserDemo.
 * 
 * @author Deitel & Associates, Inc.
 */
public class JFileChooserTest {
    /**
     * main method
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        JFileChooserDemo application = new JFileChooserDemo();
        application.setSize(400, 400);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
} // end class JFileChooserTest
