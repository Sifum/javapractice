package fourteen.typeInfoTest;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy implements HasBatteries, Waterproof,Shoots {
	public Toy() {
	}
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
		//打印类对象的名称和是否接口
		System.out.println("Class name: " + cc.getName() +
				" is interface? [" + cc.isInterface() + "]");
		//得到类对象的不包括包名的类名
		System.out.println("Simple name: " + cc.getSimpleName());
		//得到全限定的类名
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class<?> c = null;
		try {
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
		//得到直接基类
		Class<?> up = c.getSuperclass();
		Object obj = null;
		try {
			//实例化的类必须具有默认构造器
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
