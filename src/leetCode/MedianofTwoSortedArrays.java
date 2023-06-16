package leetCode;
/*
4. Median of Two Sorted Arrays
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2, 4};
        System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(a, b));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List a = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        a.addAll(Arrays.stream(nums2).boxed().toList());
        Collections.sort(a);
        System.out.println(a);
        if (a.size() % 2 == 0) {
            return (double) ((int) a.get(a.size() / 2) + (int) a.get(a.size() / 2 - 1)) / 2;
        } else return (double) ((int) a.get(a.size() / 2));
    }
}
