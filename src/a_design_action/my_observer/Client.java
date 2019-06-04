/*
 * a_design_action.my_observer Client
 * @author GuoBin211 on 2019-06-01 09:12
 */
package a_design_action.my_observer;

public class Client {

    public static void main(String[] args) {
        ManA manA = new ManA();
        ManB manB = new ManB();

        EventBus eventBus = new EventBus();
        eventBus.registerObserver(manA);
        eventBus.registerObserver(manB);
        // 观察者模式
        eventBus.publish(new MyPublishData("第一条消息", 11));
        eventBus.registerObserver(manA);
        eventBus.setRating(22);
        System.out.println(eventBus.getRating());

        // java自带的 Observer
        WeatherStation weatherStation = new WeatherStation();
        ManC manC = new ManC();
        weatherStation.addObserver(manC);
        weatherStation.setTemperature(11);
        weatherStation.setTemperature(-5);

    }
}

