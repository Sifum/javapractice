package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void main(String args[]) {
		for(Map.Entry entry:System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	public static List<String> sayName(String ...names) {
		List<String> lists = Arrays.asList(names);
		return lists;
	}
	
}
