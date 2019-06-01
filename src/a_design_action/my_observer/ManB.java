/*
 * a_design_action.my_observer ManB
 * @author GuoBin211 on 2019-06-01 09:12
 */
package a_design_action.my_observer;

class ManB implements IObserver {
    ManB() {
    }

    @Override
    public void update(MyPublishData myPublishData) {
        System.out.println("ManB 收到消息: " + myPublishData.name + myPublishData.value);
    }
}

