package thirteen.practice;

import java.util.Formatter;

/**
 * 修改Receipt.java，令所有的宽度都由一个常量来控制。
 * @author Administrator
 *
 */
public class Receipt {
	private static int w = 10;
	private Formatter f = new Formatter(System.out);
	public void printTitle(String s) {
		f.format("%" + w + "s", s);
	}
	
	public static void main(String args[]) {
		Receipt receipt = new Receipt();
		receipt.printTitle("dsfds");
	}
}
