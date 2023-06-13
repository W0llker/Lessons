package byItAcademy.Lesson_23.Practice;

public class Academy {
    private void notAcademyInfo() {
        System.out.println("Без");
    }
    @AcademyInfo(year = 2020)
    private void academyInfo() {
        System.out.println("С меткой");
    }
}
