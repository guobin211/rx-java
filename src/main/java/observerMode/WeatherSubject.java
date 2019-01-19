package observerMode;

interface SelfObserver {
    void update();
}

/**
 * observerMode   WeatherSubject
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public interface WeatherSubject {
    void registerObserver(SelfObserver selfObserver);
    void removeObserver(SelfObserver selfObserver);
    void notifyObserver();
}
