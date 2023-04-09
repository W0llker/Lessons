package byItAcademy.Lesson_7.Lesson;

public class OutBoxClass {
    private int length;
    private int width;
    private int height;
    private static int weight;

    public OutBoxClass() {

    }

    public OutBoxClass(int length, int width, int height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int volume() {
        InnerSquare innerSquare = new InnerSquare();
        int square = innerSquare.square();
        return square * height;
    }

    public static int staticWeight() {
        return weight;
    }

    class InnerSquare {
        private int innerLength;
        private int innerWidth;

        public InnerSquare(int innerLength, int innerWidth) {
            this.innerLength = innerLength;
            this.innerWidth = innerWidth;
        }

        public InnerSquare() {
            innerLength = length;
            innerWidth = width;
        }

        public int square() {
            int square = innerLength * innerWidth;
            System.out.println("Площадь = " + square);
            return square;
        }
    }

    static class InnerStaticClass {
        static int initialize() {
            weight = 2;
            return staticWeight();
        }
    }
}
