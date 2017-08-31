package twelve.exceptionTest;

/**
 * ʹ��extends�ؼ��ֽ���һ���Զ����쳣�ࡣ
 * Ϊ�����дһ�������ַ����Ĺ��������Ѵ˲�����ڶ����ڲ����ַ������С�
 * дһ��������ʾ���ַ�дһ��try-catch�Ӿ䣬��������쳣���в��ԡ�
 * @author Administrator
 *
 */
class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  String msg;
	public MyException(String msg) {
		super(msg);
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}

public class ExceptionFour {
	public static void main(String args[]) {
		try {
			throw new MyException("This is my exception");
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
