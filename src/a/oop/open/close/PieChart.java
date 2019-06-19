package a.oop.open.close;

/**
 * PieChart
 *
 * @author GuoBin211 on 2019-05-30 21:59
 */
class PieChart extends BaseChart implements IChart {


    @Override
    public void display() {
        System.out.println("PieChart display");
    }

    @Override
    public void getName() {
        System.out.println("Name is PieChart");
    }
}

