package byItAcademy.Lesson_7.Lesson;

public class CreateString {
    public static void main(String[] args) {
        String string = "привет мир";
        String string1 = new String("Привет мир");
        String string2 = new String();
        char[] chars = {'h', 'o', 'l', 'a'};
        String string3 = new String(chars);
        System.out.println(string.equalsIgnoreCase(string1));

        System.out.println(string1.startsWith("пр"));
        System.out.println(string1.endsWith("ир"));

        String stringSearc = "Кавказ там";
        System.out.println("Поиск строки Кав" + stringSearc.indexOf("Кав"));
        System.out.println("Поиск символа т на какой позиции " + stringSearc.indexOf("т",4));
        System.out.println("Поиск символа т на какой позиции с конца " + stringSearc.lastIndexOf("а",4));
        //считаем колво символов в строке и выводим 2 символ
        int count = stringSearc.length();
        System.out.println(count);
        System.out.println(stringSearc.charAt(2));
        //приводим строку в массив символов
        char[] massString =stringSearc.toCharArray();
        System.out.println(massString);
        //вырезание строк
        String subString = "  завтра будет дождь  ";
        System.out.println(subString.substring(7));
        System.out.println(subString.substring(7,12));
        //склейка строк
        System.out.println(subString.concat(stringSearc));
        //замена определенного символа на другой
        System.out.println(subString.replace('а','с'));
        //удаление пробелов в начале и в конце
        System.out.println(subString.trim());
        //приведение типов
        double number = 1.54;
        String z = String.valueOf(number);
        System.out.println(z);
        //работаем с контейнером пытаемся найти
        String dateForCars = "04:52:16 AM";
        if(dateForCars.contains("AM")) {
            System.out.println("Открыть шлагбаум");
        } else {
            System.out.println("Не выпускать фуру");
        }
    }
}
