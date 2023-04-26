package com.chapter5;

import java.io.IOException;
import java.net.*;

public class Arbitaryheaderfields {
	public static void main(String[] args)
	{
		String url= "https://www.oreilly.com";
		try {
			URL u = new URL(url);
			URLConnection uc = u.openConnection();
			for(int j =1; ; j++)
			{
				String header = uc.getHeaderField(j);
				if(header == null) break;
				System.out.println(uc.getHeaderFieldKey(j)+":"+header);
			}
			
			
		} catch (MalformedURLException ex) {
			// TODO: handle exception
			System.err.println(url +"is not a URL I understand");
		}catch(IOException ex){
			System.err.println(ex);
		}
	}

}
