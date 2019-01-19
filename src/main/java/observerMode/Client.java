package observerMode;

/**
 * observerMode   Client
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("观察者模式");

        WeatherStation weatherStation = new WeatherStation();

        PersonA personA = new PersonA(weatherStation);
        PersonB personB = new PersonB(weatherStation);

        weatherStation.registerObserver(personA);
        weatherStation.registerObserver(personB);

        weatherStation.setTemperature(10);
        weatherStation.setDampness(10);

        JdkStation jdkStation = new JdkStation();
        JdkPerson jdkPerson = new JdkPerson();
        jdkStation.setTemperature(-10);
    }
}
