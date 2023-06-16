package byItAcademy.Lesson_20.HomeWork;
/*
1. Вывести текущую дату в формате: от Рождества Христова 1-й квартал понедельник 20 марта 2023, время: 18:27:30
2. Вывести текущую дату в формате: от Рождества Христова 1-й квартал понедельник 20 марта 2023, время: 06:27:30 PM
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataFormatedMain {
    public static void main(String[] args) {
        System.out.println(DataFormatedMain.dateFormated(LocalDateTime.now(),DateTimeFormatter.ofPattern("GGGG qqqq EEEE MMM yyyy',' 'время:' HH:mm:ss")));
        System.out.println(DataFormatedMain.dateFormated(LocalDateTime.now(),DateTimeFormatter.ofPattern("GGGG qqqq EEEE MMM yyyy',' 'время:' hh:mm:ss a")));
    }
    static String dateFormated(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter) {
        return localDateTime.format(dateTimeFormatter);
    }
}
