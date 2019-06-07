package net_work;

/*
 * NetTest
 * @Author guobin201314@gmail.com on 2019-06-07 11:26
 */

import java.lang.annotation.*;

// 源注解 目标
@Target(ElementType.METHOD)
// 保留位置 运行时
@Retention(RetentionPolicy.RUNTIME)
// 生成文档
//@Documented
// 允许继承
//@Inherited
public @interface NetTest {
    public int id();
    public String desc() default "no desc";
}
