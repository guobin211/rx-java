/*
 * a_design_action WeatherStation
 * @author GuoBin211 on 2019-06-01 09:43
 */
package a_design_action.my_observer;

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
        notifyObservers();
    }

    private int temperature = 0;
    WeatherStation() {
    }

}

