package com.chapter5;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;
import java.util.*;

public class ModifiedSince {
	public static void main(String [] Args){
		Date today = new Date();
		long millisecondsPerDay = 24*60*60*1000;
		String urls[] = {"https://www.google.com"};
		for (int i = 0; i < urls.length; i++) {
			try {
				URL u = new URL(urls[i]);
				URLConnection uc = u.openConnection();
				System.out.println("Original if modified since"+new Date(uc.getIfModifiedSince()));
				uc.setIfModifiedSince((new Date(today.getTime()-millisecondsPerDay)).getTime());
				System.out.println("Will retrieve file if its modified since"+new Date(uc.getIfModifiedSince()));
				try(InputStream in = new BufferedInputStream(uc.getInputStream())){
					Reader r = new InputStreamReader(in);
					int c;
					while((c=r.read())!=-1){
						System.out.print((char)c);
					}
					System.out.println();
				}
			} catch (IOException ex) {
				// TODO: handle exception
				System.err.println(ex);
			}
		}
	}

}
