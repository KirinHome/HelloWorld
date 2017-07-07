package com.lxk.commonTest;

import com.lxk.model.enumModel.SeasonEnum;

/**
 * 测试switch case可以使用【字符串，枚举，int，char，】
 * <p>
 * Created by lxk on 2017/7/7
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        testCaseString();
        SeasonEnum seasonEnum = SeasonEnum.SPRING;
        testCaseEnum(seasonEnum);
    }

    /**
     * case可以使用枚举
     */
    private static void testCaseEnum(SeasonEnum seasonEnum) {
        switch (seasonEnum) {
            case SPRING:
                System.out.println("case可以使用枚举。春");
                break;
            case SUMMER:
                System.out.println("夏");
                break;
            case AUTUMN:
                System.out.println("秋");
                break;
            case WINTER:
                System.out.println("冬");
                break;
            default:
                System.out.println("default");
        }
    }

    /**
     * case可以使用String
     */
    private static void testCaseString() {
        String color = "ss";
        switch (color) {
            case "ss":
                System.out.println("case可以使用字符串。");
                break;
            case "yy":
                System.out.println("yy");
                break;
            default:
                System.out.println("default");
        }
    }

}
