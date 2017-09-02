package thirteen.stringTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 组的概念
 * @author pocan
 *
 */
public class Ex12 {
	private static String lyrics = "ABCD";

	public static void main(String args[]) {
		String reg = "A(B(C))D";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(lyrics);
		while(matcher.find()) {
			//注意循环的<=
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println(matcher.group(i));
			}
		}
	}
}
