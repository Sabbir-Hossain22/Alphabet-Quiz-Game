package Alpha3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class register extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	public register() {
		setSize(500,500);
		setVisible(true);
		setResizable(true);
		getContentPane().setLayout(null);
		
		JLabel regisname = new JLabel("Name:");
		regisname.setForeground(new Color(0, 102, 255));
		regisname.setFont(new Font("Academy Engraved LET", Font.BOLD | Font.ITALIC, 25));
		regisname.setBounds(38, 142, 123, 35);
		getContentPane().add(regisname);
		
		JLabel regisAge = new JLabel("Age:");
		regisAge.setForeground(new Color(102, 0, 0));
		regisAge.setFont(new Font("Academy Engraved LET", Font.BOLD | Font.ITALIC, 25));
		regisAge.setBounds(38, 189, 123, 75);
		getContentPane().add(regisAge);
		
		textField = new JTextField();
		textField.setBounds(171, 140, 178, 35);
		getContentPane().add(textField);
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 216, 178, 35);
		getContentPane().add(textField_1);
		
		
		
		JButton OK = new JButton("OK");
		OK.setForeground(new Color(0, 204, 0));
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setName(textField.getText());
				int a=Integer.parseInt(textField_1.getText());
				User.setAge(a);
				
				new menu();
				dispose();
			}
		});
		OK.setBounds(109, 295, 114, 35);
		getContentPane().add(OK);
		
		JButton CloseButton = new JButton("Close");
		CloseButton.setForeground(new Color(255, 0, 0));
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		CloseButton.setBounds(283, 295, 114, 35);
		getContentPane().add(CloseButton);
		
		
	}
	public static void main(String[] args) {
		new register();

	}
}
