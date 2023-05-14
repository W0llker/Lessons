package byItAcademy.Lesson_19.Lesson;
/*
1. 1 Создать интерфейс, который будет обрабатывать входящий параметр типа String.
1.1 На основании этого интерфейса создать лямбда выражение, которое будет возвращать строку с большими буквами.
1.2 Создать ещё одно лямбда выражение.
Если количество символов во входящем параметре больше 5-то обрезаем текст начиная с 5 буквы и возвращаем результат
 */
public class LambdaTest {
    public static void main(String[] args) {
        String a = modify(String::toUpperCase,"Привет");
        System.out.println(a);

        ModifyString modifyString = (string -> {
            String result;
           if(string.length() > 4) {
               result = string.substring(0,4);
           }else result = string;
           return result;
        });
        String a1 = modifyString.modify("Кhasaf faf");
        System.out.println(a1);
    }
    public static String modify(ModifyString modifyString, String a) {
        return modifyString.modify(a);
    }
}
