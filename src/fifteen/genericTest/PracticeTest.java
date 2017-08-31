package fifteen.genericTest;

/*
 * ����һ���������������Ľӿڣ��Լ�һ��ʵ��������ӿڲ��������һ���������ࡣ
 * ����һ�����У�����һ�����ͷ�������Ĳ�������������ӿڶ����˱߽磬��չʾ�ýӿ�
 * �еķ�����������ͷ����ж��ǿɵ��õġ���main���������д���һ��ʵ�����ʵ������
 * ���ͷ���
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
