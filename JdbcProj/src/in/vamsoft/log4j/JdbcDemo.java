package in.vamsoft.log4j;
import org.apache.log4j.*;;

public class JdbcDemo {
  public static Logger logger=Logger.getLogger(JdbcDemo.class);
	public static void main(String[] args) {
		try {
			logger.info("Main method started");
			System.out.println("Main executing");
			int result=10/0;
			logger.info("Main method finished");
		}catch(ArithmeticException e) {
			logger.error("An error occured in main");
		}
		

	}

}
