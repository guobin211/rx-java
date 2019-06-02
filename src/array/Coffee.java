/*
 * array Coffee
 * @author GuoBin211 on 2019-06-02 17:24
 */
package array;

public class Coffee {
    private static long size = 0;
    // final关键字生成对象唯一id
    private final long id = size++;
    @Override
    public String toString() {
        return getClass().getSimpleName() +" id: "+ id;
    }
}

class Latte extends Coffee {

}

class Mocha extends Coffee{

}

class America extends Coffee{

}
