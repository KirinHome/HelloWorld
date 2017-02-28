package com.lxk.test;

import com.google.common.collect.Lists;
import com.lxk.model.Person_;

import java.util.List;

/**
 * 测试Java的clone方法
 * <p>
 * Created by lxk on 2017/2/28
 */
public class CloneTest {
    public static void main(String[] args) {
        Person_ lxk = new Person_(18,"lxk");
        List<Person_> list = Lists.newArrayList();
        list.add(lxk);
        Person_ clone = lxk.clone();
        lxk.setAge(100);
        System.out.println(clone.getAge());
    }
}
