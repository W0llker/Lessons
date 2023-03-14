package myExample.algoritm;

import java.beans.Introspector;

/*
1. Вывести числа от 1 до 100.
2. Вывести числа от 100 до 1.
3. Вывести только чётные числа от 1 до 100.
4. Вывести только нечётные числа от 1 до 100.
5. Вывести каждый десяток от 1 до 100.
6. Необходимо, чтобы программа отображала следующую последовательность чисел:
 7 14 21 28 35 42 49 56 63 70 77 84 91 98
7. Цикл while 2. Необходимо вывести следующую последовательность цифр: 1 2 4 8 16 32 64 128 256 512
8. Цикл while 3. Написать программу, которая посчитает сумму первых 10 чисел
9. Вывести таблицу умножения на 3.
10.Вывести среднее значение суммы всех цифр в числе 54734
11.Вывести красивую таблицу умножения.
 */
public class Main {
    public static void main(String[] args) {
//        z1();
//        z2();
//        z3();
//        z4();
//        z5();
//        z6();
//        z7();
//        z8();
//        z9();
//        z10();
//        z11();
    }

    public static void z1() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Число " + i);
        }
    }

    public static void z2() {
        for (int i = 100; i > 0; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void z3() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) System.out.println("Число i четное " + i);
            else System.out.println("Число i нечетно " + i);
        }
    }

    public static void z4() {
        for (int i = 0; i <= 100; i++) {
            if ((i % 10 == 0) && i > 0) System.out.println(i);

        }
    }

    public static void z5() {
        int i = 0;
        while (i < 100) {
            if ((i % 7 == 0) && i != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void z6() {
        int i = 1;
        while (i < 512) {
            System.out.println(i);
            i += i;
        }
    }

    public static void z7() {
        int i = 1;
        int result = 0;
        while (i < 11) {
            result += i;
            i++;
        }
        System.out.println(result);
    }

    public static void z8() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));
        }
    }

    public static void z9() {
        int i = 100;
        while (i != 0) {
            if (i != 1 && i % 10 != 0) {
                System.out.print(i+",");
            } else if (i % 10 == 0) {
                System.out.println(i);
            } else System.out.print(i);
            i--;
        }
    }
    public static void z10() {
        int a = 54734;
        int result = 0;
        int i = 0;
        String z = "12";
        while (a > 0){
            result += a%10;
            a/=10;
            i++;
        }
        System.out.println(result);
        System.out.println("Деление " + ((double)result/i));
    }
    public static void z11() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t \t");
            }
            System.out.println();
        }
    }

}
