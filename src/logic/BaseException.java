package logic;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 15:47
 */
public class BaseException extends RuntimeException {
    /**
     * 基础的错误处理类<将错误信息写入log中>
     * @param message 信息
     */
    public BaseException(String message) {
        super(message);
        System.out.println(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message);
        System.out.println(cause.toString());
    }

    public BaseException(Throwable cause) {
        super(cause);
        System.out.println(cause.toString());
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        System.out.println(message);
        System.out.println(cause.toString());
        System.out.println(enableSuppression);
        System.out.println(writableStackTrace);
    }
}
