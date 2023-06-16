package leetCode;

import java.util.Objects;
/*
14. Longest Common Prefix
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] abc = {"leqeqw", "les", "leet", "leeds"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(abc));
    }

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (String z : strs) {
            if (!Objects.equals(z, "")) {
                if (result.length() > z.length()) {
                    for (int i = 0; i < z.length(); i++) {
                        if (result.charAt(i) == z.charAt(i)) {
                        } else {
                            result = result.substring(0, i);
                            break;
                        }
                        if (i == z.length() - 1) {
                            result = result.substring(0, i + 1);
                        }
                    }
                } else {
                    for (int i = 0; i < result.length(); i++) {
                        if (result.charAt(i) == z.charAt(i)) {
                        } else {
                            result = result.substring(0, i);
                            break;
                        }
                        if (i == result.length() - 1) {
                            result = result.substring(0, i + 1);
                        }
                    }
                }
            } else result = "";
        }
        return result;
    }
}
