package com.example.application.NewsAgencyClient.presentation.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class scrap {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scrap window = new scrap();
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
	public scrap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel title_label = new JLabel("Technix Media");
		title_label.setFont(new Font("Tahoma", Font.PLAIN, 36));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);

		JLabel title_label_2 = new JLabel("");
		title_label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel abstract_label_2 = new JLabel("");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(abstract_label_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE)
								.addComponent(title_label_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addComponent(title_label_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(abstract_label_2, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addContainerGap()));
		panel_2.setLayout(gl_panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);

		JLabel title_label_3 = new JLabel("");
		title_label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel abstract_label_3 = new JLabel("");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGap(0, 220, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(abstract_label_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE)
								.addComponent(title_label_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGap(0, 130, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
						.addComponent(title_label_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(abstract_label_3, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addContainerGap()));
		panel_3.setLayout(gl_panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);

		JLabel title_label_4 = new JLabel("");
		title_label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel abstract_label_4 = new JLabel("");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGap(0, 220, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
								.addComponent(abstract_label_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE)
								.addComponent(title_label_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGap(0, 130, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
						.addComponent(title_label_4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(abstract_label_4, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addContainerGap()));
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);

		JLabel title_label_5 = new JLabel("");
		title_label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel abstract_label_5 = new JLabel("");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addGap(0, 220, Short.MAX_VALUE)
				.addGap(0, 220, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(abstract_label_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE)
								.addComponent(title_label_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addGap(0, 130, Short.MAX_VALUE)
				.addGap(0, 130, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
						.addComponent(title_label_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(abstract_label_5, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addContainerGap()));
		panel_5.setLayout(gl_panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);

		JLabel titile_label_6 = new JLabel("");
		titile_label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel abstract_label_6 = new JLabel("");
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(gl_panel_6.createParallelGroup(Alignment.LEADING).addGap(0, 220, Short.MAX_VALUE)
				.addGap(0, 220, Short.MAX_VALUE).addGap(0, 220, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
								.addComponent(abstract_label_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE)
								.addComponent(titile_label_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_6.setVerticalGroup(gl_panel_6.createParallelGroup(Alignment.LEADING).addGap(0, 130, Short.MAX_VALUE)
				.addGap(0, 130, Short.MAX_VALUE).addGap(0, 130, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup().addContainerGap()
						.addComponent(titile_label_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(abstract_label_6, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addContainerGap()));
		panel_6.setLayout(gl_panel_6);

		JLabel subtitle_label = new JLabel("Freshest News Here");
		subtitle_label.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JButton next_page_btn = new JButton(">>");

		JButton prev_page_btn = new JButton("<<");

		JLabel page_count_label = new JLabel("10");

		JButton login_btn = new JButton("login");
		
		JTextField userNameTextField = new JTextField("");
		
		JTextField passwordTextField = new JTextField("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(0)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(prev_page_btn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(page_count_label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(next_page_btn)
							.addGap(10))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
									.addGap(32)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
									.addGap(41)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(subtitle_label, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED, 138, Short.MAX_VALUE))
										.addComponent(title_label, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(passwordTextField)
										.addComponent(login_btn, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(userNameTextField, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))))
							.addGap(25))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(title_label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(subtitle_label)
						.addComponent(login_btn))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(next_page_btn)
								.addComponent(prev_page_btn)
								.addComponent(page_count_label)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);

		JLabel title_label_1 = new JLabel("");
		title_label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel abstract_label_1 = new JLabel("");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(abstract_label_1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
								.addComponent(title_label_1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(title_label_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(abstract_label_1, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addContainerGap()));
		panel_1.setLayout(gl_panel_1);
		frame.getContentPane().setLayout(groupLayout);
	}
}
