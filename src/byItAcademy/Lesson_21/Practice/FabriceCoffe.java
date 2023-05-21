package byItAcademy.Lesson_21.Practice;

import byItAcademy.Lesson_21.Practice.Class.Coffee;

public interface FabriceCoffe {
    Coffee createCoffee(ViewCoffee viewCoffee, int water, int milk);
}
