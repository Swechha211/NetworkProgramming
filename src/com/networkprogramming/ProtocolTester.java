package com.networkprogramming;
import java.net.*;
public class ProtocolTester {
	public static void main(String[] args){
		
		testProtocol("http://www.adc.org");
		testProtocol("ftp://ibiblio.org/pub/languages/java/javafaq/*");
		
	}
	
	private static void testProtocol(String url){
		try{
			URL u = new URL(url);
			System.out.println(u.getProtocol()+ " is supported");
			
			
		}catch(Exception e){
			String protocol = url.substring(0,url.indexOf(':'));
			System.out.println(protocol + " is not supported");
			
		}
	}

}
