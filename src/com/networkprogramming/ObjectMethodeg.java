package com.networkprogramming;
import java.net.*;
public class ObjectMethodeg {

	public static void main(String[] args) {
		try{
			InetAddress i = InetAddress.getByName("www.google.com");
			InetAddress i1 = InetAddress.getByName("www.facebook.com");
			InetAddress i3 = InetAddress.getByName("www.google.com");
			String str= i3.toString(); //to returns the string value of given address
			 
			System.out.println("The result of toString() is "+ str);
			System.out.println("The first hashcode is "+i.hashCode()); // to return the hash code value of given address
			System.out.println("The second hashcode is "+i1.hashCode());
			 
			byte[] address = i.getAddress();//to check whether the given address is IPV4 or IPV6
			if(address.length == 4){
				System.out.println("IPV4");
			}
			else if(address.length == 16){
				System.out.println("IPV6");
			}
			else{
				System.out.println("Invalid");
			}
			 
			
			if(i.equals(i1)){ // to check whether the given address are same or not
				System.out.println("Both are same");
			}
			else{
				System.out.println("They are not same");
			}
			
			
		}catch(UnknownHostException e){
			System.out.println("Unknown Host");
		}
	

	}

}
