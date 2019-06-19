/*
 * a_design_action.observer ManB
 * @author GuoBin211 on 2019-06-01 09:12
 */
package a.design.action.observer;

class ManB implements IObserver {
    ManB() {
    }

    @Override
    public void update(MyPublishData myPublishData) {
        System.out.println("ManB 收到消息: " + myPublishData.name + myPublishData.value);
    }
}

