package byItAcademy.Lesson_20.Practice;

import java.time.Instant;
import java.time.ZoneId;

public class DataMain {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
