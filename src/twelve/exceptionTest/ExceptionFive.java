package twelve.exceptionTest;

/**
 * ʹ��whileѭ���������ơ��ָ�ģ�͡����쳣������Ϊ������ظ���ֱ���쳣�����׳�
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





  