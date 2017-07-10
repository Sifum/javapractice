package fifteen.practice20;

/*
 * 创建一个具有两个方法的接口，以及一个实现了这个接口并添加了另一个方法的类。
 * 再另一个类中，创建一个泛型方法，它的参数类型由这个接口定义了边界，并展示该接口
 * 中的方法再这个泛型方法中都是可调用的。再main（）方法中传递一个实现类的实例给这个
 * 泛型方法
 */
interface A {
	void f();
	void g();
}

class B implements A {

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("B f()");
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		System.out.println("B g()");
	}
	
	public void h() {
		System.out.println("B h()");
	}
	
}

class G {
	public static <T extends A> void j(T x) {
		x.f();
		x.g();
	}
}

public class PracticeTest {
	public static void main(String args[]) {
		B b = new B();
		G.j(b);
	}
}
