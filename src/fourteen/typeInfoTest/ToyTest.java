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
		//�ȫ����Ƿ��ǽӿ�
		System.out.println("Class name: " + cc.getName() +
				" is interface? [" + cc.isInterface() + "]");
		//ֱ�����Q
		System.out.println("Simple name: " + cc.getSimpleName());
		//������Q
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			//���ʹ��ȫ�޶���
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
		//���õ�ֱ�ӻ��
		Class<?> up = c.getSuperclass();
		Object obj = null;
		try {
			//ʹ�ôˌ����횎���Ĭ�J�Ę�����
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
