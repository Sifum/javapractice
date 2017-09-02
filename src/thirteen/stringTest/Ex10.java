package thirteen.stringTest;

import common.RegexUtil;


/**
 * 能否发现一个匹配
 * @author pocan
 *
 */
public class Ex10 {
	
	private static String str = "Java now has regular expressions";
	
	public static void main(String[] args) {
		String reg1 = "^Java",
			   reg2 = "s?",
			   reg3 = "has";
		System.out.println(RegexUtil.matchRegex(str, reg1));
		System.out.println(RegexUtil.matchRegex(str, reg2));
		System.out.println(RegexUtil.matchRegex(str, reg3));
	}
	
}
