package com.example.application.NewsAgencyServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.application.NewsAgencyServer.handler.ClientHandler;

@SpringBootApplication
public class NewsAgencyServerApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(NewsAgencyServerApplication.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws InterruptedException, IOException {

		ServerSocket serverSocket = new ServerSocket(10);

		try {
			while (true) {
				Socket clientSocket = serverSocket.accept();
				ClientHandler clientHandler = new ClientHandler(clientSocket);
				clientHandler.start();
			}
		} finally {
			serverSocket.close();
		}
	}
}
