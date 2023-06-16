package leetCode;
/*

 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] mass = {1, 0, 0, 0, 1, 0, 0};
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(mass, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                count = 0;
                if (i == 0 || flowerbed[i - 1] == 0) {
                    count++;
                }
                if ((i == flowerbed.length - 1) || (flowerbed[i + 1] == 0)) {
                    count++;
                }
                if (count == 2) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0 ? true : false;
    }
}
