package fourteen.practice;

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
		//類全名和是否是接口
		System.out.println("Class name: " + cc.getName() +
				" is interface? [" + cc.isInterface() + "]");
		//直接類名稱
		System.out.println("Simple name: " + cc.getSimpleName());
		//包加類名稱
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			//必須使用全限定名
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
		//會得到直接基類
		Class<?> up = c.getSuperclass();
		Object obj = null;
		try {
			//使用此實例化，必須帶有默認的構造器
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
