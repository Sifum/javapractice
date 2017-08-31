package seventeen.deepCollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.Countries;

/**
 * 创建一个List，然后用Countries来填充，对该列表排序并打印，然后将Collection.shuffle()
 * 方法重复地应用于该列表，并且每次打印它。
 * @author Administrator
 *
 */
public class EX1 {
	public static void main(String args[]) {
		List<String> countries = new ArrayList<>();
		for(String[] s: Countries.Data) {
			for(String c: s) {
				countries.add(c);
			}
		}
		
		System.out.println("初始顺序：" + countries.toString());
		Collections.shuffle(countries);
		System.out.println("打乱顺序：" + countries.toString());
		Collections.shuffle(countries);
		System.out.println("打乱顺序：" + countries.toString());
		
	}
}
