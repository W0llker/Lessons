package byItAcademy.Lesson_7.Practice;

/*
1.	Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
1.	Распечатать последний символ строки. Используем метод String.charAt().
2.	Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
3.	Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().
4.	Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5.	Найти позицию подстроки “Java” в строке “I like Java!!!”.
6.	Заменить все символы “а” на “о”.
7.	Преобразуйте строку к верхнему регистру.
8.	Преобразуйте строку к нижнему регистру.
9.	Вырезать строку Java c помощью метода String.substring()
10. В каждом слове текста k-ю букву заменить заданным символом. Если
k больше длины слова, корректировку не выполнять.
 */
public class Main {
    public static void main(String[] args) {
        String z = "I like Java!!!";
//        z1(z);
//        z2(z);
//        z3(z);
//        z4(new String("Добро пожаловать"));
//        z5(z);
//        z6(z);
//        z7(z);
//        z8(z);
//        z9(z);
        z = z10("Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы)" +
                "или метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является " +
                "то, что его значение не может быть изменено после создания объекта при помощи" +
                "любого метода класса. Изменение строки всегда приводит к созданию нового" +
                "объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение" +
                "и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку", 5,'p');
        System.out.println(z);
    }

    public static String z1(String z) {
        System.out.println(z);
        System.out.println(z.charAt(z.length() - 1));
        return z;
    }

    public static boolean z2(String z) {
        System.out.println("строка заканчивается \'java!\' " + z.endsWith("java!"));
        return z.endsWith("java!");
    }

    public static boolean z3(String z) {
        System.out.println("строка заканчивается \'Добро пож\' " + z.startsWith("Добро пож"));
        return z.startsWith("Добро пож");
    }

    public static boolean z4(String z) {
        System.out.println("строка заканчивается \'Java\' " + z.contains("Java"));
        return z.contains("Java");
    }

    public static int z5(String z) {
        System.out.println("позиция подстроки \'Java\' " + z.indexOf("Java"));
        return z.indexOf("Java");
    }

    public static String z6(String z) {
        System.out.println("поменял а на о " + z.replace('a', 'о'));
        return z.replace('a', 'о');
    }

    public static String z7(String z) {
        System.out.println(z.toUpperCase());
        return z.toUpperCase();
    }

    public static String z8(String z) {
        System.out.println(z.toLowerCase());
        return z.toLowerCase();
    }

    public static String z9(String z) {
        System.out.println(z.substring(7, 11));
        return z.substring(7, 11);
    }

    public static String z10(String z, int a, char target) {
        String[] strings = z.split(" ");
        String result = "";
        for (String s : strings) {
            if (s.length() - 1 >= a) {
                char[] c = s.toCharArray();
                c[a] = target;
                s = new String(c);  // result += s.replace(s.charAt(a), target) + " "; будет менять несколько символов если они повторяются
                result += s + " ";
            } else result += s + " ";
        }
        return result;
    }
}
