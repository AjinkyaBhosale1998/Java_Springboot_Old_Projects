package day4;

import java.util.ArrayList;

public class sumofvalues {

	public static void main(String[] args) {

		
		ArrayList<Integer> list =
		        new ArrayList<Integer>();
		list.add(-42);
		list.add(-17);
		list.add(68);
		list.stream()
		    .map(Math::abs)
		    .forEach(System.out::println);
	}

}
