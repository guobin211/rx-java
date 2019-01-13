package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * class的反射
 * Object和interface的父类是null
 * @author GuoBin201314@gmail.com on 2018/11/17 16:52
 */
public class ClassType {
    public static void main(String[] args) {
        Double d = 13.56;
        System.out.println(d.getClass());
        System.out.println(String[].class.isArray());
        System.out.println(String[].class.getName());
        getField(String.class);
        getConstructor(String.class);
        //  获取interface
        Class[] ifs = Integer.class.getInterfaces();
        System.out.println(Arrays.toString(ifs));
    }

    /**
     * 获取类的字段 field
     * @param cls class
     */
    private static void getField(Class<String> cls) {
        //  获取所有属性字段
        Field[] fs = cls.getFields();
        for (Field f : fs) {
            System.out.println(f.getName());
            System.out.println(f.getType());
            System.out.println(f.getModifiers());
        }
    }

    /**
     * 获取类的构造方法
     * @param cls class
     */
    private static void getConstructor(Class cls) {
        try {
            Constructor c;
            c = cls.getDeclaredConstructor();
            System.out.println(c);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
