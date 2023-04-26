package com.chapter5;
import java.net.*;
import java.util.*;
import java.io.*;
public class LastModified {
public static void main(String[] args)
{
	String url = "http://www.ibiblio.org/xml";
	try {
		URL u  = new URL(url);
		HttpURLConnection http = (HttpURLConnection) u.openConnection();
		http.setRequestMethod("HEAD");
		System.out.println(u+"was last modified at"+new Date(http.getLastModified()));
		
	} catch (MalformedURLException ex) {
		// TODO: handle exception
		System.err.println(url +"is not a URL I understand");
	}
	catch (IOException ex) {
		// TODO: handle exception
		System.err.println(ex);
	}
	System.out.println();
	}
}
