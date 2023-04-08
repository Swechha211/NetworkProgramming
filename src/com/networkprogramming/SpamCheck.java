package com.networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
	
	public static final String BLACKHOLE = "sbl.spamhaus.org";
	public static String hosts[] = {
			"8.8.8.","207.34.56.23"
	};
	public static void main(String[] args) throws UnknownHostException{
		for(String arg: hosts){
			if(isSpammer(arg)){
				System.out.println(arg + "is a known spammer.");
			}else{
				System.out.println(arg + "appears legitimate");
			}
		}
		
	}
	private static boolean isSpammer(String arg) {
		try{
			
			InetAddress address = InetAddress.getByName(arg);
			byte[] quad = address.getAddress();
			String query = BLACKHOLE;
			for(byte octet : quad){
				int unsignedByte = octet < 0 ? octet + 256 : octet;
				query = unsignedByte + "." + query;
			}
			InetAddress.getByName(query);
			return true;
			
		}catch(UnknownHostException e){
			
			return false;
			
		}
		
	}


}
