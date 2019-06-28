package ecjtu.lambda;

public class TestLambda1 {
    public static void main(String[] args) {
        //jdk8的写法
        GreetService greetService = (message -> System.out.println(message));
        greetService.sayMessage("java lambda");
        //jdk7的写法 匿名内部类的写法
        greetService = new GreetService() {
            @Override
            public void sayMessage(String message) {
                System.out.println(message);
            }
        };
        greetService.sayMessage("hello ");
        TestLambda1 tester = new TestLambda1();
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

    }

    interface GreetService {
        void sayMessage(String message);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
