package twelve.practice;

/**
 * 编写能产生并能捕获ArrayIndexOutOfBoundsException异常的代码
 * @author Administrator
 *
 */
public class ExceptionThree {
	public static void main(String args[]) {
		try { 
			String[] arr = {"adf", "dfs"};
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
