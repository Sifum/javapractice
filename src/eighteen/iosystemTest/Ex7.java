package eighteen.iosystemTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 打开文件，每次读取一行内容。将每行作为一个String读入，并将那个String对象置入一个
 * LinkedList中。按相反的顺序打印出LinkedList中的所有行。
 * @author pocan
 *
 */
public class Ex7 {
	
	public static void read(String name) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(name));
		List<String> lists = new LinkedList<>();
		String s;
		while((s = in.readLine()) != null) {
			lists.add(s);
		}
		in.close();
		readReverse(lists);
	}
	
	public static void readReverse(List<String> lists) {
		//ListIterator可指定初始化位置
		int len = lists.size();
		ListIterator<String> it = lists.listIterator(len);
		while(it.hasPrevious()) {
			String s = it.previous();
			System.out.println(s);
		}
	}
	
	public static void main(String args[]) throws Exception {
		try {
			read("./source/word.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
