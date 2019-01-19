package makeModel;

interface IFood{
    void eat();
}

/**
 * MakeModel   SimpleFactory
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class SimpleFactory {
    public static void main(String[] args) {
        ShopStore shopStore = new ShopStore();
        shopStore.getFood("KFC").eat();
        shopStore.getFood("MDL").eat();
    }
}

/**
 * 函数工厂
 */
class ShopStore {
    /**
     *  工厂方法
     * @param name Object name
     * @return Object by name
     */
    public IFood getFood(String name) {
        switch (name){
            case "KFC":
                return new KFC();
            case "MDL":
                return new MDL();
            default:
                return new KFC();
        }
    }
}

class KFC implements IFood{
    public KFC() {
    }
    @Override
    public void eat() {
        System.out.println("KFC eat");
    }
}

class MDL implements IFood{
    public MDL() {
    }
    @Override
    public void eat() {
        System.out.println("MDL eat");
    }
}
