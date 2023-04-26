package com.chapter5;

import java.io.IOException;
import java.net.*;

public class Geturldemo {
	public static void main(String [] args)
	{
		try {
			URL u = new URL("https://www.oreilly.com");
			URLConnection uc = u.openConnection();
			System.out.println(uc.getURL());
			
		} catch (IOException ex) {
			// TODO: handle exception
			System.err.println(ex);
		}
	}

}
