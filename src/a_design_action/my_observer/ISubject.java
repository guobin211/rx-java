/*
 * a_design_action.my_observer ISubject
 * @author GuoBin211 on 2019-06-01 09:07
 */
package a_design_action.my_observer;

public interface ISubject {
    void registerObserver(IObserver iObserver);
    void removeObserver(IObserver iObserver);
    void publish(MyPublishData myPublishData);
}

