package test.annotation;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestAnnoation {
    @Test
    public void getAnnotation() {
        Class cls=Student.class;
        try {
            Student stu=(Student)cls.newInstance();
            Field name=cls.getDeclaredField("name");
            name.setAccessible(true);
            if(name.isAnnotationPresent(Param.class)){
                Param param=name.getAnnotation(Param.class);
                System.out.println(param.name()+","+param.age()+","+param.sex()+","+param.address()[0]);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getMethodConstructor(){
        Class cls=Student.class;
        Constructor con= null;
        try {
            con = cls.getConstructor(new Class[]{String.class,int.class,String.class,String.class});
            if (con.isAnnotationPresent(Param.class)) {
                Param param=(Param)con.getAnnotation(Param.class);
                System.out.println(param.name()+","+param.age()+","+param.sex()+","+param.address()[0]);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getMethod(){
        Class cls=Student.class;
        Method con= null;
        try {
            con = cls.getMethod("getAge",new Class[]{});
            if (con.isAnnotationPresent(Param.class)) {
                Param param=(Param)con.getAnnotation(Param.class);
                System.out.println(param.name()+","+param.age()+","+param.sex()+","+param.address()[0]);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
