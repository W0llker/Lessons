package byItAcademy.Lesson_14.Practice;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        try{
            ThrowClass.throwsException();
        }catch (MyException e) {
            System.out.println("Мое исключение");
        }

    }
}
