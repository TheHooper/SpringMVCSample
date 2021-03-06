package com.hooper.common.util;

import java.util.Random;

/**
 * Created by hooper on 2016/12/1.
 */
public class RandomStrUtil {

    public static String getRandomStr(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
