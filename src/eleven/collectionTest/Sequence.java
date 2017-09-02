package eleven.collectionTest;

import java.util.ArrayList;

/*
 * 
 */
interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Sequence {

	ArrayList<Object> items;

	public Sequence() {
		items = new ArrayList<>();
	}
	
	public void add(Object x) {
		items.add(x);
	}
	
	private class SequenceSelector implements Selector {
		
		private int i = 0;
		
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.size();
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items.get(i);
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i < items.size()) {
				i++;
			}
		}
		
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String args[]) {
		Sequence sequence = new Sequence();
		for(int i = 0; i < 10; i++) {
			sequence.add(i);
		}
		
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
		}
		
	}
	
	
}
