package a_oop_dip;

/**
 * Women
 *
 * @author GuoBin211 on 2019-05-30 22:50
 */
class Women {
    /**
     * 类依赖于抽象
     * reader 要实现接口
     * @param
     */
    void read(IReader reader) {
        System.out.println("Women is read at:");
        reader.getContent();
    }
}

