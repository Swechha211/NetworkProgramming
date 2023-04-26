package com.chapter5;
import java.net.*;
import java.io.*;
public class Daytimeprotocolexamp {
	public static void main(String[] args){
		String hostname = "time.nist.gov";
		Socket socket = null;
		try {
			socket = new Socket(hostname,13);
			socket.setSoTimeout(15000);
			InputStream in = socket.getInputStream();
			StringBuilder time = new StringBuilder();
			InputStreamReader reader = new InputStreamReader(in,"AsCII");
			for (int c = reader.read(); c!=-1; c=reader.read()) {
				time.append((char )c);
			}
			System.out.println(time);
		} catch (IOException ex) {
			System.out.println(ex);
			// TODO: handle exception
		}finally{
			if (socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO: handle exception
				}
			}
		}
	}

}
