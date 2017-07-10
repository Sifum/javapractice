package twelve.practice;

/**
 * 使用while循环建立类似“恢复模型”的异常处理行为，它将不断重复，直到异常不再抛出
 * @author Administrator
 *
 */
public class ExceptionFive {
	private static int[] arr = {25, 60};
	static int x = 5;
	public static void main(String args[]) {
		while(true) {
			try {
				System.out.println(arr[x]);
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				x--;
			} finally {
				System.out.println("we are done!");
			}
		}
	}
	
}





  