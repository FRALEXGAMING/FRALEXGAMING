package at.fralexgaming;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

	static JFrame frame;

	  public static void main(String[] args)
	  {
	    
		  SSHConnect.main("pi", "raspberrypi", "root", "gpio mode 1 out");

	  
	    frame = new JFrame("LED Controll");

	    // create our jbutton
	    JButton ButtonOn = new JButton("EIN");
	    JButton ButtonOff = new JButton("AUS");
	    JButton ButtonBlinc = new JButton("BLINCKEN");
	    // add the listener to the jbutton to handle the "pressed" event
	    ButtonOn.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        SSHConnect.main("pi", "raspberrypi", "root", "gpio write 1 1");
	      }
	    });
	    ButtonOff.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        SSHConnect.main("pi", "raspberrypi", "root", "gpio write 1 0");
	      }
	    });
	    ButtonBlinc.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  for(int i=0; i<5; i++)
	    	  {
	    		  SSHConnect.main("pi", "raspberrypi", "root", "gpio write 1 1");
	    		  SSHConnect.main("pi", "raspberrypi", "root", "gpio write 1 0");

	    	  }
	        
	      }
	    });

	    // put the button on the frame
	    frame.getContentPane().setLayout(new FlowLayout());
	    frame.add(ButtonOn);
	    frame.add(ButtonOff);
	    frame.add(ButtonBlinc);

	    // set up the jframe, then display it
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	  }
	

	}

