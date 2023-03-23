package com.networkprogramming;
import java.net.*;

public class NetworkInterface2 {
	public static void main(String[] args){
		try{
			InetAddress i = InetAddress.getByName("127.0.0.1");
			NetworkInterface ni = NetworkInterface.getByInetAddress(i);
			if(ni == null){
				System.out.println("No loop back address found");
			}
			else{
				System.out.println("Loop back address found");
			}
			
		}
		catch(SocketException e){
			System.out.println("Could not list network interfaces");
			
		}catch(UnknownHostException e){
			System.out.println("Could not knoe host");
		}
	}
	


}
