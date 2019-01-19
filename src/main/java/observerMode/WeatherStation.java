package observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * observerMode   WeatherStation
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class WeatherStation implements WeatherSubject {

    List<SelfObserver> selfObserverList = new ArrayList<SelfObserver>();
    private int temperature = 0;
    private int dampness = 0;

    @Override
    public void registerObserver(SelfObserver selfObserver) {
        selfObserverList.add(selfObserver);
    }

    @Override
    public void removeObserver(SelfObserver selfObserver) {
        selfObserverList.remove(selfObserver);
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyObserver() {
        for (SelfObserver selfObserver : selfObserverList) {
            selfObserver.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public int getDampness() {
        return  dampness;
    }

    /**
     * 更新属性
     * @param integer int
     */
    public void setDampness(Integer integer) {
        this.dampness = integer;
        notifyObserver();
    }

    public void setTemperature(int i) {
        this.temperature = i;
        notifyObserver();
    }
}
