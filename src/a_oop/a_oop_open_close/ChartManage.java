package a_oop.a_oop_open_close;

/**
 * ChartManage
 *
 * @author GuoBin211 on 2019-05-30 22:06
 */
public class ChartManage implements IChartManage {
    private static final Number MAX_AGE = 22;
    private static Number rating = 3;
    private String name;
    ChartManage() {
        this.name = "ChartManage";
    }
    @Override
    public void display(BaseChart baseChart) {
        System.out.println(this.name);
        System.out.println(rating);
        baseChart.display();
    }
}

