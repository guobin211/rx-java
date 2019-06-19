/*
 * a_design_structure.mvc ModelA
 * @author GuoBin211 on 2019-06-01 10:09
 */
package a.design.structure.mvc;
class ModelA {
    private String name;
    private Integer age;
    ModelA(String s, Integer i) {
        name = s;
        age = i;
    }

    @Override
    public String toString() {
        return "{name: \"" + name+ "\", age:\"" + age + "\"}";
    }
}

