package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
	
	public static Boolean matchRegex(String ss, String reg) {
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(ss);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
}
