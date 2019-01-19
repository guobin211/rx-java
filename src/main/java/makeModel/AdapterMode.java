package makeModel;

interface PowerMac {
    void getPowerForMac();
}

class PowerChina {
    public void getPowerChina() {
        System.out.println("PowerChina is 220v");
    }
}

class MacBook {
    public void PowerOn(PowerMac powerMac) {
        System.out.println("MacBook need power 5v");
        powerMac.getPowerForMac();
    }
}

/**
 * 类适配器
 * 自身接收 220v
 * 同时继承 48v
 * 自身完成转换过程
 */
class PowerAdapter extends PowerChina implements PowerMac {

    @Override
    public void getPowerForMac() {
        super.getPowerChina();
        transform();
        System.out.println("输出 48v 电压");
    }

    void transform() {
        System.out.println("把china 220v电压 转换为 mac 需要的 48v 电压");
    }
}

/**
 * 通过内部对象实现代理
 */
class NoExtendAdapter implements PowerMac {

    private PowerChina powerChina;
    public NoExtendAdapter(PowerChina powerChina) {
        this.powerChina = powerChina;
    }

    @Override
    public void getPowerForMac() {
        powerChina.getPowerChina();
        transform();
        System.out.println("输出 48v 电压");
    }

    private void transform() {
        System.out.println("转换电压");
    }
}


/**
 * makeModel   AdapterMode
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class AdapterMode {
    public static void main(String[] args) {
        System.out.println("适配器模式 AdapterMode");
        // extend 实现代理
        MacBook macBook = new MacBook();
        macBook.PowerOn(new PowerAdapter());
        // 内部对象实现代理
        MacBook macBook1 = new MacBook();
        macBook1.PowerOn(new NoExtendAdapter(new PowerChina()));
    }
}
