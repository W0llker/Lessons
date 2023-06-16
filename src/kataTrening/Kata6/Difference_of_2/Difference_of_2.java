package kataTrening.Kata6.Difference_of_2;

import java.util.*;

public class Difference_of_2 {
    public static int[][] twosDifference(int[] array) {
        Arrays.sort(array);
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int j : array) {
            for (int integer : array) {
                if ((j + 2) == integer) {
                    arrayList.add(new int[]{j, integer});
                }
            }
        }
        int[][] result = new int[arrayList.size()][2];
        return arrayList.toArray(result);
    }
}
