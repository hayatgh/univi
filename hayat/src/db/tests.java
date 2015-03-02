package db;

import java.awt.EventQueue;

import javax.swing.JFrame;
//import javax.swing.JOptionPane;

import java.awt.Window.Type;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class tests {

	private JFrame frmHoho;
	private JLabel lblNewLabel ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tests window = new tests();
					window.frmHoho.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tests() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHoho = new JFrame();
		frmHoho.setType(Type.POPUP);
		frmHoho.setBounds(100, 100, 737, 433);
		frmHoho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("MSG FOR YOU");
		btnNewButton.setBounds(97, 189, 165, 70);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("hayat hi .........");
				//JOptionPane.showMessageDialog(null," hi hayat ...... ");
				
			}
		});
		frmHoho.getContentPane().setLayout(null);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		frmHoho.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("NewLabel");
		lblNewLabel.setBounds(157, 72, 263, 78);
		frmHoho.getContentPane().add(lblNewLabel);
		
	}
}
