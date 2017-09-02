package eighteen.iosystemTest;

import java.io.File;

import common.DirFilter;

/**
 * 文件列表和按条件搜索的文件列表
 * @author pocan
 *
 */
public class SortedDirList {
	
	private static String[] lists;
	private static File pathFile;
	
	public static void main(String args[]) {
		pathFile = new File(".");
		getList("s.c");
		for (String fileName : lists) {
			System.out.println(fileName);
		}
	}
	
	public static String[] getList() {
		lists = pathFile.list();
		return lists;
	}

	public static String[] getList(String filterName) {
		lists = pathFile.list(new DirFilter(filterName));
		return lists;
	}
}
