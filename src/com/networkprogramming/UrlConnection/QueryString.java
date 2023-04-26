/*  
 * 
 * QueryString class that uses URLEncoder to encode successive name
and value pairs in a Java object, which will be used for sending data to server-side
programs. To add name-value pairs, call the add() method, which takes two strings as
arguments and encodes them. The getQuery() method returns the accumulated list of
encoded name-value pairs
 * 
 * 
 */

package com.chapter5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
public class QueryString {
	private StringBuilder query = new StringBuilder();
	 public QueryString(){
		
	}
	public synchronized void add(String name, String value){
		query.append('&');
		encode(name, value);
	}
	public synchronized void encode(String name, String value){
		try{
			  query.append(URLEncoder.encode(name, "UTF-8" ));
			  query.append('=');
			  query.append(URLEncoder.encode(value, "UTF-8"));
		}catch(UnsupportedEncodingException ex){
			throw new RuntimeException("Broken VM doesnot support UTF-8 ");
			
		}
	}
	
	public synchronized String getQuery(){
		return query.toString();
	}
	
	public String toString(){
		return getQuery();
	}

}
