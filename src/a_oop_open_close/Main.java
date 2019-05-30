package a_oop_open_close;

/**
 * Main
 *  开放封闭原则
 * @author GuoBin211 on 2019-05-30 21:56
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("开放封闭原则");
        LineChart lineChart = new LineChart();
        PieChart pieChart = new PieChart();
        pieChart.display();
        pieChart.getName();
        lineChart.display();
        lineChart.getName();
        // BaseChart内部开放外部封闭, display通过ChartManage调用
        ChartManage chartManage = new ChartManage();
        chartManage.display(new PieChart());
        lineChart.display();
    }
}

