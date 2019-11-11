package com.mix.contrast.action;

import java.util.Observable;
import java.util.Observer;

class StudentA implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("StudentA");
        System.out.println(o);
    }
}

class StudentB implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("StudentB");
        System.out.println(o);
    }
}

class Publish extends Observable {
    private String data = "";

    void setData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();
        }
        notifyObservers(this.data);
    }
}

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-11  15:42
 */
public class EventCenter {
    public static void main(String[] args) {
        Publish publish = new Publish();
        StudentA student1 = new StudentA();
        StudentB student2 = new StudentB();
        publish.addObserver(student1);
        publish.addObserver(student2);
        System.out.println(publish.countObservers());
        String name = "jack";
        publish.setData(name);
    }
}
