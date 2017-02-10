package com.lxk.test;

import java.util.Arrays;

/**
 * Created by lxk on 2017/2/10
 */
public class ArraysTest {
    public static void main(String[] args) {
        testArraysCopy();
    }

    private static void testArraysCopy() {
        Object[] numbers = {1, "ss", 3, 4, 5};
        Object[] numbersCopy = Arrays.copyOf(numbers, 5);
        numbersCopy[0] = 11;
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println(Arrays.toString(numbers));
    }
}
