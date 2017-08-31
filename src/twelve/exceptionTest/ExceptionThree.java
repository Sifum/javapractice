package twelve.exceptionTest;

/**
 * ��д�ܲ����ܲ���ArrayIndexOutOfBoundsException�쳣�Ĵ���
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
