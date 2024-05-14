package com.kkk.common.utils;

import java.util.UUID;

/**
 * JWT工具类
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/5/13 22:25
 * @Version V1.0
 */
public class JwtUtils {

    //设置过期时间
    public static final Long JWT_TTL = 24 * 60 * 60 * 1000L;

    //设置密钥明文
    public static final String JWT_KEY = "lonelykkk";

    public static String getUUID() {
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        return token;
    }
}
