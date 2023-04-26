package com.chapter5;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class Headersfield {
public static void main(String[] args)
{
	String urls[] = {"https://www.oreilly.com", "https://www.google.com"};
	
	for (int i = 0; i < urls.length; i++) {
		System.out.println("FOR" +urls[i]+"\n=================\n\n\n");
		
		try {
		URL u = new URL(urls[i]);
		URLConnection uc = u.openConnection();
		System.out.println("Content-type: " + uc.getContentType());
		
		if (uc.getContentEncoding() != null) {
		System.out.println("Content-encoding: " + uc.getContentEncoding());
		}
		
		if (uc.getDate() != 0) {
		System.out.println("Date: " + new Date(uc.getDate()));
		}
		if (uc.getLastModified() != 0) {
		System.out.println("Last modified: "+ new Date(uc.getLastModified()));
		}
		if (uc.getExpiration() != 0) {
		System.out.println("Expiration date: "+ new Date(uc.getExpiration()));
		}
		if (uc.getContentLength() != -1) {
		System.out.println("Content-length: " + uc.getContentLength());
		}
		} catch (MalformedURLException ex) {
		System.err.println(args[i] + " is not a URL I understand");
		} catch (IOException ex) {
		System.err.println(ex);
		}
		System.out.println();
		}
		}
	}

