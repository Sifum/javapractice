package twelve.practice;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException1 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public LoggingException1() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class ExceptionSix {
	public static void main(String args[]) {
		try {
			throw new LoggingException1();
		} catch (LoggingException1 e) {
			System.err.println("Caught " + e);
		}
	}
}
