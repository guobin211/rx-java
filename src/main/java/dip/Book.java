package dip;

/**
 * dip   Book
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class Book implements IReader {
    @Override
    public void getContent() {
        System.out.println("《阿里巴巴与四十大盗》");
    }
}
