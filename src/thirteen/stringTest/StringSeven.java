package thirteen.stringTest;

/**
 * ��дһ�����򣬼��һ�������Ƿ��Դ�д��ĸ��ͷ���Ծ�Ž�β��
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
