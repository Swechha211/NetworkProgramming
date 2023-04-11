package com.networkprogramming;
import java.net.*;

public class SImpleURL {
	public static void main(String[] args) {
		try{
			URL url = new URL("https://www.google.com/search?q=url&oq=url&aqs=chrome.0.69i59l2j0i131i433i512j46i512j0i433i512j69i60l3.1650j0j7&sourceid=chrome&ie=UTF-8");
			System.out.println("Protocol:" + url.getProtocol());
			System.out.println("Host Name:" + url.getHost());
			System.out.println("Port Number:" + url.getPort());
			System.out.println("Default Port Number:" + url.getDefaultPort());
			System.out.println("Query string:" + url.getQuery());
			System.out.println("Path:" + url.getPath());
			System.out.println("File:" + url.getFile());
			
			
		}
		catch(MalformedURLException e){
			System.out.println(e);
			
		}
	}

}
