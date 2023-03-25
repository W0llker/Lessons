package byItAcademy.Lesson_7.Lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(abc)");
        Matcher matcher = pattern.matcher("Hello");
        Matcher matcher1 = pattern.matcher("Java");
        System.out.println(matcher.find());
        System.out.println(matcher1.find());

        String strSplit = "Эту строку нужно разбить по букве р";
        String[] strings = strSplit.split("р");
        for (String a : strings) {
            System.out.println(a);
        }
    }
}
