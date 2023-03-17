package byItAcademy.Lesson_5;

public class HomeWork {
    public static void main(String[] args) {
        int[] mass = new int[5];
        int[] ms = new int[mass.length+2];
        int c = 0;
        int s = 1;
        while (s < 10000) {
            if(c >= s){
                s += c;
                System.out.println(s);
            }else {
                c += s;
                System.out.println(c);
            }
        }
    }
}
