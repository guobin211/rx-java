package logic;

/**
 * 自定义异常 继承JDK的异常
 * @author GuoBin201314@gmail.com on 2018/11/17 15:44
 */
public class UserNotFoundException extends BaseException {
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String[] args) {
    }
}
