package twelve.practice;

public class ExceptionNine {
	public static void main(String args[]) throws Exception {
		try {
			test(1);
		} catch (Exception e) {
			if(e instanceof Exception1 || e instanceof Exception2 || e instanceof Exception3) {
				e.printStackTrace();
			} else {
				throw e;
			}
		}
	}
	public static void test(int i) throws Exception1, Exception2, Exception3 {
		switch (i) {
		case 1:
			throw new Exception1();
		case 2:
			throw new Exception2();
		case 3:
			throw new Exception3();
		default:
			break;
		}
	}
}
class Exception1 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class Exception2 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class Exception3 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
