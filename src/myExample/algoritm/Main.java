package myExample.algoritm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = -3 * i;
        }
        display(mass);
        Arrays.sort(mass);
        display(mass);

        Arrays.fill(mass, 2, 6, -1);
        display(mass);
        Arrays.sort(mass);
        display(mass);
        int index = Arrays.binarySearch(mass, -6);
        System.out.println(index);
    }

    public static void display(int[] mass) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
