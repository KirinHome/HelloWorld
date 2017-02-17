package com.lxk.test;

/**
 * 枚举测试
 * <p>
 * Created by lxk on 2017/2/17
 */
public class EnumTest {
    public static void main(String[] args) {
        GameEnum s = GameEnum.BIG;
        GameEnum ss = GameEnum.SMALL;
        GameEnum sss = GameEnum.FATTER;

    }
}

enum GameEnum{
    BIG,
    SMALL,
    FATTER
}
