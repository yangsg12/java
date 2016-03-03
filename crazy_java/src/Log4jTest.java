import org.apache.logging.log4j.*;

/**
 * Created by Yang on 2015/7/12.
 */
public class Log4jTest {
    private static  Logger logger = org.apache.logging.log4j.LogManager.getLogger("hello world");

    public static void main(String[] args) {
        logger.debug("debug");
        logger.error("hello error");
    }
}
