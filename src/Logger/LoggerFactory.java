package Logger;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {
    public String LogginType() {
        Properties p = new Properties();

        try {
            p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
            String LoggingType = p.getProperty("LoggingType");

            switch (LoggingType)
            {
                case "CONSOLE":
                    return "Console";

                case "FILE":
                    return "File";

                case "DATABASE":
                    return "Database";

                default:
                    return null;
            }
        }
        catch (IOException e)
        {
            return null;
        }
    }

    //Factory Method
    public Logger getLogger() {

        switch (LogginType())
        {
            case "Console":
                return new ConsoleLogger();

            case "File":
                return new FileLogger();

            case "Database":
                return new DatabaseLogger();

            default:
                return null;
        }
    }
}

