package ISP;

/**
 * ISP   BasePrettyGirl
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public abstract class BasePrettyGirl implements IGoodGirl, INiceFigure {
    @Override
    public void goodLooking() {
        System.out.println("goodLooking");
    }

    @Override
    public void goodBody() {
        System.out.println("goodBody");
    }

    @Override
    public void niceFigure() {
        System.out.println("niceFigure");
    }
}
