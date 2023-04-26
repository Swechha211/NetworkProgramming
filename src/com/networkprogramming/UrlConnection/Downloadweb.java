package com.chapter5;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;
public class Downloadweb {
public static void main(String[] args)
{
	String url = "https://www.oreilly.com";
	try {
		URL u = new URL(url);
		URLConnection uc =u. openConnection();
		try(InputStream raw = uc.getInputStream()) {
			InputStream buffer = new BufferedInputStream(raw);
			Reader reader = new InputStreamReader(buffer);
			int c;
			while ((c = reader.read()) !=-1) {
				System.out.print((char)c);
				
			}
			
		} catch (MalformedURLException ex) {
			System.err.println(url+"is not parsable URL");
			// TODO: handle exception
		}
		
	} catch (IOException ex) {
		// TODO: handle exception
		System.err.println(ex);
	}
	}
}
