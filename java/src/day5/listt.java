package day5;

import java.util.LinkedList;
import java.util.List;

public class listt {

	public static void main(String[] args) {
		
		 {
			 List nameList = new LinkedList<String> ();
		 
			 String [] names = {"Ann", "Bob", "Carol"}; 
		 
			 // Add to arrayList 
			 
			 for (int k = 0; k < names.length; k++) nameList.add(names[k]); 
			 
			 // Display name list 
		 
			 for (int k = 0; k < nameList.size(); k++) 
		 
				 System.out.println(nameList.get(k)); 
			 }
	}
}
