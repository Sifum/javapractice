package thirteen.stringTest;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 使用String.split()重写SplitDemo
 * @author pocan
 *
 */
public class Ex14 {
	public static void main(String[] args) {
		String inputString = "This is a good day!";
		System.out.println(Arrays.toString(Pattern.compile("\\s+").split(inputString)));
	}
}
