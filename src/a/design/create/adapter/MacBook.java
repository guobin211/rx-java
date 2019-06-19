/*
 * a_design_create.adapter MacBook
 * @author GuoBin211 on 2019-06-01 08:40
 */
package a.design.create.adapter;

class MacBook {
    MacBook() {
    }

    void PowerOn(ITarget iTarget) {
        System.out.println("MacBook Need 25v PowerOn");
        iTarget.sendPower();
    }
}

