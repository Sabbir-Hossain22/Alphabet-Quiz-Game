package Alpha3;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class instruction extends JFrame implements ActionListener{
	JLabel instruc1 = new JLabel("Welcome to Alphabet Quiz Game");
	JLabel instruc2 = new JLabel("1. There will be 10 different questions");
	JLabel instruc3 = new JLabel("2. Each question will give 1 mark will be added to right counter");
	JLabel instruc4 = new JLabel("5. If you make mistake it will be added to the left counter");
	JLabel instruc5 = new JLabel("6. Remarks will be given below for right and wrong answer");
	Container c;
	JButton Back = new JButton("Back");
	
	Font allFont = new Font("Tahoma",Font.BOLD, 38);
	
	public instruction() {
		c = getContentPane();
		c.setLayout(null);
		instruc1.setForeground(new Color(128, 128, 255));
		
		instruc1.setFont(allFont);
		instruc1.setBounds(246, 22, 642, 100);
		c.add(instruc1);
		
		instruc2.setFont(new Font("Tahoma", Font.BOLD, 30));
		instruc2.setBounds(103, 90, 669, 100);
		c.add(instruc2);
		
		instruc3.setFont(new Font("Tahoma", Font.BOLD, 30));
		instruc3.setBounds(103, 159, 992, 100);
		c.add(instruc3);
		
		instruc4.setFont(new Font("Tahoma", Font.BOLD, 30));
		instruc4.setBounds(103, 391, 1020, 100);
		c.add(instruc4);
		
		instruc5.setFont(new Font("Tahoma", Font.BOLD, 30));
		instruc5.setBounds(103, 464, 923, 100);
		c.add(instruc5);
		
		Back.addActionListener(this);
		Back.setBounds(426, 576, 194, 66);
		c.add(Back);

		Back.setFont(allFont);
		
		JLabel lblThereWill = new JLabel("3. There will be three different level [ Easy, Medium, Hard ]");
		lblThereWill.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblThereWill.setBounds(103, 235, 1020, 100);
		getContentPane().add(lblThereWill);
		
		JLabel lblThereWill_2 = new JLabel("4. There will be hint for each question");
		lblThereWill_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblThereWill_2.setBounds(103, 316, 1020, 100);
		getContentPane().add(lblThereWill_2);
		Back.addActionListener(this);
		
		
		setTitle("Alphabet Game For Kids"); //title of the game in window bar
		setSize(1227,688); //window size
		setLocation(900,100); //sets location on the screen
		setResizable(true); //now max or minimum sizable 
		setVisible(true); //will be shown on screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Back) {
			new menu();
			dispose();
		}
		
	}
	public static void main(String[] args) {
		instruction instruc = new instruction();
		
	}
}
