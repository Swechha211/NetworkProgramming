package com.networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEg {
	public static void main(String[] args){
		try{
//			InetAddress[] addresses = InetAddress.getAllByName("www.oreilly.com");
//			InetAddress a = InetAddress.getLocalHost();
			byte[] add = {107, 23, (byte) 216, (byte) 196};
			InetAddress a1 = InetAddress.getByAddress(add);
			InetAddress a2 = InetAddress.getByAddress(
				"google.com", add
			);
			System.out.println(a2);
			
			
			
//			for(InetAddress address : addresses){
//				System.out.println(address);
//			}
//			System.out.println(a);
			
		}
			catch(UnknownHostException e){
				System.out.println("couldnot find ");
			}
			
		}
	}


