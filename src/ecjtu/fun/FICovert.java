package ecjtu.fun;

/**
 * 函数式接口
 * 函数式接口本质是一个仅有一个抽象方法的普通接口
 * @param <F>
 * @param <T>
 */
@FunctionalInterface
public interface FICovert<F, T> {
    T convert(F from);
}
