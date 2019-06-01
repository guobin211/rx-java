/*
 * a_design_action.my_observer ManC
 * @author GuoBin211 on 2019-06-01 09:46
 */
package a_design_action.my_observer;

import java.util.Observable;
import java.util.Observer;

class ManC implements Observer {
    ManC() {
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ManC Java 自带的observer:" + arg);
        WeatherStation weatherStation = (WeatherStation) o;
        if (weatherStation.getTemperature() < 0 ) {
            System.out.println("温度低于0度");
        } else {
            System.out.println("温度高于0度");
        }
    }
}

