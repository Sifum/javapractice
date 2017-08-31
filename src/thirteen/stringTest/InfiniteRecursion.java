package thirteen.stringTest;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	public String toString() {
		//this����ǰ�桰+���ŷ�����ת��
//		return "InfiniteRecursion address: " + this + "\n";
		return "InfiniteRecursion address: " + super.toString() + "\n";
	}
	
	public static void main(String args[]) {
		List<InfiniteRecursion> v = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}
	
}
