package a.oop.onetask;

/**
 * Main
 * @author GuoBin211 on 2019-05-30 21:31
 */
public class Main {
    public static void main(String[] args) {
        //单一职责原则
        //一个类只操作一个步骤
        //Dao层用于获取数据
        CustomerChart customerChart = new CustomerChart();
        customerChart.setCustomerDao(new CustomerDao());
        customerChart.displayChart();
    }
}
