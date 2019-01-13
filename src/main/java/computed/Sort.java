package computed;

public class Sort {

    public static void main(String[] args) {
        int[] ints = {2, 6, 7, 9, 3, 1, 7, 2, 3, 6};

        printArray(ints);

//        bubbleSort(ints);
        insertSort(ints);
        printArray(ints);
    }

    private static void printArray(int[] ints) {
        StringBuilder string = new StringBuilder();
        string.append("[");

        for (int i = 0; i < ints.length ; i++) {
            string.append(ints[i]);
            if (i != ints.length -1) {
                string.append(",");
            }
        }
        string.append("]");

        System.out.println(string);

    }

    public static void bubbleSort(int[] numbers) {
        int temp = 0;
        int size = numbers.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 时间复杂度：O（n^2
     * @param numbers int[]
     */
    public static void insertSort(int[] numbers) {
        int size = numbers.length;
        int temp = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            temp = numbers[i];
            //  temp比前面的值小，则将前面的值后移
            for (j = i; j > 0 && temp < numbers[j-1] ; j--) {
                numbers[j] = numbers[j-1];
            }
            numbers[j] =temp;
        }
    }
}
