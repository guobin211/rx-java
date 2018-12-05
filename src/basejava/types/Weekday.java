package types;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 14:46
 */
public enum Weekday {
    /**
     * 星期天 至 星期六
     * SUN("星期天")  ==> 常量的构造方法
     */
    SUN("星期天"), MON("星期一"), TUE("星期二"), WED("星期三"), THUR("星期四"), FRI("星期五"), SAT("星期六");
    private String chinese;
    /**
     * 构造方法
     * @param chinese 中文
     */
    private Weekday(String chinese) {
        this.chinese = chinese;
    }
    public String toChinese() {
        return  chinese;
    }
}
