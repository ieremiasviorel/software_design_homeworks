package com.example.application.NewsAgencyClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.json.simple.parser.ParseException;

import com.example.application.NewsAgencyClient.presentation.controller.MainController;
import com.example.application.NewsAgencyClient.presentation.controller.util.ResponseInterpreter;
import com.example.application.NewsAgencyClient.presentation.view.MainView;

public class NewsAgencyClientApplication {

	public static void main(String[] args) throws ClassNotFoundException, IOException, ParseException {

		String hostName = "localhost";
		int portNumber = 10;

		Socket echoSocket = null;

		try {
			echoSocket = new Socket(hostName, portNumber);
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

			MainView mainView = new MainView();

			new MainController(out, mainView);
			
			ResponseInterpreter responseInterpreter = new ResponseInterpreter(in, mainView);
			responseInterpreter.run();
			
		} finally {
			echoSocket.close();
		}
	}
}
