package eleven.collectionTest;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
	public static void main(String args[]) {
//		Collection<Integer> c = new ArrayList<>();
//		for(int i = 0; i < 10; i++) {
//			c.add(i);
//		}
//		for(Integer j:c) {
//			System.out.println(j + "\n");
//		}
		
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
		c.add(i);
		}
		for(Integer j:c) {
			System.out.println(j + "\n");
		}		
		
	}
}
