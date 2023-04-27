package com.xunqi.common.constant;

public class CartServiceConstant {
    //购物车临时用户的cookie
    public static final String TEMP_USER_COOKIE_NAME = "user-key";

    //cookie过期时间 一个月
    public static final int TEMP_USER_COOKIE_TIMEOUT = 60*60*24*30;
    //存储redis 的前缀
    public final static String CART_PREFIX = "gulimall:cart:";

}
