package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TryTextFieldInput extends JFrame{

	
	private JTextField textField;
	
	private JLabel labelMessage;
	
	private JButton buttonSubmit;
	
	
	public TryTextFieldInput() {
		createView();
		
		
		//Make window exit application on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Set display size
		setSize(400,200);
		//Center the frame to middle of the screen
		setLocationRelativeTo(null);
		//Disable Resize
		setResizable(false);
	}
	
	//Initializes all UI components
	private void createView() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		//Create label for prompting user
		JLabel label = new JLabel("Please enter your name: ");
		panel.add(label);
		
		//Create text field with set pixel size of 30x150 and add it to panel
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(150,20));
		panel.add(textField);
		
		//Create and add submit button
		buttonSubmit = new JButton("Submit");
		buttonSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				
				if(name.isEmpty())
				{
					labelMessage.setText("Your name cannot be nothing can it?");
				}
				else 
				{
					labelMessage.setText("Hello there " + name + ". How are you?");
				}
				
			}
		});
		panel.add(buttonSubmit);
		
		labelMessage = new JLabel(" ");
		panel.add(labelMessage);
		
		
		
		
	}

	//Entry point of program
	public static void main(String[] args) {
		//Create a frame and show it through SwingUtilities
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new TryTextFieldInput().setVisible(true);;
			}
		});
		
	}

}
