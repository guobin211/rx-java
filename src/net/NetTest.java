package net;



import java.lang.annotation.*;


// 生成文档
//@Documented
// 允许继承
//@Inherited
/**
 * NetTest class
 * @author guobin201314@gmail.com on 2019-06-07 11:26
 */
// 源注解 目标
@Target(ElementType.METHOD)
// 注解保留位置 运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface NetTest {
    public int id();
    public String desc() default "no desc";
}
