package day4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) 
	{
		  try 
		  {
	            FileWriter fileWriter=new FileWriter("my.txt");
	            fileWriter.write("This is the text");
	            fileWriter.close();  	
		  } 
		  
		  catch (IOException e) 
		  { 
			  e.printStackTrace();
	      }
	}
}