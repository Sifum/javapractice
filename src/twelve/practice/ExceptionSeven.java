package twelve.practice;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("LoggingException");
	
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class ExceptionSeven {
	public static void main(String args[]) {
		try { 
			String[] arr = {"adf", "dfs"};
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			try {
				throw new LoggingException();
			} catch (LoggingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
