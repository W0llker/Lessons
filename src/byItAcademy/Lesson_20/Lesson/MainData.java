package byItAcademy.Lesson_20.Lesson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.zip.DataFormatException;

/*
1.	Вывести текущую дату в формате (пример 😞 1 апреля 2023
2.	Вывести текущую дату в формате (пример 😞 1 апреля 2023, 10:59:20 PM
3.	Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
4.	Вывести текущую дату в формате (пример 😞понедельник 20 марта 2023 время: 06.06.06 PM
5.	Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
 */
public class MainData {
    public static void main(String[] args) {
        //DateTimeFormatterBuilder
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(dateTimeFormatter));

        dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy',' hh:mm:ss a");
        System.out.println(localDateTime.format(dateTimeFormatter));

        localDateTime = LocalDateTime.parse("2023-03-19 : 10:12:24", DateTimeFormatter.ofPattern("yyyy-MM-dd : HH:mm:ss"));
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ofPattern("eee dd MMM yyyy 'время:' hh:mm:ss a");
        System.out.println(localDateTime.format(dateTimeFormatter));

        localDateTime = LocalDateTime.parse("пн 20.03.23 г. время: 15:07:28", DateTimeFormatter.ofPattern("eee dd.MM.yy 'г.' 'время:' HH:mm:ss"));
        System.out.println(localDateTime);
    }
}
