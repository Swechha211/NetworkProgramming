/* 
 * To summarize, posting data to a form requires these steps:
 * 1. Decide what name-value pairs you’ll send to the server-side program.
 * 2. Write the server-side program that will accept and process the request. If it doesn’t
	  use any custom data encoding, you can test this program using a regular HTML
      form and a web browser.
   3. Create a query string in your Java program. The string should look like this:
   		name1=value1&name2=value2&name3=value3
      This is done as: Pass each name and value in the query string to URLEncoder.encode() before
      adding it to the query string.
   4. Open a URLConnection to the URL of the program that will accept the data.
   5. Set doOutput to true by invoking setDoOutput(true).
   6. Write the query string onto the URLConnection’s OutputStream.
   7. Close the URLConnection’s OutputStream
   8. Read the server response from the URLConnection’s InputStream.
 */

package com.chapter5;
import java.io.*;
import java.net.*;
public class FormPoster {
	private URL url;
	private QueryString query = new QueryString();
	
	public FormPoster(URL url){
		if(!url.getProtocol().toLowerCase().startsWith("http")){
			throw new IllegalArgumentException("Posting only works for http urls");
			
		}
		this.url = url;
	}
	public void add(String name, String value){
		query.add(name, value);
		
	}
	
	public URL getURL(){
		return this.url;
	}
	
	public InputStream post() throws IOException{
		
		//open the connection and prepare it to POST
		URLConnection uc = url.openConnection();
		uc.setDoOutput(true);
		try(OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream(),"UTF-8")){
			//The POST line, the Content-type header,
			//and the Content-length headers are sent by the URLConnection
			//we just need to send the data
			out.write(query.toString());
			out.write("\r\n");
			out.flush();
		}
		//Return the response
		return uc.getInputStream();
		
	}
	
	
	public static void main(String[] args){
		String ur = "http://www.ibiblio.org";
		URL url;
		if(args.length > 0){
			try{
				url = new URL(args[0]);
			}catch(MalformedURLException ex){
				System.err.println("Usage: java FOrmPoster url");
				return;
			}
		}else{
			try{
				url = new URL("http://www.cafeaulait.org/books/jnp4/postquery.phtml");
				
			}catch(MalformedURLException ex){
				System.err.println("Usage: java FOrmPoster url");
				return;
			}
		}
		
		FormPoster poster = new FormPoster(url);
		poster.add("name", "Swechha");
		poster.add("email", "swechha@ibiblio.org");
		
		try(InputStream in = poster.post()){
			//Read the response
			Reader r = new InputStreamReader(in);
			int c;
			while((c = r.read()) != -1){
				System.out.print((char) c);
			}
			
		}catch(IOException ex){
			System.err.print(ex);
			
		}
		
	}

}
