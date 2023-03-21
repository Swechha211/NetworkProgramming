package com.networkprogramming;
import java.net.*;

public class FirstDemo 
{
  public static void main(String[] args)
  {
	  
	  try
	  {
		  InetAddress i1 =  InetAddress.getByName("www.google.com");
		  System.out.println(i1);
		  InetAddress i =  InetAddress.getByName("www.123.com");
		  System.out.println(i);
		 
	  }
	  catch(UnknownHostException e){
		  
		  System.out.println("Unknown host");
	  }
  }
}
