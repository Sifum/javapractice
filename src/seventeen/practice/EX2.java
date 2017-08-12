package seventeen.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import common.Countries;

/**
 * 生成要给Map和set,使其包含所有以A开头地国家
 * @author Administrator
 *
 */
public class EX2 {
	public static void main(String args[]) {
		Map<Integer, String> countriesMap = new HashMap<>();
		Set<String> countiesSet = new HashSet<>();
		for(int i = 0; i < Countries.Data.length; i++) {
			if (Countries.Data[i][0].startsWith("A")) {
				countriesMap.put(i, Countries.Data[i][0]);
				countiesSet.add(Countries.Data[i][0]);
			}
		}
		
		System.out.println(countriesMap);
		System.out.println(countiesSet);
		
	}
}
