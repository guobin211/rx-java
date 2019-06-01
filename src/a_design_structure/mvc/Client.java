/*
 * a_design_structure.mvc Client
 * @author GuoBin211 on 2019-06-01 10:08
 */
package a_design_structure.mvc;

public class Client {
    public static void main(String[] args) {
        System.out.println("复合模式代表MVC设计模式");
        Controller controller = new Controller();
        controller.getView("A");
        controller.getView("B");
    }
}

