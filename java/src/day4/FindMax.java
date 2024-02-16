package day4;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMax {

	public static void main(String[] args) {
		
		// print largest multiple of 10 in list
        // (does not compile!)
        
		OptionalInt largest = 
        
				IntStream.of(55, 20, 19, 31, 40, -2, 62, 30)
            
				.filter(n -> n % 10 == 0)
            
				.max();
     
		System.out.println(largest.getAsInt());
	}

}
