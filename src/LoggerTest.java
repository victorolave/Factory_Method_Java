import Logger.Logger;
import Logger.LoggerFactory;

import java.util.Scanner;

public class LoggerTest {

    public static void main(String[] args) {

        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();

        logger.log("Put the message here!");
    }
}

