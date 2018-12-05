package computed;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * @author GuoBin201314@gmail.com on 2018/11/18 11:09
 */
public class Encode {
    public static void main(String[] args) {
        String s = "测试编码加密abck666";
        String sort = "随即数";
        //  编码
        String bs = Base64.getEncoder().withoutPadding().encodeToString(s.getBytes());
        System.out.println(bs);
        //  解码
        String ori = new String(Base64.getDecoder().decode(bs), StandardCharsets.UTF_8);
        System.out.println(ori);
        byte[] res;
        res = mdMatch((s+sort).getBytes(StandardCharsets.UTF_8));
        System.out.println(String.format("%032x", new BigInteger(1, res)));
    }

    /**
     * md5摘要算法
     * @param input byte[]
     * @return byte[]
     */
    static byte[] mdMatch(byte[] input) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        assert md != null;
        md.update(input);
        System.out.println("md5加密" + md);
        return md.digest();
    }
}
