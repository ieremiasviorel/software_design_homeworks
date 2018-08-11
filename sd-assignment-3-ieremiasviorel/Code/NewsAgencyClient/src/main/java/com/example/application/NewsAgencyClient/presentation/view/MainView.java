package com.example.application.NewsAgencyClient.presentation.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import com.example.application.NewsAgencyClient.data.entity.Article;
import com.example.application.NewsAgencyClient.data.entity.ArticleBasic;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;

	final static String first = "first";
	final static String second = "second";
	final static String third = "third";

	private CardLayout cardLayout;
	private JPanel contentPanel;

	private JPanel startView;
	private JPanel fullArticleView;
	private JPanel authorView;

	private JLabel startViewTitleLabel;
	private JLabel startViewSubTitleLabel;
	private JPanel startViewPanels[];
	private GroupLayout startViewGlPanels[];
	private JLabel startViewTitleLabels[];
	private JLabel startViewAbstractLabels[];
	private JButton startViewPrevPageButton;
	private JButton startViewNextPageButton;
	private JButton startViewLoginButton;
	private JLabel startViewPageCountLabel;
	private JTextField startViewUserNameTextField;
	private JPasswordField startViewPasswordTextField;

	private String[] articleTitles;

	private JLabel fullArticleTitleLabel;
	private JLabel fullArticleAbstractLabel;
	private JLabel fullArticleBodyLabel;
	private JLabel fullArticleAuthorLabel;
	private JButton fullArticleBackButton;
	
	private JButton authorViewWriterLogoutButton;
	private JLabel authorViewWriterNameLabel;
	
	public MainView() {

		setBounds(100, 100, 800, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("News Portal");
		setVisible(true);

		cardLayout = new CardLayout();
		contentPanel = new JPanel();
		contentPanel.setLayout(cardLayout);

		startView = new JPanel();
		startView.setBackground(new Color(240, 240, 240));
		contentPanel.add(startView, first);

		startViewTitleLabel = new JLabel("Technix Media");
		startViewTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));

		startViewSubTitleLabel = new JLabel("Latest News Here");
		startViewSubTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		startViewPanels = new JPanel[6];
		startViewGlPanels = new GroupLayout[6];
		startViewTitleLabels = new JLabel[6];
		startViewAbstractLabels = new JLabel[6];
		for (int i = 0; i < 6; i++) {
			startViewPanels[i] = new JPanel();
			startViewPanels[i].setBackground(Color.WHITE);
			startViewTitleLabels[i] = new JLabel();
			startViewTitleLabels[i].setFont(new Font("Tahoma", Font.PLAIN, 18));
			startViewAbstractLabels[i] = new JLabel();
			startViewGlPanels[i] = new GroupLayout(startViewPanels[i]);
			startViewGlPanels[i].setHorizontalGroup(startViewGlPanels[i].createParallelGroup(Alignment.TRAILING)
					.addGroup(startViewGlPanels[i].createSequentialGroup().addContainerGap()
							.addGroup(startViewGlPanels[i].createParallelGroup(Alignment.LEADING)
									.addComponent(startViewAbstractLabels[i], GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
									.addComponent(startViewTitleLabels[i], GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
							.addContainerGap()));
			startViewGlPanels[i].setVerticalGroup(startViewGlPanels[i].createParallelGroup(Alignment.LEADING)
					.addGroup(startViewGlPanels[i].createSequentialGroup().addContainerGap()
							.addComponent(startViewTitleLabels[i], GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(11).addComponent(startViewAbstractLabels[i], GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
							.addContainerGap()));
			startViewPanels[i].setLayout(startViewGlPanels[i]);
		}

		startViewPrevPageButton = new JButton("<<");
		startViewNextPageButton = new JButton(">>");
		startViewLoginButton = new JButton("login");
		startViewPageCountLabel = new JLabel("1");
		startViewUserNameTextField = new JTextField();
		startViewPasswordTextField = new JPasswordField();

		for (JPanel panel : startViewPanels) {
			startView.add(panel);
		}
		startView.add(startViewTitleLabel);
		startView.add(startViewSubTitleLabel);
		startView.add(startViewPrevPageButton);
		startView.add(startViewNextPageButton);
		startView.add(startViewLoginButton);
		startView.add(startViewPageCountLabel);
		startView.add(startViewUserNameTextField);
		startView.add(startViewPasswordTextField);

		GroupLayout groupLayout = new GroupLayout(startView);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(0).addGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout.createSequentialGroup()
								.addComponent(startViewPrevPageButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(startViewPageCountLabel)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(startViewNextPageButton).addGap(10))
						.addGroup(groupLayout.createSequentialGroup().addGap(22)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(startViewPanels[3], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(startViewPanels[0], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE))
												.addGap(32)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(startViewPanels[4], GroupLayout.DEFAULT_SIZE, 222,
																Short.MAX_VALUE)
														.addComponent(startViewPanels[1], GroupLayout.PREFERRED_SIZE, 222,
																GroupLayout.PREFERRED_SIZE))
												.addGap(41)
												.addGroup(groupLayout
														.createParallelGroup(Alignment.LEADING)
														.addComponent(startViewPanels[5], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																startViewPanels[2], GroupLayout.PREFERRED_SIZE, 220,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(startViewSubTitleLabel, GroupLayout.DEFAULT_SIZE,
																		385, Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED, 138,
																		Short.MAX_VALUE))
														.addComponent(startViewTitleLabel, GroupLayout.PREFERRED_SIZE, 523,
																GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(startViewPasswordTextField)
														.addComponent(startViewLoginButton, GroupLayout.PREFERRED_SIZE, 65,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(startViewUserNameTextField, GroupLayout.DEFAULT_SIZE, 123,
																Short.MAX_VALUE))))
								.addGap(25)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(startViewTitleLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(startViewUserNameTextField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(startViewPasswordTextField,
												GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING).addComponent(startViewSubTitleLabel)
								.addComponent(startViewLoginButton))
						.addGap(28)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(startViewPanels[1], GroupLayout.PREFERRED_SIZE, 130,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(startViewPanels[4], GroupLayout.PREFERRED_SIZE,
																130, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(startViewPanels[2], GroupLayout.PREFERRED_SIZE, 130,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(startViewPanels[5], GroupLayout.PREFERRED_SIZE,
																130, GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(startViewNextPageButton).addComponent(startViewPrevPageButton)
												.addComponent(startViewPageCountLabel)))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(startViewPanels[0], GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(startViewPanels[3], GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		startView.setLayout(groupLayout);
		startView.setVisible(true);
		
		articleTitles = new String[6];

		fullArticleView = new JPanel();
		contentPanel.add(fullArticleView, second);

		fullArticleTitleLabel = new JLabel();
		fullArticleTitleLabel.setBounds(22, 13, 523, 46);
		fullArticleTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		
		fullArticleAbstractLabel = new JLabel();
		fullArticleAbstractLabel.setBounds(22, 66, 748, 71);
		fullArticleAbstractLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		fullArticleBodyLabel = new JLabel();
		fullArticleBodyLabel.setBounds(12, 144, 758, 240);
		fullArticleBodyLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		fullArticleAuthorLabel = new JLabel();
		fullArticleAuthorLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		fullArticleAuthorLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fullArticleAuthorLabel.setBounds(465, 395, 305, 25);
		
		fullArticleBackButton = new JButton("back");
		fullArticleBackButton.setBounds(705, 13, 65, 25);

		fullArticleView.add(fullArticleTitleLabel);
		fullArticleView.add(fullArticleAbstractLabel);
		fullArticleView.add(fullArticleBodyLabel);
		fullArticleView.add(fullArticleAuthorLabel);
		fullArticleView.add(fullArticleBackButton);

		fullArticleView.setVisible(true);
		
		authorView = new JPanel();
		contentPanel.add(authorView, third);
		
		authorViewWriterNameLabel = new JLabel();
		authorViewWriterLogoutButton = new JButton("logout");
		
		for (JPanel panel : startViewPanels) {
			authorView.add(panel);
		}
		authorView.add(startViewTitleLabel);
		authorView.add(startViewSubTitleLabel);
		authorView.add(startViewPrevPageButton);
		authorView.add(startViewNextPageButton);
		authorView.add(startViewPageCountLabel);
		startView.add(authorViewWriterNameLabel);
		startView.add(authorViewWriterLogoutButton);
		
		GroupLayout authorViewGroupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(0)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(startViewPrevPageButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(startViewPageCountLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(startViewNextPageButton)
							.addGap(10))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(startViewPanels[3], GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
										.addComponent(startViewPanels[0], GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
									.addGap(32)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(startViewPanels[4], GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
										.addComponent(startViewPanels[1], GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
									.addGap(41)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(startViewPanels[5], GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
										.addComponent(startViewPanels[2], GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(startViewSubTitleLabel, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE))
										.addComponent(startViewTitleLabel, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(authorViewWriterLogoutButton, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(authorViewWriterNameLabel, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
							.addGap(25))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(startViewTitleLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(authorViewWriterNameLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(startViewSubTitleLabel)
						.addComponent(authorViewWriterLogoutButton))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(startViewPanels[1], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(startViewPanels[4], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(startViewPanels[2], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(startViewPanels[5], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(startViewNextPageButton)
								.addComponent(startViewPrevPageButton)
								.addComponent(startViewPageCountLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(startViewPanels[0], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(startViewPanels[3], GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		authorView.setLayout(authorViewGroupLayout);
		authorView.setVisible(true);

		getContentPane().add(contentPanel);
		setVisible(true);
	}

	public void updateArticleBasicInfoPanels(List<ArticleBasic> articles) {
		for (int i = 0; i < 6; i++) {
			startViewTitleLabels[i].setText(HTMLize_title(articles.get(i).getTitle()));
			startViewAbstractLabels[i].setText(HTMLize_abstract(articles.get(i).getSummary()));
			articleTitles[i] = articles.get(i).getTitle();
		}
		
		startView.setVisible(true);
		fullArticleView.setVisible(false);
		authorView.setVisible(false);
	}

	public void updateFullArticlePanel(Article article) {
		fullArticleTitleLabel.setText(article.getTitle());
		fullArticleAbstractLabel.setText(article.getSummary());
		fullArticleBodyLabel.setText(article.getBody());
		fullArticleAuthorLabel.setText(article.getAuthor().getFirstName() + article.getAuthor().getLastName());

		startView.setVisible(false);
		fullArticleView.setVisible(true);
		authorView.setVisible(false);
	}

	public String HTMLize_title(String source) {
		for (int i = 26; i < source.length(); i += 40) {
			int j = i;
			while (source.charAt(j) != ' ' && j > 1) {
				j--;
			}
			source = source.substring(0, j) + "<br>" + source.substring(j + 1, source.length());
			i = j;
		}
		source = "<html>" + source + "</html>";
		return source;
	}

	public String HTMLize_abstract(String source) {
		for (int i = 39; i < source.length(); i += 54) {
			int j = i;
			while (source.charAt(j) != ' ' && j > 1) {
				j--;
			}
			source = source.substring(0, j) + "<br>" + source.substring(j + 1, source.length());
			i = j;
		}
		source = "<html>" + source + "</html>";
		return source;
	}

	public String getSelectedArticleTitle(int selectedPanel) {
		return articleTitles[selectedPanel];
	}

	public String getUserName() {
		return startViewUserNameTextField.getText();
	}

	@SuppressWarnings("deprecation")
	public String getPassword() {
		return startViewPasswordTextField.getText();
	}

	public void addPanelSelectListener(int panelId, MouseListener e) {
		startViewPanels[panelId].addMouseListener(e);
		startViewTitleLabels[panelId].addMouseListener(e);
		startViewAbstractLabels[panelId].addMouseListener(e);
	}

	public void addLoginButtonListener(ActionListener e) {
		startViewLoginButton.addActionListener(e);
	}

	public void switchCards() {
		this.cardLayout.show(contentPanel, second);
		startView.setVisible(false);
		fullArticleView.setVisible(true);
		authorView.setVisible(false);
	}
}
