package a.oop.onetask;

import java.util.ArrayList;
import java.util.List;

/**
 * CustomerDao
 *
 * @author GuoBin211 on 2019-05-30 21:40
 */
class CustomerDao {
    /**
     * 查找数据
     * @return List
     */
    List<Customer> findCustomer() {
        List<Customer> res = new ArrayList<Customer>();
        res.add(new Customer("jack", 21));
        res.add(new Customer("tom", 22));
        return res;
    }
}

