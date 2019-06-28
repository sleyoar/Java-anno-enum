package ecjtu.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        String text="base64 class in java 8";
        //base64编码
        String encoded= Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);
        //base64解码
        String decoded=new String(Base64.getDecoder().decode(encoded),StandardCharsets.UTF_8);
        System.out.println(decoded);

    }
}
