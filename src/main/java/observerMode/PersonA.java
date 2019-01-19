package observerMode;

/**
 * observerMode   PersonA
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class PersonA implements SelfObserver {

    WeatherStation weatherStation;

    public PersonA(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if (weatherStation.getTemperature() < 5) {
            System.out.println("PersonA： 天气太冷了");
        } else {
            System.out.println("PersonA： 天气正好");
        }
    }
}
