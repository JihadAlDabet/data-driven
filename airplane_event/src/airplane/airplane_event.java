package airplane;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class airplane_event extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					airplane_event frame = new airplane_event();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public airplane_event() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("airplane");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(17, 50, 82, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton_4 = new JButton("cisna");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.getText();
				if (textField.getText().isEmpty()) { 
					textField.setText("cisna");
					}else {
						textField.setText("");
						String first=textField.getText();
						
						
					}
				
			}
		});
		btnNewButton_4.setBounds(10, 159, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("737");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.getText();
				if (textField.getText().isEmpty()) {
			
					textField.setText("737");
				}else {
					textField.setText("");
					String first=textField.getText();
					
					
				}
			}
		});
		btnNewButton_5.setBounds(10, 210, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("747");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.getText();
				if (textField.getText().isEmpty()) {
					textField.setText("747");
				}else {
					textField.setText("");
					String first=textField.getText();
					
				}
			}
		});
		btnNewButton_6.setBounds(10, 257, 89, 23);
		contentPane.add(btnNewButton_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 50, 82, 50);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(246, 50, 82, 50);
		contentPane.add(textField_2);
		
		JButton btnNewButton_4_1 = new JButton("3");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.getText();
				if (textField_1.getText().isEmpty()) { 
					textField_1.setText("3");
					}else {
						textField_1.setText("");
						String first=textField_1.getText();
						
						
					}
			}
		});
		btnNewButton_4_1.setBounds(133, 159, 89, 23);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("5");
		btnNewButton_4_2.setBounds(133, 210, 89, 23);
		contentPane.add(btnNewButton_4_2);
		btnNewButton_4_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				textField_1.getText();
				if (textField_1.getText().isEmpty()) { 
					textField_1.setText("5");
					}else {
						textField_1.setText("");
						String first=textField_1.getText();
						
						
					}
			}
		});
		
		JButton btnNewButton_4_3 = new JButton("18");
		btnNewButton_4_3.setBounds(133, 257, 89, 23);
		contentPane.add(btnNewButton_4_3);
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.getText();
				if (textField_1.getText().isEmpty()) { 
					textField_1.setText("18");
					}else {
						textField_1.setText("");
						String first=textField_1.getText();
						
						
					}
			}
		});
		
		JButton btnNewButton_4_4 = new JButton("4");
		btnNewButton_4_4.setBounds(249, 159, 89, 23);
		contentPane.add(btnNewButton_4_4);
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.getText();
				if (textField_2.getText().isEmpty()) { 
					textField_2.setText("4");
					}else {
						textField_2.setText("");
						String first=textField_2.getText();
						
						
					}
			}
		});
		
		JButton btnNewButton_4_5 = new JButton("200");
		btnNewButton_4_5.setBounds(249, 210, 89, 23);
		contentPane.add(btnNewButton_4_5);
		btnNewButton_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.getText();
				if (textField_2.getText().isEmpty()) { 
					textField_2.setText("200");
					}else {
						textField_2.setText("");
						String first=textField_2.getText();
						
						
					}
			}
		});
		
		JButton btnNewButton_4_6 = new JButton("500");
		btnNewButton_4_6.setBounds(249, 257, 89, 23);
		contentPane.add(btnNewButton_4_6);
		btnNewButton_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.getText();
				if (textField_2.getText().isEmpty()) { 
					textField_2.setText("500");
					}else {
						textField_2.setText("");
						String first=textField_2.getText();
						
						
					}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Tail Number");
		lblNewLabel.setBounds(20, 134, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num Of Wheels");
		lblNewLabel_1.setBounds(133, 134, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Num Of Passengers");
		lblNewLabel_2.setBounds(246, 134, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4_4_1 = new JButton("90");
		btnNewButton_4_4_1.setBounds(373, 159, 89, 23);
		contentPane.add(btnNewButton_4_4_1);
		btnNewButton_4_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.getText();
				if (textField_3.getText().isEmpty()) { 
					textField_3.setText("90");
					}else {
						textField_3.setText("");
						String first=textField_3.getText();
						
						
					}
			}
		});
		
		JButton btnNewButton_4_4_2 = new JButton("150");
		btnNewButton_4_4_2.setBounds(373, 210, 89, 23);
		contentPane.add(btnNewButton_4_4_2);
		btnNewButton_4_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.getText();
				if (textField_3.getText().isEmpty()) { 
					textField_3.setText("150");
					}else {
						textField_3.setText("");
						String first=textField_3.getText();
						
						
					}
			}
		});
		
		
		JButton btnNewButton_4_4_3 = new JButton("200");
		btnNewButton_4_4_3.setBounds(373, 257, 89, 23);
		contentPane.add(btnNewButton_4_4_3);
		btnNewButton_4_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.getText();
				if (textField_3.getText().isEmpty()) { 
					textField_3.setText("200");
					}else {
						textField_3.setText("");
						String first=textField_3.getText();
						
						
					}
			}
		});
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(373, 50, 82, 50);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Tail Number");
		lblNewLabel_3.setBounds(27, 25, 72, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Num Of Wheels");
		lblNewLabel_1_1.setBounds(126, 25, 89, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Num Of Passengers");
		lblNewLabel_2_1.setBounds(239, 25, 102, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Speed");
		lblNewLabel_2_1_1.setBounds(392, 134, 51, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Speed");
		lblNewLabel_2_1_2.setBounds(390, 25, 72, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("cisna")&&textField_3.getText().equals("90")) {
					JOptionPane.showInputDialog("cisna lift off");
				}else if(textField.getText().equals("737")&&textField_3.getText().equals("150")) {
					JOptionPane.showInputDialog("737 lift off");
					
				}else if(textField.getText().equals("747")&&textField_3.getText().equals("200")) {
					
					JOptionPane.showInputDialog("747 lift off");
				}else {
					JOptionPane.showInputDialog("can't lift off");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(187, 327, 89, 23);
		contentPane.add(btnNewButton);
	}
}

