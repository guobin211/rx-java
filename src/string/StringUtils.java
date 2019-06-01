package string;

/*
* StringUtils
* @Author guobin201314@gmail.com on
*/

import java.util.Date;

public class StringUtils {
    public static void getName() {
        System.out.println("Class StringUtils in package string");
    }
    // 内部静态类
    public static class InnerClass{
        public String name = "InnerClass";
        InnerClass(){}
    }

    // 内部类
    public class Inner{
        public String name = "inner";
        Inner() {}
    }

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.name);
        // 通过类context实例话内部类
        StringUtils.Inner inner = stringUtils.new Inner();
        System.out.println(inner.name);

        // string 字符串存储为 object 变量引用地址 "str" 不可变对象
        String name1 = "jack";
        name1 = "tom";
        String name2 = "jack";
        name1 = "jury";
        name1 +=" jone";
        String name3 = name2 + " jones";
        System.out.println(name1.equals(name2));
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Japan").append(1);
        stringBuilder.append(" USA").append(2);
        System.out.println(stringBuilder.toString());
        // 11
        System.out.println(stringBuilder.length());
    }
}
