package Alpha3;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class menu implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label1= new JLabel(" Welcome To Alphabet Quiz Game");
	JButton PlayButton = new JButton("Play");
	JButton InstructionButton = new JButton("Instructions");
	JButton ScoreButton = new JButton("Score Board");
	JButton resetButton = new JButton("Reset Score");
	JButton ExitButton = new JButton("Exit");
	
	Font titleFont = new Font("Tahoma", Font.BOLD, 58);
	
	public menu() {
	
		frame.setTitle("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(1000,700);
		
		frame.setVisible(true);
		label1.setForeground(new Color(102, 51, 255));
		frame.getContentPane().add(label1);
		
		frame.getContentPane().setLayout(new FlowLayout()); //layout manager
		frame.getContentPane().add(label1);
		PlayButton.setBackground(new Color(255, 255, 255));
		PlayButton.setForeground(new Color(0, 204, 0));
		frame.getContentPane().add(PlayButton);
		InstructionButton.setForeground(new Color(255, 204, 102));
		frame.getContentPane().add(InstructionButton);
		ScoreButton.setForeground(new Color(51, 0, 255));
		frame.getContentPane().add(ScoreButton);
		ExitButton.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(ExitButton);
		
		
		
		
		label1.setFont(new Font("Charter", Font.BOLD | Font.ITALIC, 58));
		PlayButton.setFont(new Font("Kefa", Font.BOLD | Font.ITALIC, 58));
		InstructionButton.setFont(new Font("Kefa", Font.BOLD | Font.ITALIC, 58));
		ScoreButton.setFont(new Font("Kefa", Font.BOLD | Font.ITALIC, 58));
		ExitButton.setFont(new Font("Kefa", Font.BOLD | Font.ITALIC, 58));
		
		PlayButton.addActionListener(this);
		InstructionButton.addActionListener(this);
		ScoreButton.addActionListener(this);
		ExitButton.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==PlayButton) {
			new AlphabetGameForKids();
			frame.dispose();
		}
		if(e.getSource()==InstructionButton) {
			new instruction();
			frame.dispose();
		}
		if(e.getSource()==ExitButton) {
		    frame.setVisible(false);
		   new register();
		   frame.dispose();
		}
		if(e.getSource()==ScoreButton) {
			new ScoreBoard();
			frame.dispose();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		menu menu = new menu();
	}
	
	
	
	

	


}
