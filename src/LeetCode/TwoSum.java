package LeetCode;

import java.util.Scanner;
/*
1. Two Sum
 */
public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = {1, 3, 5, 10, 4, 2};
        System.out.println("Введите число");
        int target = scanner.nextInt();
        int[] result = new TwoSum().twoSum(mas, target);
        System.out.println(result[0] + "+" + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && (i != j)) {
                    result[0] = j;
                    result[1] = i;
                    break;
                }
            }
        }
        return result;
    }
}
