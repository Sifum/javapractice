package thirteen.practice;

/**
 * 编写一个正则，检查一个句子是否以大写字母开头，以句号结尾。
 * @author Administrator
 *
 */
public class StringSeven {
	private static String s = "My name is minson.";
	
	public static void main(String args[]) {
		if (s.matches("^[A-Z]{1}.+\\.$")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
}
