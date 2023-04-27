package byItAcademy.Lesson_13.Practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        SomeGeneric<Integer> integerSomeGeneric = new SomeGeneric<>(15);
        integerSomeGeneric.nameOfClass();
    }
}
