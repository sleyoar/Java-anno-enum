package test;

import java.util.Arrays;

public class TestLambda {
    public static void main(String[] args) {
        //jdk 8的新特性
        Arrays.asList("a","b","c").forEach(e->System.out.println(e));

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行run方法");
            }
        }).start();
        new Thread(()-> System.out.println("lambda实现线程。。")).start();
    }
}
