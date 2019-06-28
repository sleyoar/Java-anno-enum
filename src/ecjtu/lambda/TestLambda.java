package ecjtu.lambda;

import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        //jdk7的写法
        String[]names=new String[]{"a","b","c"};
        List<String> list= Arrays.asList(names);
        for(String str:list){
            System.out.println(str);
        }
        //Jdk 8的写法
        Arrays.asList("a","b","c")
                .forEach((e)-> System.out.println(e));
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行run方法");

            }
        }).start();

        new Thread(()-> System.out.println("lambda执行run方法")).start();
    }
}
