package byItAcademy.Lesson_15.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            char a;
            do {
                a = (char) bufferedReader.read();
                System.out.print(a);
            } while (a != -1);
        } catch (Exception e) {

        }
    }
}
