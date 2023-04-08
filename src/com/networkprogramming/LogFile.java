package com.networkprogramming;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LogFile {
	
	public static String hosts[] = {
//			"205.160.186.76 unknown - [17/Jun/2020:22:53:58 -0500]",
			"New Text Document.txt"
	};
	public static void main(String[] args) {
		
		try (FileInputStream fin = new FileInputStream(hosts[0]);
		Reader in = new InputStreamReader(fin);
		BufferedReader bin = new BufferedReader(in);) {
		for (String entry = bin.readLine();
		entry != null;
		entry = bin.readLine()) {
		// separate out the IP address
		int index = entry.indexOf(' ');
		String ip = entry.substring(0, index);
		String theRest = entry.substring(index);
		// Ask DNS for the hostname and print it out
		try {
		InetAddress address = InetAddress.getByName(ip);
		System.out.println(address.getHostName() + theRest);
		} catch (UnknownHostException ex) {
		System.err.println(entry);
		}
		}
		} catch (IOException ex) {
		System.out.println("Exception: " + ex);
		}
		
	}

}
