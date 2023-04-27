package byItAcademy.Lesson_15.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoFilesMain {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/byItAcademy/Lesson_15/Practice/test.txt");
            int a;
            do {
                a = fileInputStream.read();
                if (a != -1) {
                    System.out.print((char) a);
                }
            } while (a != -1);
        } catch (Exception e) {
            System.out.println("Файл не найден");
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {

            }
        }
        int[] a = {100, 55, 58, 92, 34};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/byItAcademy/Lesson_15/Practice/writetest.txt");
            for (int c : a) {
                fileOutputStream.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
