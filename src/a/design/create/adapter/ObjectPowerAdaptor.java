/*
 * a_design_create.adapter ObjectPowerAdaptor
 * @author GuoBin211 on 2019-06-01 08:49
 */
package a.design.create.adapter;

public class ObjectPowerAdaptor implements IMobileTarget {
    // 内部成员
    private ChinaPower chinaPower;
    ObjectPowerAdaptor(ChinaPower chinaPower) {
        this.chinaPower = chinaPower;
    }

    @Override
    public void sendMobilePower() {
        chinaPower.getPower();
        transform();
        System.out.println("ObjectPowerAdaptor sendMobilePower 12v");
    }

    private void transform() {
        System.out.println("ObjectPowerAdaptor 转换220v到12v");
    }
}

