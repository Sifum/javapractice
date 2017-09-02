package eighteen.iosystemTest;

import java.io.File;
import java.util.Arrays;
import common.DirFilter;

/**
 * EX1, EX3:
 * 文件目录和大小
 * 
 * @author pocan
 *
 */
public class DirList {
	public static void main(String args[]) {
		File path = new File(".");
		long fileSize = path.length();
		System.out.println("Total size:" + fileSize);
		String[] list;
		list = path.list(new DirFilter("src"));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}
}