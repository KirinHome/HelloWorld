package com.lxk.poiTest;

import com.google.common.collect.Lists;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * poi jar 包测试
 * Created by lxk on 2016/11/15
 */
public class PoiTest {
    public static void main(String[] args) {
        List<Integer> all = getListData();
        poiTest(all);
    }

    /**
     * 导出Excel测试
     *
     * @param all 导出数据集合
     */
    private static void poiTest(List<Integer> all) {
        try {
            FileOutputStream out = new FileOutputStream("D:/test.txt");
            PrintStream p = new PrintStream(out);
            for (Integer integer : all) {
                p.println("This is " + integer + " line");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得导出数据集合
     */
    private static List<Integer> getListData() {
        List<Integer> all = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            all.add(i);
        }
        return all;
    }


}
