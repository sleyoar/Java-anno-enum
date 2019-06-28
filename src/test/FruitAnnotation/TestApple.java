package test.FruitAnnotation;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestApple {
    @Test
    public void getAnnotation(){
        Class cls=Apple.class;
        try {
            Apple apple=(Apple)cls.newInstance();
            Field f1=cls.getDeclaredField("name");
            f1.setAccessible(true);
            Field f2=cls.getDeclaredField("color");
            f2.setAccessible(true);
            Field f3=cls.getDeclaredField("provider");
            f2.setAccessible(true);
                if(f1.isAnnotationPresent(FruitName.class)){
                    FruitName name=f1.getAnnotation(FruitName.class);
                    System.out.println(name.name());
                }
                if(f2.isAnnotationPresent(FruitColor.class)){
                    FruitColor color=f2.getAnnotation(FruitColor.class);
                    System.out.println(color.color());
                }
                if(f3.isAnnotationPresent(FruitProvider.class)){
                    FruitProvider provider=f3.getAnnotation(FruitProvider.class);
                    System.out.println(provider.provider());
                }
        } catch (InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getMethod(){
        Class cls=Apple.class;
        try {
        Method m1=cls.getMethod("getName");
        Method m2=cls.getMethod("getColor");
        Method m3=cls.getMethod("getProvider");
            if(m1.isAnnotationPresent(FruitName.class)){
                FruitName name=m1.getAnnotation(FruitName.class);
                System.out.println(name.name());
            }
            if(m2.isAnnotationPresent(FruitColor.class)){
                FruitColor color=m2.getAnnotation(FruitColor.class);
                System.out.println(color.color());
            }
            if(m3.isAnnotationPresent(FruitProvider.class)){
                FruitProvider provider=m3.getAnnotation(FruitProvider.class);
                System.out.println(provider.provider());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
