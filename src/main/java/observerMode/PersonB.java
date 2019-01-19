package observerMode;

/**
 * observerMode   PersonB
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class PersonB implements SelfObserver {
    WeatherStation weatherStation;

    public PersonB(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if (weatherStation.getDampness() < 5) {
            System.out.println("PersonB：  空气真潮湿");
        } else {
            System.out.println("PersonB：  空气刚刚好");
        }
    }
}
