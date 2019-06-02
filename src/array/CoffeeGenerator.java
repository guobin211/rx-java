/*
 * array CoffeeGenerator
 * @author GuoBin211 on 2019-06-02 17:28
 */
package array;

import java.util.Iterator;
import java.util.Random;

/**
 * 实现自定义接口和迭代器接口
 */
public class CoffeeGenerator implements IGenerator<Coffee>, Iterable<Coffee> {
    // 类型列表
    private Class[] types = {Latte.class, Mocha.class, America.class};
    // 随机数
    private static Random random = new Random(47);

    private int size = 0;

    CoffeeGenerator() {
    }

    CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    /**
     * 迭代器
     */
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

