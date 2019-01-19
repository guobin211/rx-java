package observerMode;

import java.util.Observable;

/**
 * observerMode   JdkStation
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class JdkStation extends Observable {
    int temperature = 0;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        // 更新
        setChanged();
        notifyObservers();
    }
    public int getTemperature() {
        return temperature;
    }
}
