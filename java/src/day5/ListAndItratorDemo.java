package day5;

import java.util.ArrayList;
import java.util.List;

public class ListAndItratorDemo {

	public static void main(String[] args) {

		List lst=new ArrayList();
		
		lst.add("one");
		lst.add("two");
		lst.add("three");
		lst.add("four");
		
		for(Object obj:lst) {
			System.out.println(obj);
		}
		
		for (int i = 0; i < lst.size(); i++) {
		System.out.println(lst.get(i));
		}
	System.out.println(lst);
	}

}
