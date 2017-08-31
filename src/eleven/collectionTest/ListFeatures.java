package eleven.collectionTest;

import java.util.ArrayList;
import java.util.List;


public class ListFeatures {
	public static void main(String args[]) {
//		Random rand = new Random(47);
		List<Integer> integers = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			integers.add(i);
		}
		System.out.println("1: " + integers);
		
		Integer a = new Integer(20);
		integers.add(a);
		System.out.println("2: " + integers);
		System.out.println("3: " + integers.contains(a));
		
		integers.remove(a);
		Integer b = integers.get(2);
		System.out.println("4: " + b + " " + integers.indexOf(b));
		
		//ʡ��
		
	}
}
