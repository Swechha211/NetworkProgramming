package com.networkprogramming;
import java.net.*;

public class AddressType {
	
	public static void main(String[] args)
	{
		try{
			InetAddress a = InetAddress.getByName("224.0.0.0");
			if(a.isAnyLocalAddress()){
				System.out.println(a + " is a wildcard address");
			}
		    if(a.isLoopbackAddress()){
		    	System.out.println(a + " is a loopback address");
			}
			 if(a.isLinkLocalAddress()){
				System.out.println(a + " is link-local address");
			}
			else if(a.isSiteLocalAddress()){
				System.out.println(a + " is site local address");
			}
			else{
				System.out.println(a + " is global address");
			}
			if(a.isMulticastAddress()){
				if(a.isMCGlobal()){
					System.out.println(a + " is MC global multicast address");
				}
				else if(a.isMCOrgLocal()){
					System.out.println(a + " is an organization wide multicast address");
				}
				else if(a.isMCSiteLocal()){
					System.out.println(a + " is an site wide multicast address");
				}
				else if(a.isMCLinkLocal()){
					System.out.println(a + " is an subnet wide multicast address");
				}
				else if(a.isMCNodeLocal()){
					System.out.println(a + " is an interface-local multicast address");
				}
				else{
					System.out.println(a + " is an unknown multicast address type");
				}
			}
			else{
				System.out.println(a + " is a unicast address");
			}
			
		    }
		catch(UnknownHostException e){
			System.out.println("Unknown Host");
		}
	}

}
