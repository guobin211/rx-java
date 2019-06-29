package string;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * RxStream
 * @Author guobin201314@gmail.com on 2019-06-11 09:35
 */
public class RxStream {
    private static final String CSV_PATH = "/users/guobin/devtool/data/csv";

    public static void main(String[] args) {
        List<String> city = new ArrayList<String>();
        List<File> fileList = new ArrayList<File>();
        File fileDir = new File(CSV_PATH);
        if (fileDir.isDirectory()) {
            File[] files = fileDir.listFiles();
            assert files != null;
            for (File file : files) {
                if (file.isDirectory()) {
                    File[] csv = file.listFiles();
                    assert csv != null;
                    for (File value : csv) {
                        fileList.add(value);
                        city.add(value.toString());
                    }
                }
            }
        } else {
            System.out.println("socket ");
        }

        System.out.println(city.size());
        System.out.println(fileList.get(0));
    }

}
