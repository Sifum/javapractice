package thirteen.stringTest;

public class StringSix {

	private int a = 10;
	private long b = 245514;
	private float f = 10.52854F;
	private double d = 10.255D;
	
	@Override
	public String toString() {
		return String.format("%d, %d, %f, %f", a, b, f, d);
	}
	public static void main(String args[]) {
		StringSix s = new StringSix();
		System.out.println(s);
	}
	
}
