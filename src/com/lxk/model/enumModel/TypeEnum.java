package com.lxk.model.enumModel;

/**
 * 常用类型(带参数的枚举常量，这个只是在书上不常见，实际使用还是很多的，看懂这个，使用就不是问题啦。)
 * <p>
 * Created by lxk on 2017/7/7
 */
public enum TypeEnum {
    FIREWALL("firewall"),
    SECRET("secretMac"),
    BALANCE("f5");

    private String typeName;

    TypeEnum(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 根据类型的名称，返回类型的枚举实例。
     *
     * @param typeName 类型名称
     */
    public static TypeEnum fromTypeName(String typeName) {
        for (TypeEnum typeEnum : TypeEnum.values()) {
            if (typeEnum.getTypeName().equals(typeName)) {
                return typeEnum;
            }
        }
        return null;
    }

    public String getTypeName() {
        return this.typeName;
    }
}