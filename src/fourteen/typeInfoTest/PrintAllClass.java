package fourteen.typeInfoTest;

//写一个方法，令它接收任意对象作为参数，并能够递归打印出该对象所在的继承体系中的所有类
public class PrintAllClass {
	public static void printClass(Class cc) {
		if (cc.getSuperclass() == null) {
			return;
		}
		System.out.println(cc.getSuperclass().getName());
		printClass(cc.getSuperclass());
	}
	public static void main(String args[]) {
		try {
			Class<?> cc = Class.forName("fourteen.practice.FancyToy");
			PrintAllClass.printClass(cc);
		} catch (ClassNotFoundException e) {
			System.err.println("Class is not found");
		}
		
	}
}
