package com.ict.day21;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_Server {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		try {
			server = new ServerSocket(7777);
			System.out.println("서버 대기중 ...");
			
			while (true) {
				socket = server.accept();
				
				new Ex04_ClientHandler(socket).start();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				server.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
