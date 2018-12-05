package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 15:54
 */
public class SelfLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("测试logger");
        logger.log(Level.WARNING, "打印错误日志");
    }

    public SelfLogger() {

    }
}
