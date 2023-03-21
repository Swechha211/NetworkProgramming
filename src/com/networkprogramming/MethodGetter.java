package com.networkprogramming;
import java.net.*;

public class MethodGetter {

		
		public static void main(String[] args)
		{
			try{
				InetAddress a = InetAddress.getByName("www.facebook.com");
				System.out.println("The host name is " + a.getHostName());
				System.out.println("The getCanonicalHostName is " + a.getCanonicalHostName());
				System.out.println("The address is " + a.getAddress());
				System.out.println("The getHostAddress is " + a.getHostAddress());
				}
			catch(UnknownHostException e){
				System.out.println("Unknown Host");
			}
			
		

	}


}
