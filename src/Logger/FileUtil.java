package Logger;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil{

    public void writeToFile(String fileName, String msg, boolean a, boolean b) {

        try
        {
            FileWriter fileWriter = new FileWriter("Your Path/"+fileName);
            fileWriter.write(msg);
            fileWriter.close();
            System.out.println("The message: " + msg + ", saved succesfully in " + fileName);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

}