package thirteen.stringTest;

import java.util.ArrayList;
import java.util.List;


/**
 * Ex1:
 * 修复InfiniteRecursion
 * @author pocan
 *
 */
public class InfiniteRecursion {
	public String toString() {
		//打印出对象的内存地址，应该调用的是Object.toString()，所以
		//不该使用this， 而应该调用super.toString()
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
