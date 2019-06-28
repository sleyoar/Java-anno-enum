package ecjtu.fun;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        FICovert<String,Integer>covert=new FICovert<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };
       int data=covert.convert("34");
        System.out.println(data);
       // covert=new FICovert<String, Integer>()((from)->{return Integer.valueOf(from)});
    }
}
