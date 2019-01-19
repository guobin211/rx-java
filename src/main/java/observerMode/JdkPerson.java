package observerMode;

import java.util.Observable;
import java.util.Observer;

/**
 * observerMode   JdkPerson
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class JdkPerson implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        JdkStation jdkStation = (JdkStation)observable;

        if (jdkStation.getTemperature() > 0) {
            System.out.println("JdkPerson  天气真好");
        } else {
            System.out.println("JdkPerson  天气真冷");
        }
    }

}
