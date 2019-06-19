/*
 * a_design_create.proxy HKSeller
 * @author GuoBin211 on 2019-05-31 22:59
 */
package a.design.create.proxy;

public class HKSeller implements IMacSeller {
    private IMacSeller iMacSeller = new USASeller();
    @Override
    public void sell() {
        System.out.println("代理模式: HKSeller sell Mac from USASeller");
        iMacSeller.sell();
    }
}

