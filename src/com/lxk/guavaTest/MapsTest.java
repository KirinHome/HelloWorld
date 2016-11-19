package com.lxk.guavaTest;

import com.google.common.collect.Maps;

import java.util.Iterator;
import java.util.Map;

/**
 * guava Maps 测试实例
 * <p>
 * Created by lxk on 2016/11/14
 */
public class MapsTest {
    public static void main(String[] args) {
        testMaps();
    }

    /**
     * 测试 guava Maps
     */
    private static void testMaps() {
        Map<Integer, Integer> map0 = Maps.newHashMap();
        for (int i = 0; i < 10; i++) {
            map0.put(i, i);
        }
        System.out.println("map0：" + map0);

        Map<Integer, Integer> map1 = Maps.newHashMap(map0);
        map1.put(10, 10);
        System.out.println("map1：" + map1);

        //下面的这个写法呢是在初始化list的时候，说明容器的扩容界限值
        //使用条件：你确定你的容器会装多少个，不确定就用一般形式的
        //说明：这个容器超过3个还是会自动扩容的。不用担心容量不够用。默认是分配一个容量为16的数组，不够将扩容
        //详细见后面说明
        Map<Integer, Integer> map2 = Maps.newHashMapWithExpectedSize(3);
        map2.put(1, 1);
        map2.put(2, 2);
        map2.put(3, 3);
        System.out.println("map2：" + map2);

        //LinkedHashMap<K, V> 有序map
        //Map<Integer,Integer> map3 = Maps.newLinkedHashMap();
        Map<Integer, Integer> map3 = Maps.newLinkedHashMap(map1);
        //Map<Integer,Integer> map3 = Maps.newLinkedHashMapWithExpectedSize(11);
        map3.put(11, 11);
        System.out.println("map3：" + map3);

        outMapKeyValue(map3);
    }

    /**
     * 遍历Map的四种方法
     */
    private static void outMapKeyValue(Map<Integer, Integer> map3) {

        //1.通过Map.entrySet遍历key和value
        for (Map.Entry<Integer, Integer> integerEntry : map3.entrySet()) {
            System.out.println("key：" + integerEntry.getKey() + " value：" + integerEntry.getValue());
        }

        //2.通过Map.entrySet使用iterator遍历key和value-----不推荐，直接用上面的for each循环代替此方法
        Iterator<Map.Entry<Integer, Integer>> it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println("key：" + entry.getKey() + " value：" + entry.getValue());
        }

        //3.通过Map.keySet遍历key；根据key得到value
        for (Integer integer : map3.keySet()) {
            System.out.println("key：" + integer + " value：" + map3.get(integer));
        }

        //4.通过Map.values()遍历所有的value，但不能遍历key
        for (Integer integer : map3.values()) {
            System.out.println("value：" + integer);
        }
    }


}
