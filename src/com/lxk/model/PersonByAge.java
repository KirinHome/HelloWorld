package com.lxk.model;

import java.util.Comparator;

/**
 * 测试model集合按某属性排序
 * <p>
 * Created by lxk on 2016/11/25
 */
public class PersonByAge implements Comparator<Person_> {

    @Override
    public int compare(Person_ o1, Person_ o2) {
        //这可以修改来升序或者降序
        //return o2.getAge() - o1.getAge();//降序
        return o1.getAge() - o2.getAge();//升序
    }
}
