package makeModel;


interface IBeef {
    void eat();
}

interface IDrink {
    void drink();
}

interface IStore {
    IBeef getBeef();
    IDrink getDrink();
}

/**
 * 饮品店
 */
class DrinkShop implements IDrink{

    @Override
    public void drink() {
        System.out.println("DrinkShop eat");
    }
}

/**
 * 牛肉店
 */
class BeefShop implements IBeef {

    @Override
    public void eat() {
        System.out.println("BeefShop eat");
    }
}

/**
 * 超市
 */
class SuperMarket implements IStore{

    @Override
    public IBeef getBeef() {
        System.out.println("SuperMarket BeefShop eat");
        return new BeefShop();
    }

    @Override
    public IDrink getDrink() {
        System.out.println("SuperMarket DrinkShop eat");
        return new DrinkShop();
    }
}

/**
 * makeModel   AbstractFactory
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class AbstractFactory {

    public static void main(String[] args) {
        System.out.println("抽象工厂");
        // 综合超市 一个工厂生产多个产品
        IStore iStore = new SuperMarket();
        // 单一商店
        IDrink iDrink = new DrinkShop();
        // 单一商店
        IBeef iBeef = new BeefShop();

        IBeef ib = iStore.getBeef();
        iBeef.eat();

        IDrink id = iStore.getDrink();
        iDrink.drink();
    }
}
