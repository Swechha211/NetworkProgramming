package com.networkprogramming;
import java.net.*;
import java.util.Enumeration;

public class NetworkInterfaceEnumeg {
	public static void main(String[] args) throws SocketException{
		Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
		while(en.hasMoreElements()){
			NetworkInterface ni = en.nextElement();
			System.out.println(ni);
			
		}
		
	}
}
