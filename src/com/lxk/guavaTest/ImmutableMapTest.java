package com.lxk.guavaTest;

/**
 * guava ImmutableMap 测试实例
 * <p>
 * Created by lxk on 2016/11/14
 */
public class ImmutableMapTest {
    public static void main(String[] args) {
        immutableMapTest();
    }

    /**
     * 测试 guava ImmutableMap
     */
    private static void immutableMapTest() {
        Integer key = 30;
        System.out.println("key = " + key + "的提示语是：" + ConstantMap.INTEGER_STRING_MAP.get(key));
    }
}