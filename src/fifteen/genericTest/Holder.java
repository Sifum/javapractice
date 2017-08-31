package fifteen.genericTest;

/*
 * ����һ��Holder�࣬ʹ���ܹ����о�����ͬ���͵�3�����󣬲��ṩ��Ӧ�Ķ�д����
 * ������Щ�����Լ�һ�����Գ�ʼ������е�3������Ĺ�����
 */
class Robot {
	private String name;
	public Robot(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class Holder<T> {
	private T x, y, z;

	public Holder(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public T getZ() {
		return z;
	}

	public void setZ(T z) {
		this.z = z;
	}
	
	public String toString() {
		return x + ", " + y + ", " + z;
	}
	
	public static void main(String args[]) {
		Robot robot1 = new Robot("bot1");
		Robot robot2 = new Robot("bot2");
		Robot robot3 = new Robot("bot3");
		
		Holder<Robot> holder = new Holder<Robot>(robot1, robot2, robot3);
		System.out.println(holder);
		
	}
	
	
}
