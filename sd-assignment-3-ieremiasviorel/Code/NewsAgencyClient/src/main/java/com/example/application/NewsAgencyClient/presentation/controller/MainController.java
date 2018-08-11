package com.example.application.NewsAgencyClient.presentation.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.PrintWriter;

import com.example.application.NewsAgencyClient.communication.message.GetFullArticleRequest;
import com.example.application.NewsAgencyClient.presentation.view.MainView;

public class MainController {

	private PrintWriter out;

	private MainView mainView;

	public MainController(PrintWriter out, MainView mainView) {
		this.out = out;
		this.mainView = mainView;
		for (int i = 0; i < 6; i++) {
			mainView.addPanelSelectListener(i, new SelectArticleListener(i));
		}
		mainView.addLoginButtonListener(new LoginButtonListener());
	}

	class SelectArticleListener implements MouseListener {

		int panelId;

		SelectArticleListener(int panelId) {
			this.panelId = panelId;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			String selectedArticleTitle = mainView.getSelectedArticleTitle(panelId);
			GetFullArticleRequest request = new GetFullArticleRequest(selectedArticleTitle);
			try {
				out.println(request.toJson());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}

	class LoginButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// String userName = mainView.getUserName();
			// String password = mainView.getPassword();
			// LoginRequest request = new LoginRequest(userName, password);
			// try {
			// out.println(request.toJson());
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
			mainView.switchCards();
			System.err.println("!!!");
		}
	}
}
