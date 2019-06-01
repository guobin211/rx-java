/*
 * a_design_action.my_observer ManA
 * @author GuoBin211 on 2019-06-01 09:12
 */
package a_design_action.my_observer;

class ManA implements IObserver{
    ManA() {
    }

    @Override
    public void update(MyPublishData myPublishData) {
        System.out.println("ManA 收到消息: " + myPublishData.value);
    }
}

