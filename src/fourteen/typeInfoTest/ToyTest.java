package fourteen.typeInfoTest;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy implements HasBatteries, Waterproof,Shoots {
//	public Toy() {
//	}
	public Toy(int i) {
	}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots {
	public FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class<?> cc) {
<<<<<<< HEAD:src/fourteen/typeInfoTest/ToyTest.java
		//�ȫ����Ƿ��ǽӿ�
		System.out.println("Class name: " + cc.getName() +
				" is interface? [" + cc.isInterface() + "]");
		//ֱ�����Q
		System.out.println("Simple name: " + cc.getSimpleName());
		//������Q
=======
		//打印类对象的名称和是否接口
		System.out.println("Class name: " + cc.getName() +
				" is interface? [" + cc.isInterface() + "]");
		//得到类对象的不包括包名的类名
		System.out.println("Simple name: " + cc.getSimpleName());
		//得到全限定的类名
>>>>>>> 95611af4b313a9f9c02595d8d571462f11ab64c8:src/fourteen/practice/ToyTest.java
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class<?> c = null;
		try {
<<<<<<< HEAD:src/fourteen/typeInfoTest/ToyTest.java
			//���ʹ��ȫ�޶���
=======
			//参数必须为包+类全称
>>>>>>> 95611af4b313a9f9c02595d8d571462f11ab64c8:src/fourteen/practice/ToyTest.java
			c = Class.forName("fourteen.practice.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("cant't find FancyToy");
			System.exit(1);
		}
		
		printInfo(c);
		
		for(Class<?> face : c.getInterfaces()) {
			printInfo(face);
		}
<<<<<<< HEAD:src/fourteen/typeInfoTest/ToyTest.java
		//���õ�ֱ�ӻ��
		Class<?> up = c.getSuperclass();
		Object obj = null;
		try {
			//ʹ�ôˌ����횎���Ĭ�J�Ę�����
=======
		//得到直接基类
		Class<?> up = c.getSuperclass();
		Object obj = null;
		try {
			//实例化的类必须具有默认构造器
>>>>>>> 95611af4b313a9f9c02595d8d571462f11ab64c8:src/fourteen/practice/ToyTest.java
			obj = up.newInstance();
		} catch (InstantiationException e) {
			// TODO: handle exception
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			System.out.println("Cannot access");
			System.exit(1);
		}
		System.out.println(obj.getClass());
		
	}
}
