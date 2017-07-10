package twelve.practice;

/**
 * 编写一个类，在其main()方法的try块里抛出一个Exception类的对象。传递一个字符串参数给
 * Exception的构造器。在catch子句里捕获此异常对象，并且打印字符串参数。
 * 添加一个finally子句，打印一条信息以证明这里确实得到了执行
 * @author Administrator
 *
 */
public class ExceptionOne {
	
	public static void main(String args[]) {
		try {
			throw new Exception("one exception");
		} catch (Exception e) {
			System.out.println("EX msg" + e.getMessage());
		} finally {
			System.out.println("finally is executed!");
		}
	}
}
