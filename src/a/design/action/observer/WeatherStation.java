/*
 * a_design_action WeatherStation
 * @author GuoBin211 on 2019-06-01 09:43
 */
package a.design.action.observer;

import java.util.Observable;

class WeatherStation extends Observable {
    int getTemperature() {
        return temperature;
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
        // 发生change
        setChanged();
        // 通知obs
        notifyObservers("温度发生变化");
    }

    private int temperature = 0;
    WeatherStation() {
    }

}

