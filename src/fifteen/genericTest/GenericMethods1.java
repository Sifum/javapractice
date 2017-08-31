package fifteen.genericTest;

import fifteen.genericTest.GenericMethods1;

/*
 * �޸�ǰһ����ϰ��������f()������һ�������޸�Ϊ�ǲ��������
 */
public class GenericMethods1 {
	public <T, E> void f(T x, E y, Float z) {
		System.out.println(x.getClass().getName() + " " + y.getClass().getName() + " " + z.getClass().getName());
	}
	
	public static void main(String args[]) {
		GenericMethods1 genericMethods = new GenericMethods1();
		genericMethods.f(1, "string", 2.0F);
	}
}
