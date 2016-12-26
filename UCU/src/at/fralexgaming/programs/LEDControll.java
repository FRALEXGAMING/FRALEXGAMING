package at.fralexgaming.programs;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import at.fralexgaming.networking.SSHConnect;

public class LEDControll {

	static JFrame frame;

	public static void main() {

		frame = new JFrame("LED Controll");

		// create our jbutton
		JButton ButtonOn = new JButton("EIN");
		JButton ButtonOff = new JButton("AUS");
		// add the listener to the jbutton to handle the "pressed" event
		ButtonOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SSHConnect.SSH("pi", "raspberrypi", "root", "gpio write 1 1");
			}
		});
		ButtonOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SSHConnect.SSH("pi", "raspberrypi", "root", "gpio write 1 0");
			}
		});

		// put the button on the frame
		frame.getContentPane().setLayout(new FlowLayout());
		frame.add(ButtonOn);
		frame.add(ButtonOff);

		// set up the jframe, then display it
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}