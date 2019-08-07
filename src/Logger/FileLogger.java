package Logger;

public class FileLogger implements Logger {
    public void log(String msg) {
//        FileUtil futil = new FileUtil();
//        futil.writeToFile("log.txt", msg, true, true);
        System.out.println("By File: " + msg);
    }
}

