package byItAcademy.Lesson_15.Practice;

import java.io.File;
import java.io.FileWriter;

public class IoPath {
    public static void main(String[] args) {
        File file = new File("D:\\IT_Academy\\Lessons\\src\\byItAcademy\\Lesson_15","file.txt");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("ПоSFS");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
