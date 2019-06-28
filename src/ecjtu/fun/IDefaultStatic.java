package ecjtu.fun;

/**
 * 向后兼容，当需要修改接口的中方法，
 * 又不希望接口之前版本的实现类有修改
 */
public interface IDefaultStatic {
     int calc(int b);//抽象方法
     //默认方法
     default  double sqrt(int a){
          return  Math.sqrt(a);
     }
     //静态方法
     static void say(String message){
          System.out.println(message);
     }
}
