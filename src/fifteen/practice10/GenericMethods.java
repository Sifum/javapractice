package fifteen.practice10;

import fifteen.practice10.GenericMethods;

/*
 * �޸�ǰһ����ϰ��������f()������һ�������޸�Ϊ�ǲ�����������
 */
public class GenericMethods {
	public <T, E> void f(T x, E y, Float z) {
		System.out.println(x.getClass().getName() + " " + y.getClass().getName() + " " + z.getClass().getName());
	}
	
	public static void main(String args[]) {
		GenericMethods genericMethods = new GenericMethods();
		genericMethods.f(1, "string", 2.0F);
	}
}
