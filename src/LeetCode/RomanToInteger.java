package LeetCode;
/*
13. Roman to Integer
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0, nb = 0, prev = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> nb = 1000;
                case 'D' -> nb = 500;
                case 'C' -> nb = 100;
                case 'L' -> nb = 50;
                case 'X' -> nb = 10;
                case 'V' -> nb = 5;
                case 'I' -> nb = 1;
            }
            if (nb < prev && ((nb == 1) || (nb ==10) || (nb == 100))) {
                result -= nb;
            } else {
                result += nb;
            }
            prev = nb;
        }
        return result;
    }
}
