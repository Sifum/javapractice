package fifteen.practice;

import java.util.ArrayList;
import java.util.List;

//·ºÐÍ»¯innerclasses/Sequence.java
interface Selector {
	boolean end();
	Object current();
	void next();
}
public class Sequence<E> {
	private List<E> list = new ArrayList<>();
	public Sequence(List<E> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	public void add(E e) {
		list.add(e);
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == list.size();
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return list.get(i);
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i < list.size()) i++; 
		}
		
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		Sequence<Integer> sequence = new Sequence<Integer>(list);
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current() + "");
			selector.next();
		}
	}
}
