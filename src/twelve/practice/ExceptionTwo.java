package twelve.practice;

/**
 * 定义一个对象引用并初始化为null,尝试用此引用调用方法。把这个调用放在try-catch子句里以捕获异常
 * @author Administrator
 *
 */
public class ExceptionTwo {
	public static void main(String args[]) {
		try {
			Integer i = 0;
			Integer.bitCount(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
