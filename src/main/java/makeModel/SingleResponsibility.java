package makeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * makeModel   SingleResponsibility
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        System.out.println("单一职责原则");

        Chart chart = new Chart();
        chart.setDataChart(new DataChart());
        chart.renderChart();
    }
}

/**
 * 实现绘图的类
 */
class Chart {
    DataChart dataChart;

    /**
     * 数据来自外部传入
     * @param dataChart data
     */
    public void setDataChart(DataChart dataChart) {
        this.dataChart = dataChart;
    }

    public void renderChart() {
        for (SellData sellData: dataChart.findDataFromDatabase()) {
            System.out.println("Chart for sellData  " + sellData.name);
        }
    }
}

/**
 * 获取数据的类
 */
class DataChart {
    public List<SellData> findDataFromDatabase() {
        List<SellData> res = new ArrayList<>();
        res.add(new SellData("jack"));
        res.add(new SellData("tom"));
        return res;
    }
}

/**
 * 数据类型的类
 */
class SellData{
    public Integer month;
    public String name;
    public SellData(String name){
        this.month = 1;
        this.name = name;
    }
}
