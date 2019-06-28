package ecjtu.fun;

public class TestDefaultStatic {
    public static void main(String[] args) {
        IDefaultStatic.say("hello");
        IDefaultStatic ids1=new IDefaultStatic() {

            @Override
            public int calc(int b) {
                return 0;
            }
        };
        //调用接口实现类默认方法
        System.out.println(ids1.sqrt(16));
        //调用接口实现类的抽象方法
        System.out.println(ids1.calc(16));
    }
}
