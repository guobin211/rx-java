/*
 * a_design_structure.mvc Controller
 * @author GuoBin211 on 2019-06-01 10:09
 */
package a.design.structure.mvc;

class Controller {
    private View view;
    Controller() {
        this.view = new View();
    }

    /**
     * 控制返回的试图
     * @param s
     */
    void getView(String s) {
        if ("A".equals(s)) {
            this.view.render(new ModelA("modala", 11));
        } else {
            this.view.render(new ModalB());
        }
    }
}

