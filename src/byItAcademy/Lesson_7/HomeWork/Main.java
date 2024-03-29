package byItAcademy.Lesson_7.HomeWork;
/*
1. 1 делал в дз к 6 уроку
2.  Дан текст: Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и
ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является
то, что его значение не может быть изменено после создания объекта при помощи
 любого метода класса. Изменение строки всегда приводит к созданию нового
 объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение
 и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.
2.1 В тексте после символа с индексом k вставить заданную подстроку.
2.2 После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.

3. Дан текст: Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. В данном случае встречается путаница.
Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2).
Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри.
Технологии программирования на Java 2. Распределённые приложения (2011).
В то время, когда, как известно, Java 2 была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании,
о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7, это приводит к полной путанице.
3.1 Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между последовательностями подряд идущих букв оставить хотя бы один пробел. (задача с использованием регулярных выражений)
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String zadanue2_1 = zadanie2_1("Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и" +
                "ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является" +
                "то, что его значение не может быть изменено после создания объекта при помощи" +
                " любого метода класса. Изменение строки всегда приводит к созданию нового" +
                " объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение" +
                " и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку." +
                "2.1 В тексте после символа с индексом k вставить заданную подстроку.", 4, "пр");
        System.out.println(zadanue2_1);
        String zadanue2_2 = zadanie2_2("Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и" +
                "ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является" +
                "то, что его значение не может быть изменено после создания объекта при помощи" +
                " любого метода класса. Изменение строки всегда приводит к созданию нового" +
                " объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение" +
                " и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку." +
                "2.1 В тексте после символа с индексом k вставить заданную подстроку","ку","пока");
        System.out.println(zadanue2_2);
        String zadinie3_1 = zadanie3_1("Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. В данном случае встречается путаница." +
                "Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2)." +
                "Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри." +
                "Технологии программирования на Java 2. Распределённые приложения (2011)." +
                "В то время, когда, как известно, Java 2 была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании," +
                "о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7, это приводит к полной путанице.");
        System.out.println(zadinie3_1);

    }

    public static String zadanie2_1(String string, int k, String target) {
        String[] strings = string.split(" ");
        String result = "";
        for (String s : strings) {
            if (s.length() > k) {
                s = s.substring(0, k + 1) + target;
            }
            result += s + " ";
        }
        return result;
    }

    public static String zadanie2_2(String string, String oldString, String newString) {
        String[] strings = string.split(" ");
        String result = "";
        for (String s : strings) {
            int count = s.indexOf(oldString);
            if (count + oldString.length() == s.length() && count != -1) {
                s += " " + newString;
            }
            result += s + " ";
        }
        return result;
    }

    public static String zadanie3_1(String string) {
        //удалил все символы кроме букв и пробелов
        Pattern pattern = Pattern.compile("[^a-zA-ZА-Яа-я\\s]");
        Matcher matcher = pattern.matcher(string);
        string = matcher.replaceAll("");
        //удалил лишние пробелы
        Pattern pattern1 = Pattern.compile("\\s+");
        matcher = pattern1.matcher(string);
        string = matcher.replaceAll(" ");
        //Нашел повторяющиеся символы и поставил между ними пробел
        String[] text = string.split(" ");
        String result = "";
        pattern1 = Pattern.compile("([A-zА-я])\\1+");
        for (String s : text) {
            matcher = pattern1.matcher(s);
            while (matcher.find()) {
                s = matcher.replaceAll(matcher.group(1) + " " + matcher.group(1));
            }
            result += s + " ";
        }
        return result;
    }
}
