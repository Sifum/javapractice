package fifteen.practice9;

/*
 * 修改GenericMethods.java类，使f()可以接受三个类型各不相同的参数
 */
public class GenericMethods {
	public <T, E, V> void f(T x, E y, V z) {
		System.out.println(x.getClass().getName() + " " + y.getClass().getName() + " " + z.getClass().getName());
	}
	
	public static void main(String args[]) {
		GenericMethods genericMethods = new GenericMethods();
		genericMethods.f(1, "string", 1.0F);
	}
}
