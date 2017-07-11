package com.lxk.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * <p>
 * Created by lxk on 2017/7/11
 */
public class MaoPao {
    public static void main(String[] args) {
        int ints[] = {11, 2, 5, 3, 9, 7, 12, 2};
        System.out.println("排序前" + Arrays.toString(ints));
        test(ints);
        System.out.println("排序后" + Arrays.toString(ints));
    }

    private static void test(int[] ints) {
        int length = ints.length - 1;
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }

}
