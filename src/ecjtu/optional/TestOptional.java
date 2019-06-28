package ecjtu.optional;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
       // String str=null;
        Optional<String>str= Optional.of(new String());
        System.out.println(str.equals("ddd"));
        //jdk 1.8有的写法 泛型判断改进
        List<String> list=new ArrayList<>();
    }

}
