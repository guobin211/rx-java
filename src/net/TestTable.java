package net;

/*
 * TestTable
 * @Author guobin201314@gmail.com on 2019-06-07 11:30
 */
public class TestTable {
    public static void main(String[] args) {
        System.out.println("测试注解");
        testExe();
    }
    public static void getMethods() {
        System.out.println("http method");
    }
    @NetTest(id = 1)
    public static void testExe() {
        getMethods();
    }
}
