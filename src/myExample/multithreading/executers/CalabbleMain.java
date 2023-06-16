package myExample.multithreading.executers;

import java.util.concurrent.Callable;

public class CalabbleMain implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 5;
    }
}
