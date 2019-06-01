/*
 * a_design_structure.mvc View
 * @author GuoBin211 on 2019-06-01 10:09
 */
package a_design_structure.mvc;

class View implements IView {

    @Override
    public void render(Object o) {
        System.out.println("View render");
        System.out.println(o.toString());
    }
}

