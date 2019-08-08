package Logger;

public class FileLogger implements Logger {
    public void log(String msg) {
        FileUtil fileUtil = new FileUtil();
        fileUtil.writeToFile("log.txt", msg, true, true);
    }
}

