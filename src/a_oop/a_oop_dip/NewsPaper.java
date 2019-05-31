package a_oop.a_oop_dip;

/**
 * NewsPaper
 *
 * @author GuoBin211 on 2019-05-30 22:54
 */
public class NewsPaper implements IReader {

    @Override
    public void getContent() {
        System.out.println("获取NewsPaper的内容: NewsPaper");
    }
}

