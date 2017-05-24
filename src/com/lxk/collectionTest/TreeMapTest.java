package com.lxk.collectionTest;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 测试TreeMap是否有序
 *
 * Created by lxk on 2017/5/24
 */
public class TreeMapTest {
    public static void main(String[] args) {
        testTreeMap();
    }

    private static void testTreeMap() {
        Map<String, Integer> map = Maps.newTreeMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        for (Integer integer : map.values()) {
            System.out.println(integer);
        }
    }
}
