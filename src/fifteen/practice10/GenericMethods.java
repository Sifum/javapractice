package fifteen.practice10;

import fifteen.practice10.GenericMethods;

/*
 * 修改前一个练习，将方法f()的其中一个参数修改为非参数化的类型
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
