package com.networkprogramming;
import java.net.*;
public class UrlExample {
	
	public static void main(String[] args){
		try{
		URL myurl = new URL(" https://drive.google.com/drive/folders/1S1IcyK5AV2_5XCJ3fBiEnbGkrDaQxPMF");
		URL u2 = new URL(myurl,"mailinglists.html");	
		}
		catch(MalformedURLException ex){
			System.out.println("Error");
		}

	}

}
