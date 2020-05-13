package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userGUI {

	private JFrame frame;
	private JTextField UserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userGUI window = new userGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public userGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setBounds(165, 11, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Ibusername = new JLabel("Username");
		Ibusername.setBounds(41, 67, 60, 17);
		frame.getContentPane().add(Ibusername);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(41, 132, 46, 14);
		frame.getContentPane().add(lblPass);
		
		UserName = new JTextField();
		UserName.setBounds(111, 65, 218, 20);
		frame.getContentPane().add(UserName);
		UserName.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
		//pre-condition: text fields contain string
		//post-condition: a user object is created with information matching an entry in database
			public void actionPerformed(ActionEvent e) {
				//String username = UserName.getText();
				//String Password = txtPassword.getText();
			}
		});
		btnNewButton.setBounds(54, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guest");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pre-condition: button is clicked
				//Post-condition: create user object and initialize everything to null
				User object = new User();
				object.userSetter(null, null, null, 0, null, null, null);
			}
		});
		btnNewButton_1.setBounds(165, 195, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pre-Condition: button is clicked
				//post-condition: creates and adds new entry to database
			}
		});
		btnNewButton_2.setBounds(271, 195, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Thank you for shopping with us.");
		lblNewLabel_1.setBounds(125, 36, 204, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(111, 129, 218, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
	}
}
