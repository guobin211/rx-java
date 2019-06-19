/*
 * a_design_create.simple_factory FoodsShop
 * @author GuoBin211 on 2019-05-31 22:15
 */
package a.design.create.simple_factory;

class FoodsShop {
    FoodsShop() {
    }

    /**
     * 工厂函数，返回需要的数据
     * @param name
     * @return
     */
    IFood getFood(String name) {
        switch (name) {
            case "Fish":
                return new Fish();
            case "Meat":
                return new Meat();
            default:
                System.out.println("not food:" + name);
                return null;
        }
    }
}

