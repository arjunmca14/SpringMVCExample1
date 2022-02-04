
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class LoggerExample {
	
	
	private static Logger log=LoggerFactory.getLogger(LoggerExample.class);
	
	public static void main(String[] args) {
		log.trace("this is a string");
		//OR 
		System.out.println("this is a String ");
	}

}
