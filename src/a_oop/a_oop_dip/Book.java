package a_oop.a_oop_dip;

/**
 * Book
 *
 * @author GuoBin211 on 2019-05-30 22:50
 */
class Book implements IReader {
    @Override
    public void getContent() {
        System.out.println("获取Book的内容: getContent");
    }

}

