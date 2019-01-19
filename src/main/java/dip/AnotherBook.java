package dip;

/**
 * dip   AnotherBook
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class AnotherBook implements IReader{
    @Override
    public void getContent() {
        System.out.println("AnotherBook");
    }
}
