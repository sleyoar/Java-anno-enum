package test;

public class TestLambda1 {
    private static final String str="HHHHHHHH";
    interface GreetService{
        void sayMessage(String message);
    }
    public static void main(String[] args) {
        GreetService gs=message -> {
            System.out.println(message+"  "+str);
        };
    }
}