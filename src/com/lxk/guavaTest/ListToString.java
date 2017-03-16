package com.lxk.guavaTest;

import com.google.common.collect.Lists;
import com.lxk.model.Car;
import com.lxk.model.Dog;

import java.util.List;

/**
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
        System.out.println(s.toString().equals(ss.toString()));
        System.out.println(s.toString());
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list1.toString().equals(list2.toString()));
    }
}
