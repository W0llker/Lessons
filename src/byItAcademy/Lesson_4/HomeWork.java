package byItAcademy.Lesson_4;

import java.util.Base64;
import java.util.Scanner;

/*
1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100.
2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму чисел от одного числа до другого.
Цикл while:
3. Ввести число с консоли, которое не заканчивается на 0. Вывести число в обратном порядке. Использовать оператор %. (цикл while, наподобие задачи, которую разбирали в конце занятия)
4. Ввести число с консоли, которое не заканчивается на 0. Вывести чётные и нечётные числа через while and if. Использовать оператор %.
 */
public class HomeWork {
    public static void main(String[] args) {
//        z1();
//        z2();
//        z3();
//        z4();
        z5();

    }

    public static void z1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void z2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        if (a > b) {
            while (a >= b) {
                result += b;
                b++;
            }
        } else while (b >= a) {
            result += a;
            a++;
        }
        System.out.println("Сумма = " + result);
    }

    public static void z3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число которое не заканчивается на 0");
        int a = scanner.nextInt();
        while (a > 0) {
            System.out.print(a % 10);
            a /= 10;
        }
    }

    public static void z4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число которое не заканчивается на 0");
        int a = scanner.nextInt();
        while (a > 0) {
            int k = a % 10;
            if (k % 2 == 0) {
                System.out.println("Число " + k + " четное");
            } else {
                System.out.println("Число " + k + " нечетное");
            }
            a /= 10;
        }
    }
    public static void z5() {
        Base64 Base64 = null;
        byte[] decodedBytes = Base64.getDecoder().decode("SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==");
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
        System.out.println("Вдовенков");
    }
}
