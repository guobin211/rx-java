/*
 * a_design_create.proxy USASeller
 * @author GuoBin211 on 2019-05-31 22:58
 */
package a.design.create.proxy;

public class USASeller implements IMacSeller {
    @Override
    public void sell() {
        System.out.println("USASeller sell Mac...");
    }
}

