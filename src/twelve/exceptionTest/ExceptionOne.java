package twelve.exceptionTest;

/**
 * ��дһ���࣬����main()������try�����׳�һ��Exception��Ķ��󡣴���һ���ַ�����
 * Exception�Ĺ���������catch�Ӿ��ﲶ����쳣���󣬲��Ҵ�ӡ�ַ����
 * ���һ��finally�Ӿ䣬��ӡһ����Ϣ��֤������ȷʵ�õ���ִ��
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
