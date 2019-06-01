/*
 * a_design_create.adapter PowerAdapter
 * @author GuoBin211 on 2019-06-01 08:41
 */
package a_design_create.adapter;

public class PowerAdapter extends ChinaPower implements ITarget {
    PowerAdapter() {
    }

    @Override
    public void sendPower() {
        // 继承类
        super.getPower();
        transform();
    }

    private void transform() {
        System.out.println("220v转压处理到25v");
    }
}

