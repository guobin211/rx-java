package array;

/**
 * @author GuoBin201314@gmail.com on 2018/11/15 22:59
 */
public class OrderApp {
    private long[] arr;
    private int elements;

    /**
     * 构造函数
     *
     * @param max 最大数量
     */
    public OrderApp(int max) {
        arr = new long[max];
        elements = 0;
    }

    /**
     * 数组长度大小
     *
     * @return int
     */
    public int size() {
        System.out.print("数组长度======\n");
        return elements;
    }

    /**
     * 插入数据
     *
     * @param value long
     */
    public void insert(long value) {
        System.out.print("插入元素======\n");
        if (elements == 0) {
            arr[0] = value;
            elements = 1;
        } else if (value > arr[elements - 1]) {
            arr[elements] = value;
            elements++;
        } else {
            int temp = elements;
            elements++;
            //  从后往前插入数据
            for (int i = temp; i > 0; i--) {
                if (arr[i - 1] < value) {
                    long data = arr[i];
                    arr[i] = data;
                    arr[i - 1] = value;
                }
            }
        }
    }

    /**
     * 展示元素
     */
    public void display() {
        System.out.print("展示元素======\n");
        for (int i = 0; i < elements; i++) {
            System.out.print(arr[i]);
        }
    }

    /**
     * 二分查找
     *
     * @param searchKey 搜索项
     * @return 返回索引 index
     */
    public int find(long searchKey) {
        System.out.print("find 查找 ======\n");
        int lowerBound = 0;
        int upperBound = elements;
        System.out.print(upperBound);
        int index;
        //  二分查找
        while (true) {
            index = (lowerBound + upperBound) / 2;
            if (arr[index] == searchKey) {
                return index;
            } else if (lowerBound > upperBound) {
                //  未找到数据
                return elements;
            } else {
                if (arr[index] < searchKey) {
                    //  往后面查找
                    lowerBound = index + 1;
                } else {
                    //  往前面查找
                    upperBound = index - 1;
                }
            }
        }
    }

    /**
     * 删除元素
     *
     * @param value 元素
     * @return boolean
     */
    public boolean delete(long value) {
        System.out.print("删除元素======\n");
        int j = find(value);
        if (j == elements) {
            return false;
        } else {
            for (int i = 0; i < elements; i++) {
                arr[i] = arr[i + 1];
                elements--;
            }
            return true;
        }
    }
}
