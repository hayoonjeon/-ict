package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Ex04_ClientHandler extends Thread{
	private Socket socket;
	
	public Ex04_ClientHandler(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			String ip = socket.getInetAddress().getHostAddress();
			String msg = null;
			while ((msg = br.readLine())!=null) {
				if(msg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트 연결 종료");
					break;
				}
				System.out.println(ip + " : " + msg);
				bw.write(msg + "\n");
				bw.flush();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}









