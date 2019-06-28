package test;
@FunctionalInterface
public interface FICovert <F,T>{
    T convert(F from);
}
