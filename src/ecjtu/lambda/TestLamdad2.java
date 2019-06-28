package ecjtu.lambda;
//lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
public class TestLamdad2 {
      static String str="tom";
    public static void main(String[] args) {
     /*GreetService service=(message ->
             System.out.println(message+" "+str));*/
     GreetService service=message -> {str="jack";
         System.out.println(message+","+str);};
     service.sayMessage("hello");

    }

    interface GreetService {
        void sayMessage(String message);
    }

}
