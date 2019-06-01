/*
 * a_design_create.adapter MobilePhone
 * @author GuoBin211 on 2019-06-01 08:47
 */
package a_design_create.adapter;
class MobilePhone {
     MobilePhone() {
    }

    void TurnOn(IMobileTarget iMobileTarget) {
        System.out.println("MobilePhone 开机需要12v电压");
        iMobileTarget.sendMobilePower();
    }

}

