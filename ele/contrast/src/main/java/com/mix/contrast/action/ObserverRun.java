package com.mix.contrast.action;

import java.util.ArrayList;
import java.util.List;

import javax.jws.Oneway;

interface Observer {
    /**
     * update
     * @param data content
     */
    void update(String data);
}

interface Subject {

    /**
     * attach 进入
     * @param observer Observer
     */
    void attach(Observer observer);

    /**
     * 退出
     * @param observer Observer
     */
    void detach(Observer observer);

    /**
     * notify 发消息
     * @param data String
     */
    void notify(String data);
}

class EventBus implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        if (!this.observerList.contains(observer)) {
            this.observerList.add(observer);
        };
    }

    @Override
    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notify(String data) {
        for (Observer observer: observerList) {
            observer.update(data);
        }
    }
}

class Consumer implements Observer{

    @Override
    public void update(String data) {
        System.out.println("Consumer recived " + data);
    }
}

class OtherConsumer implements Observer {

    @Override
    public void update(String data) {
        System.out.println("OtherConsumer recived " + data);
    }
}

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-11  15:25
 */
public class ObserverRun {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Consumer consumer = new Consumer();
        OtherConsumer otherConsumer = new OtherConsumer();
        eventBus.attach(consumer);
        eventBus.attach(otherConsumer);
        eventBus.notify("发送广播");
    }
}
