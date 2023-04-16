package com.networkprogramming;
import java.net.*;

public class UriExample {
	public static void main(String[] args){
		String[] uris = { "www.google.com",
				"tel:+1-800-9988-9938"};
		for(int i = 0; i<uris.length; i++){
			
		
			try{
				URI u = new URI(uris[i]);
				System.out.println("The URI is" + u);
				if(u.isOpaque()){
					System.out.println("This is an opaque URI ");
					System.out.println("The scheme is "+ u.getScheme());
					System.out.println("The scheme specific part is "+ u.getSchemeSpecificPart());
					System.out.println("The scheme fragment id is "+ u.getFragment());
				}
				else{
					System.out.println("This is a hierarchical URI");
					System.out.println("This schema is" + u.getScheme());
					try{
						u = u.parseServerAuthority();
						System.out.println("The host is "+ u.getHost());
						System.out.println("The user info is "+ u.getUserInfo());
						System.out.println("The port is "+ u.getPort());
						
					}
					catch(URISyntaxException ex){
						System.out.println("The authority is" + u.getAuthority());
						
					}
					System.out.println("This part is "+ u.getPath());
					System.out.println("This query string is "+ u.getQuery());
					System.out.println("This fragment id is "+ u.getFragment());
				}
				
			}
			catch(URISyntaxException ex){
				System.out.println(uris[i] + "doesnot seem to be a uri");
			}
			System.out.println();
			
		}
		
	}

}
