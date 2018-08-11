package com.example.application.NewsAgencyClient.presentation.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class scrap2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scrap2 window = new scrap2();
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
	public scrap2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel titleLabel = new JLabel("");
		titleLabel.setBounds(22, 13, 523, 46);
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));

		JLabel abstractLabel = new JLabel("");
		abstractLabel.setBounds(22, 66, 748, 71);
		abstractLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JButton back_btn = new JButton("back");
		back_btn.setBounds(705, 13, 65, 25);
		frame.getContentPane().setLayout(null);
		
		JLabel bodyTable = new JLabel("");
		bodyTable.setBounds(12, 144, 758, 240);
		bodyTable.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(bodyTable);
		frame.getContentPane().add(abstractLabel);
		frame.getContentPane().add(titleLabel);
		frame.getContentPane().add(back_btn);
		
		JLabel authorNameLabel = new JLabel("");
		authorNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		authorNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		authorNameLabel.setBounds(465, 395, 305, 25);
		frame.getContentPane().add(authorNameLabel);
	}
}
