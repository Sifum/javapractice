package twelve.exceptionTest;

/**
 * ����һ���������ò���ʼ��Ϊnull,�����ô����õ��÷�������������÷���try-catch�Ӿ����Բ����쳣
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
