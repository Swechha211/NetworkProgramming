package com.networkprogramming;
import java.net.*;

public class NetworkInterface1 {
	public static void main(String[] args){
		try {
			NetworkInterface ni = NetworkInterface.getByName("eth0");
//			NetworkInterface ni = NetworkInterface.getByName("CE31");
			if(ni == null){
				System.out.println("Not Found");
			}
			else{
				System.out.println("Found");
			}
			
		} catch (SocketException e) {
			System.out.println("Socket Exception");
		}
	}

}
