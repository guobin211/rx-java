package metadata;

/**
 * @author GuoBin201314@gmail.com on 2018/11/16 10:30
 */
public class Employee {
    public String name;
    private double salary;

    /**
     * 构造函数
     *
     * @param employeeName name
     */
    public Employee(String employeeName) {
        name = employeeName;
    }

    public void setSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmp() {
        System.out.print("名字" + name + "\n");
        System.out.print("薪水" + salary + "\n");
    }

    public static void main(String[] args) {
        Employee jack = new Employee("jack");
        jack.setSalary(5000);
        jack.printEmp();
    }
}
