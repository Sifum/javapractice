package thirteen.stringTest;

public class Ex9 {
	private static String knight = "when you have found the shrubbery";
	
	public static void main(String[] args) {
		String ss = knight.replaceAll("[aeiou]", "_");
		System.out.println(ss);
	}
}
