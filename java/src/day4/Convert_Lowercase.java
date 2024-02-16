package day4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Convert_Lowercase {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList(
		
				"To", "be", "or", "Not", "to", "be");
	
		Set<String> words2 = words.stream()
			    
					.map(String::toLowerCase)
			 
			    .collect(Collectors.toSet());
		
		System.out.println("word set = " + words2);
		
		
		

	}

}