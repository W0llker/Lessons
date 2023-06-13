package myExample.ForkJoinFramework;

import java.util.concurrent.ForkJoinPool;

public class ForkMain {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        double[] doubles = new double[100000];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(doubles[i] + " ");
        }

        SqrtTransform sqrtTransform = new SqrtTransform(doubles,0,doubles.length);
        forkJoinPool.invoke(sqrtTransform);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ",doubles[i]);
        }
    }
}
