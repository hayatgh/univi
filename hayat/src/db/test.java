package db;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test {

	private JFrame frame;
	private JTextField textFieldNUM1;
	private JTextField textFieldNUM2;
	private JTextField textFieldNUM3;
	private JLabel lblResultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 746, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNUM1 = new JTextField();
		textFieldNUM1.setBounds(91, 51, 256, 50);
		frame.getContentPane().add(textFieldNUM1);
		textFieldNUM1.setColumns(10);
		
		textFieldNUM2 = new JTextField();
		textFieldNUM2.setBounds(386, 51, 256, 50);
		frame.getContentPane().add(textFieldNUM2);
		textFieldNUM2.setColumns(10);
		
		JButton btnNewButtonADD = new JButton("ADD");
		btnNewButtonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent er) {
				int num1,num2,num3;
				try {
					num1=Integer.parseInt(textFieldNUM1.getText());
					num2=Integer.parseInt(textFieldNUM2.getText());
					num3=num1+num2;
					textFieldNUM3.setText(Integer.toString(num3));
					
				    } catch( Exception e1) {
						JOptionPane.showMessageDialog(null, "entrez  un variable");
				    }
			}
		});
		btnNewButtonADD.setBounds(91, 192, 256, 50);
		btnNewButtonADD.setBackground(Color.MAGENTA);
		btnNewButtonADD.setFont(new Font("Dialog", Font.BOLD, 17));
		btnNewButtonADD.setForeground(Color.RED);
		frame.getContentPane().add(btnNewButtonADD);
		
		JButton btnNewButtonMINUS = new JButton("MINUS");
		btnNewButtonMINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,num3;
				try {
					num1=Integer.parseInt(textFieldNUM1.getText());
					num2=Integer.parseInt(textFieldNUM2.getText());
					num3=num1-num2;
					textFieldNUM3.setText(Integer.toString(num3));
					
				    } catch( Exception e2) {
						JOptionPane.showMessageDialog(null, "entrez  un variable");
				    }
			}
		});
		btnNewButtonMINUS.setBounds(386, 192, 256, 50);
		btnNewButtonMINUS.setBackground(Color.MAGENTA);
		btnNewButtonMINUS.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButtonMINUS.setForeground(Color.RED);
		frame.getContentPane().add(btnNewButtonMINUS);
		
		textFieldNUM3 = new JTextField();
		textFieldNUM3.setBounds(305, 315, 337, 50);
		frame.getContentPane().add(textFieldNUM3);
		textFieldNUM3.setColumns(10);
		
		lblResultat = new JLabel("RESULTAT");
		lblResultat.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultat.setForeground(Color.GREEN);
		lblResultat.setBounds(91, 333, 93, 14);
		frame.getContentPane().add(lblResultat);
		
	}
}
