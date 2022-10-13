package Practice.Examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

public class LogDemo {


    public static void main(String[] args) {
        Logger log=LogManager.getLogger(LogDemo.class.getName());

        //By default only error log will displayed on console

        log.error("Error Log");
        log.debug("Debug log");
        log.info("info log");
        log.warn("Warn log");
        log.log(INFO,"log level");

    }
}
