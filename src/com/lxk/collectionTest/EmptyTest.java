package com.lxk.collectionTest;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by lxk on 2017/5/26
 */
public class EmptyTest {
    public static void main(String[] args) {
        testLoopEmptyMap();
    }

    /**
     * empty,没关系，但是要是null就会空指针。
     */
    private static void testLoopEmptyMap() {
        Map<String, String> map = Maps.newHashMap();
        for (String s : map.values()) {
            System.out.println(s);
        }
    }
}
