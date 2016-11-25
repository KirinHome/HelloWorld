package com.lxk.model;

public class Car implements Comparable<Car> {
    private String sign;
    private int price;

    public Car(String sign, int price) {
        this.sign = sign;
        this.price = price;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        //同理也可以根据sign属性排序，就不举例啦。
        return this.getPrice() - o.getPrice();
    }

    @Override
    public String toString() {
        return "Car{" +
                "sign='" + sign + '\'' +
                ", price=" + price +
                '}';
    }
}