package com.lxk.collectionTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lxk on 2017/2/13
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(2);
        System.out.println(list.size());
        list.add("12");
        System.out.println(list.size());
        list.set(1,"sss");
        list.add("22");
        System.out.println(list.size());

        System.out.println(list.toString());
    }
}
