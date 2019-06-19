package a.oop.open.close;

/**
 * LineChart
 *
 * @author GuoBin211 on 2019-05-30 21:59
 */
class LineChart extends BaseChart implements IChart {

    @Override
    public void display() {
        System.out.println("LineChart display");
    }

    @Override
    public void getName() {
        System.out.println("Name is LineChart");
    }
}

