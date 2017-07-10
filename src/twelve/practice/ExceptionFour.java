package twelve.practice;

/**
 * 使用extends关键字建立一个自定义异常类。
 * 为这个类写一个接收字符串参数的构造器，把此参数保存在对象内部的字符串引用中。
 * 写一个方法显示此字符串。写一个try-catch子句，对这个新异常进行测试。
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
