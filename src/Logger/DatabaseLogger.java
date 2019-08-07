package Logger;

public class DatabaseLogger implements Logger{
    public void log(String msg) {
        System.out.println("By Database: " + msg);
    }
}
