/*
 * a_design_create.adapter Client
 * @author GuoBin211 on 2019-05-31 23:29
 */
package a.design.create.adapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式:");
        ChinaPower chinaPower = new ChinaPower();
        chinaPower.getPower();
        // 类适配
        MacBook macBook = new MacBook();
        macBook.PowerOn(new PowerAdapter());
        // object适配器
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.TurnOn(new ObjectPowerAdaptor(chinaPower));
    }
}

