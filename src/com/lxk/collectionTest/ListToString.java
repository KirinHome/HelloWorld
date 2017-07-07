package com.lxk.collectionTest;

import com.google.common.collect.Lists;
import com.lxk.model.Car;
import com.lxk.model.Dog;

import java.util.List;

/**
 * 集合类使用toString()方法的测试
 * <p>
 * Created by lxk on 2017/3/13
 */
public class ListToString {
    public static void main(String[] args) {
        List<String> s = Lists.newArrayList();
        List<String> ss = Lists.newArrayList();
        List<Car> list1 = Lists.newArrayList();
        List<Car> list2 = Lists.newArrayList();
        Dog dog = new Dog(true, true);
        List<Dog> dogs = Lists.newArrayList();
        dogs.add(dog);
        for (int i = 0; i < 5; i++) {
            s.add(i + "saa");
            ss.add(i + "saa");
            list1.add(new Car("i", 100 + i, dogs));
            list2.add(new Car("i", 100 + i, dogs));
        }
        //List<普通类型>，直接toString()，可以输出内容。
        System.out.println(s.toString().equals(ss.toString()));
        System.out.println(s.toString());
        //List<对象类型>，直接toString()，若对应model没复写toString()方法，输出是地址；复写toString()之后，输出就不是地址。
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list1.toString().equals(list2.toString()));
    }
}
