package com.ict.day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex01_Client {
	public static void main(String[] args) {
		Socket socket = null;
		// 스레드 처리를 익명내부클래스 해서 초기값을 줄수 없다.
		BufferedReader in;
		BufferedWriter out = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			socket = new Socket("192.168.0.35", 7777);
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.print("닉네임을 입력하세요 : ");
			String nickname = scan.next();
			out.write(nickname + "\n");
			out.flush();
			
			
			// 서버로 부터 오는 메세지를 수신하는 스레드 
			Thread receiveThread = new Thread(new Runnable() {
				@Override
				public void run() {
					String msg = null;
					try {
						while ((msg = in.readLine()) != null) {
							System.out.println(msg);
						}
					} catch (Exception e) {
						System.out.println(e);
					} finally {
						try {
							in.close();
						} catch (Exception e2) {
						}
					}
				}
			});
			receiveThread.start();
			
			// 사용자가 입력한 메세지를 서버로 보내는 부분
			String message;
			while (true) {
				message = scan.nextLine();
				out.write(message+"\n");
				out.flush();
				
				if(message.equalsIgnoreCase("exit")) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				out.close();
				socket.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
