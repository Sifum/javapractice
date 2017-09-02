package common;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * 过滤文件
 * @author pocan
 *
 */
public class DirFilter implements FilenameFilter {
	
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
	
}