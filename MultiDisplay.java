import java.awt.*;
import javax.swing.*;

public class MultiDisplay
{
  static JFrame frame;
  static JPanel panel;
  static JLabel label;
  
  public MultiDisplay()
  {
    EventQueue.invokeLater(new Runnable() {
            @Override
	           public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }
                frame = new JFrame("Multiplication Table Display");
	            panel = new MulTablePanel();
	            panel.setLayout(new GridBagLayout());
	            label = new JLabel(" ");
	            panel.setBackground(Color.pink);
	            Container con = frame.getContentPane();
	            con.add(panel);
	            //panel.add(label);
	            frame.setSize(400,400);
	            frame.setVisible(true);
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  }
	});
  }
  
  public static void main(String[]args)
  {
    
	  
	     new MultiDisplay();
	
	
  }
}