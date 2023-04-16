package com.networkprogramming;
import java.net.*;

public class UriDemo {
	public static void main(String[] args){
		try{
		URI u = new URI("http", "www.ibiblio.com", "/javafaq/index.html", "today");
		System.out.println(u);
	}
		catch(URISyntaxException e){
			System.out.println(e);
		}
	}

}
