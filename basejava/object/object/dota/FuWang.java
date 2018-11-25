package object.object.dota;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 13:14
 */
public class FuWang implements Dota {
    public String name;
    public FuWang(String name) {
        this.name = name;
    }
    @Override
    public String getHeroName() {
        return this.name;
    }
    public void display() {
        System.out.println(name + "20连斩");
    }
}
