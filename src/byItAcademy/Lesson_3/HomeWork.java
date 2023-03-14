package byItAcademy.Lesson_3;

import java.util.Scanner;

/*
1. На вход даны 3 числа. Вывести в консоль только четные числа
2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
3. На вход даны 2 числа. Вывести в консоль только те числа, которые делятся на 2 или на 3
*/
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите А");
        int a = scanner.nextInt();
        System.out.println("Введите B");
        int b = scanner.nextInt();
        System.out.println("Введите C");
        int c = scanner.nextInt();
        zadanie_1(a, b, c);
        zadanie_2(a, b, c);
        zadanie_3(a, b);

    }

    public static void zadanie_1(int a, int b, int c) {
        if ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0)) System.out.println("A B C являються четными числами");
        else if (a % 2 == 0 && b % 2 == 0) System.out.println("A B являються четными числами");
        else if (a % 2 == 0 && c % 2 == 0) System.out.println("A C являються четными числами");
        else if ((a % 2 != 0) && (b % 2 == 0) && (c % 2 == 0)) System.out.println("B C являються четными числами");
        else if (a % 2 == 0) System.out.println("A являються четными числом");
        else if (b % 2 == 0) System.out.println("B являються четными числом");
        else if (c % 2 == 0) System.out.println("C являються четными числом");
        else System.out.println("Четных нету");
    }

    public static void zadanie_2(int a, int b, int c) {
        if ((a % 2 == 0) && (a % 5 == 0) && (b % 2 == 0) && (b % 5 == 0) && (c % 2 == 0) && (c % 5 == 0)) {
            System.out.println("A B C делиться на 2 и 5");
        } else if ((a % 2 == 0) && (a % 5 == 0) && (b % 2 == 0) && (b % 5 == 0)) {
            System.out.println("A B  делиться на 2 и 5");
        } else if ((a % 2 == 0) && (a % 5 == 0) && (c % 2 == 0) && (c % 5 == 0)) {
            System.out.println("A C делиться на 2 и 5");
        } else if ((b % 2 == 0) && (b % 5 == 0) && (c % 2 == 0) && (c % 5 == 0)) {
            System.out.println("B C делиться на 2 и 5");
        } else if ((a % 2 == 0) && (a % 5 == 0)) {
            System.out.println("A делиться на 2 и 5");
        } else if ((b % 2 == 0) && (b % 5 == 0)) {
            System.out.println("B делиться на 2 и 5");
        } else if ((c % 2 == 0) && (c % 5 == 0)) {
            System.out.println("C делиться на 2 и 5");
        } else System.out.println("Числа не делятся");
    }

    public static void zadanie_3(int a, int b) {
        if ((a % 2 == 0 && a % 3 == 0) && (b % 2 == 0 && b % 3 == 0)) {
            System.out.println("A и B делятся на 2 и 3 ");
        } else if ((a % 2 == 0 && a % 3 != 0) && (b % 2 == 0 && b % 3 == 0)) {
            System.out.println("A делится на 2, а Б на 2/3");
        } else if (((a % 3 == 0 && a % 2 != 0) && (b % 2 == 0 && b % 3 == 0))) {
            System.out.println("A делится на 3, а Б на 2/3");
        } else if ((a % 2 == 0 && a % 3 != 0) && b % 3 == 0) {
            System.out.println("A делится на 2, а Б на 3");
        } else if ((a % 2 == 0 && a % 3 != 0) && b % 2 == 0) {
            System.out.println("A делится на 2, а Б на 2");
        } else if (((a % 2 != 0 && a % 3 == 0) && b % 3 == 0)) {
            System.out.println("A делится на 3, а Б на 3");
        } else if (((a % 2 != 0 && a % 3 == 0) && b % 2 == 0)) {
            System.out.println("A делится на 3, а Б на 2");
        } else if (((a % 2 == 0 && a % 3 == 0) && b % 2 == 0)) {
            System.out.println("A делится на 2/3, а Б на 2");
        } else if (((a % 2 == 0 && a % 3 == 0) && b % 3 == 0)) {
            System.out.println("A делится на 2/3, а Б на 2");
        } else if ((a % 2 == 0 && a % 3 == 0)) {
            System.out.println("A делится на 2/3");
        } else if (a % 2 == 0) {
            System.out.println("A делится на 2");
        } else if (a % 3 == 0) {
            System.out.println("A делится на 3");
        } else if ((b % 2 == 0 && b % 3 == 0)) {
            System.out.println("B делится на 2/3");
        } else if (b % 2 == 0) {
            System.out.println("B делится на 2");
        } else if (b % 3 == 0) {
            System.out.println("B делится на 3");
        } else System.out.println("ПамПамПам");
    }
}
