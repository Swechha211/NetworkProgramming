package com.chapter5;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class SourceViewer3 {
	public static void main (String[] args){
		String url ="https://www.oreilly.com";
		try{
			URL u = new URL(url);
			HttpURLConnection uc = (HttpURLConnection) u.openConnection();
			int code = uc.getResponseCode();
			String respond = uc.getResponseMessage();
			System.out.println("HTTP/1.x" + code + "" + respond);
			
			//don't need this for including response message and code
			
//			for(int j = 1; ; j++){
//				String header = uc.getHeaderField(j);
//				String key = uc.getHeaderFieldKey(j);
//				if(header == null) break;
//				System.out.println(uc.getHeaderFieldKey(j) +":"+ header);
//			}
//			System.out.println();
//			try(InputStream in = new BufferedInputStream(uc.getInputStream())){
//				Reader r = new InputStreamReader(in);
//				int c;
//				while((c = r.read()) != -1){
//					System.out.print((char) c);
//				}
//				System.out.println();
//			}catch(MalformedURLException ex){
//				System.err.println(url + "is not a URL I understand");
//			}
		}catch(IOException ex){
			System.err.print(ex);
		}
	}

}
