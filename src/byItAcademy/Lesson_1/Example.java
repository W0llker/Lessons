package byItAcademy.Lesson_1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example {
    public static void main(String[] args) {
        /*
        System.out.println("Всем привет!!\nМеня зовут Никита");
        String name = "Всем привет!!\nМеня зовут Никита";
        System.out.println(name);
        for (String a : args) {
            System.out.print(a);
        }
         */
        System.out.println(Example.homework("Вдовенков",LocalDate.of(2023,02,24),LocalTime.of(22,15)));
    }
    static String homework(String lastName, LocalDate date, LocalTime time){
        return lastName + " " + date + " " + time;
    }
}
