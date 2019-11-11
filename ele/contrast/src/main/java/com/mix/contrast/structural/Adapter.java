package com.mix.contrast.structural;

abstract class BasePower {
    int power;
}

class ChinesePower extends BasePower {
    int power = 220;
}

class UsaPower extends BasePower {
    int power = 110;
}

class PowerAdapter extends BasePower {

    private final static int TARGET_POWER = 220;
    int power;

    PowerAdapter(BasePower basePower) {

        if (basePower.power != TARGET_POWER) {
            power = 220;
        } else {
            power = basePower.power;
        }
    }

}

class Computer {
    /**
     * 消费着需要220V
     * @param power 220
     */
    void turnOn(PowerAdapter power) {
        System.out.println(power.power == 220);
    }
}

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-11  15:03
 */
public class Adapter {
    public static void main(String[] args) {
        Computer computer = new Computer();
        PowerAdapter powerAdapter = new PowerAdapter(new UsaPower());
        PowerAdapter powerAdapter1 = new PowerAdapter(new ChinesePower());
        computer.turnOn(powerAdapter);
        computer.turnOn(powerAdapter1);
    }
}
