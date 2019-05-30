package a_oop_one_task;

import java.util.ArrayList;
import java.util.List;

/**
 * CustomerChart
 *
 * @author GuoBin211 on 2019-05-30 21:33
 */
class CustomerChart {

    private CustomerDao customerDao;

    void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    /**
     * 查找数据
     * @return List
     */
//    private List<Customer> findCustomer() {
//        List<Customer> res = new ArrayList<Customer>();
//        res.add(new Customer("jack", 21));
//        res.add(new Customer("tom", 22));
//        return res;
//    }

    void displayChart() {
        for (Customer customer: customerDao.findCustomer()) {
            System.out.println("customer is :" + customer.name + customer.age);
        }
    }
}
