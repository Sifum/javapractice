package seventeen.deepCollectionTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import all.Countries;


/**
 * 使用countries，用同样地数据多次填充Set，然后验证此Set中没有重复地元素
 * 使用HashSet，LinkedHashSet和TreeSet做测试
 * @author Administrator
 *
 */
public class EX3 {
	public static void main(String args[]) {
		Set<String> countiesSet = new HashSet<>();
		for(int i = 0; i < Countries.Data.length; i++) {
			if (Countries.Data[i][0].startsWith("A")) {
				countiesSet.add(Countries.Data[i][0]);
			}
		}
		
		
		for(int i = 0; i < Countries.Data.length; i++) {
			if (Countries.Data[i][0].startsWith("A")) {
				countiesSet.add(Countries.Data[i][0]);
			}
		}
		
		System.out.println(countiesSet);
		
	}
}
