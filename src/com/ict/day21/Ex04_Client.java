package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex04_Client {
	public static void main(String[] args) {
		Socket socket = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			socket = new Socket("192.168.0.35",7777);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String msg = null;
			while(true) {
				System.out.print("메시지입력(종료->'exit'): ");
				msg = scan.nextLine();
				
				bw.write(msg+"\n");
				bw.flush();
				
				if(msg.equalsIgnoreCase("exit")) {
					System.out.println("연결 종료");
					break;
				}
				String re_msg = br.readLine();
				System.out.println("서버에서 온 메세지 : " + re_msg);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bw.close();
				osw.close();
				os.close();
				
				br.close();
				isr.close();
				is.close();
				socket.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}








