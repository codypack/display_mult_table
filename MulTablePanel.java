import java.awt.*;
import javax.swing.*;


public class MulTablePanel extends JPanel implements Runnable
{
  static JLabel label;
  String labelText;
  Thread thread;
  public MulTablePanel()
  {
    label = new JLabel();
	label.setFont(new Font("Times New Roman", Font.BOLD, 100));
	label.setForeground(Color.red);
    add(label);
    labelText = label.getText();
	thread = new Thread(this);
	thread.start();
	
	
  }
  
  public void paintComponent( Graphics g )
  {
    super.paintComponent( g );
	
	
  }
  public void run()
  {
    while(true)
	{
	
	String times = generateTable();
	
	String[] tableChars = times.split(" ");
	 for(int k = 0; k < tableChars.length; k++)
	 {
	   try
	   {
	   label.setText(labelText+=tableChars[k]);
	  
	   if(k % 5 == 0)
	    labelText = "";
		
	   Thread.sleep(1000);
	    repaint();
	   
	   //if(k % 5 == 0)
	   //System.out.print("\t");
	   
	   }
	   catch(InterruptedException e)
	   {
	     System.out.println("Thread interrupted");
	   }
	 }
	
	}
  }
  public String generateTable()
  {
     StringBuffer table = new StringBuffer();
    int j;
    for (int i=1;i<=12;i++){
     for (j=1;j<=12;j++)
	 table.append(" " + i + " " + "X" + " " + j + " = " + (i * j) );
	}
	String results = table.toString();
	
	return results;
  }
}
		  
		  
		  
		  
			 
			 
			 
			 
			 
			 
			 
			 
			