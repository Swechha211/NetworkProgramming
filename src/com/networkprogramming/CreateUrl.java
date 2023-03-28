package com.networkprogramming;
import java.net.*;

import java.net.MalformedURLException;

public class CreateUrl {
	public static void main(String[] args){
		try{
			URL u = new URL("https://drive.google.com/drive/folders/1S1IcyK5AV2_5XCJ3fBiEnbGkrDaQxPMF");
			System.out.println("The authority is "+u.getAuthority()); //returns the authority of url
			System.out.println("The path is "+u.getPath()); //returns a string containing path and file portio of url
			System.out.println("The port is "+u.getPort()); //returns port number of url
			System.out.println("The file is "+u.getFile()); //returns the file name of url
			System.out.println("The host is "+u.getHost()); //returns the host name of url
			System.out.println("The user info is "+u.getUserInfo()); //returns user information 
			System.out.println("The reference is "+u.getRef()); //returns the anchor or reference of url
			System.out.println("The default port is "+u.getDefaultPort()); //returns the default port used by url
			System.out.println("The string of url is "+u.toString()); //returns the string representation of url
			
		}
		catch(MalformedURLException m){
			System.out.println("Something went wrong");
		}
	}

}
