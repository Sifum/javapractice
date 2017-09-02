package thirteen.stringTest;

/**
 * 将字符串在the和you处分割
 * @author pocan
 *
 */
public class Ex8 {
	
	private static String knight = "when you have found the shrubbery";

	public static void main(String[] args) {
		String[] ss= knight.split("(the|you)");
		for (String s : ss) {
			System.out.println(s);
		}
	}
}
