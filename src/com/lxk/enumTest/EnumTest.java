package com.lxk.enumTest;

/**
 * Java枚举用法测试
 * <p>
 * Created by lxk on 2016/12/15
 */
public class EnumTest {
    public static void main(String[] args) {
        forEnum();
        useEnumInJava();
    }

    /**
     * 循环枚举
     */
    private static void forEnum() {
        for (SimpleEnum simpleEnum : SimpleEnum.values()) {
            System.out.println(simpleEnum + "  ordinal  " + simpleEnum.ordinal());
        }
        System.out.println("------------------");
        for (TYPE type : TYPE.values()) {
            System.out.println(type + " " + type.getTypeName() + "  ordinal  " + type.ordinal());
        }
    }

    /**
     * 在Java代码使用枚举
     */
    private static void useEnumInJava() {
    }

    /**
     * 季节枚举(不带参数的枚举常量)
     */
    private enum SimpleEnum {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }


    /**
     * 常用类型(带参数的枚举常量)
     */
    private enum TYPE {
        /**
         * 防火墙
         */
        FIREWALL("firewall"),
        /**
         * 加密机
         */
        SECRET("secretMac"),
        /**
         * 负载均衡
         */
        BALANCE("f5");
        private String typeName;

        TYPE(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }
    }
}
