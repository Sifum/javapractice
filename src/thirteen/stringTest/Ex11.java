package thirteen.stringTest;

import common.RegexUtil;

/**
 * 匹配字符串
 * @author pocan
 *
 */
public class Ex11 {
	private static String ss = "Arline ate eight apples and one orange while Anita hadn't any";
	public static void main(String args[]) {
		String reg= "(?!)((^[aeiou])|(\\s+[aeiou]))\\w?[aeiou]\\b";
		System.out.println(RegexUtil.matchRegex(ss,reg));
	}
}
