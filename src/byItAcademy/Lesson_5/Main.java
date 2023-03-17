package byItAcademy.Lesson_5;

import java.util.Scanner;

public class Main {
    /*
    1.Заполнить массив случайными числами и вывести полученный массив. Для заполнения случайными числами использовать код:  Math.random() * 20
    2. Создать массив из чисел. Заполнить его вручную. Вывести макс и мин число.
    3. Создать массив чисел от 1 до 100. Вывести полученный массив.
    4. Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив
    5. Вывести лесенку из звёздочек. от 1 до 5 вниз
     */
    public static void main(String[] args) {
//        z1();
//        z3();
//        z4();
//        z5();
//        z6();
        z7();
    }

    public static void z1() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + " ");
        }
    }

    public static void z2() {
        int c = 0;
        int s = 1;
        while (s < 10000) {
            if (c >= s) {
                s += c;
                System.out.println(s);
            } else {
                c += s;
                System.out.println(c);
            }
        }
    }

    public static void z3() {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
    }

    public static void z4() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 15);
            System.out.print(a[i] + " ");
        }
    }

    public static void z5() {
        int[] mass = new int[10];
        int c = 0;
        int k = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 20);
            if (mass[i] % 2 == 0) {
                c++;
            } else {
                k++;
            }
        }
        int[] chet = new int[c];
        int[] nechet = new int[k];
        k = 0;
        c = 0;
        for (int z : mass) {
            if (z % 2 == 0) {
                chet[c] = z;
                c++;
            } else {
                nechet[k] = z;
                k++;
            }
        }
        for (int i : mass) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : chet) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : nechet) {
            System.out.print(i + " ");
        }
    }

    public static void z6() {
        int[] a = {5,2,1,45,-24,125,24};
        int key;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    key = a[j];
                    a[j] = a[i];
                    a[i] = key;
                }
            }
        }
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void z7() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
        System.out.println("*******************");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}
