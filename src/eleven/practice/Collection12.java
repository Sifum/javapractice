package eleven.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Collection12 {
	public static void main(String args[]) {
		List<Integer> listsOne = new ArrayList<>();
		List<Integer> listsTwo = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			listsOne.add(i);
			listsTwo.add(i);
		}
		ListIterator<Integer> lit = listsOne.listIterator();
//		while(lit.hasPrevious()) {
//			listsTwo.add(lit.previous());
//		}
		
		System.out.println(listsTwo);
	}
}
