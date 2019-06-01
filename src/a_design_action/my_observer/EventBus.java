/*
 * a_design_action.my_observer EventBus
 * @author GuoBin211 on 2019-06-01 09:14
 */
package a_design_action.my_observer;

import java.util.ArrayList;
import java.util.List;

class EventBus implements ISubject {

    private List<IObserver> iObservers;

    private Number rating = 0;

    Number getRating() {
        return rating;
    }

    void setRating(Number rating) {
        this.rating = rating;
        this.publish(new MyPublishData("rating", rating));
    }


    EventBus() {
        this.iObservers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver iObserver) {
        this.iObservers.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        this.iObservers.remove(iObserver);
    }

    @Override
    public void publish(MyPublishData myPublishData) {
        for (IObserver iObserver : iObservers) {
            iObserver.update(myPublishData);
        }
    }
}

