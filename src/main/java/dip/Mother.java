package dip;

/**
 * dip   Mother
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class Mother {
    public void read(IReader reader) {
        System.out.println("Mother is read");
        reader.getContent();
    }
}
