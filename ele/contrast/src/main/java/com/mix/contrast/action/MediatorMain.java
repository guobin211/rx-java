package com.mix.contrast.action;

abstract class BaseMediator {
    /**
     * 操作消息
     * @param i int
     */
    abstract void operation(int i);
}

class Colleague {
    void receivel() {}

    void send(String data) {}

    void setMediator(BaseMediator baseMediator) {
    }
}

class ConcreteColleague extends Colleague {
    @Override
    void send(String data) {
        super.send("ConcreteColleague: " + data);
    }

    @Override
    void setMediator(BaseMediator baseMediator) {
        super.setMediator(baseMediator);
    }
}


/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-12  13:46
 */
public class MediatorMain {
    public static void main(String[] args) {
        System.out.println("中间人模式");
    }
}
