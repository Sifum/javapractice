package eleven.collectionTest;

import java.util.ArrayList;
import java.util.List;

public class Collection7 {
	public static void main(String args[]) {
		List<Integer> lists = new ArrayList<>();
		for(int i = 0; i < 20; i++) {
			lists.add(i);
		}
		List<Integer> subLists = lists.subList(5, 10);
		System.out.println("sublists: " +  subLists);
		lists.removeAll(subLists);
		System.out.println("lists: " + lists);
	}
}
