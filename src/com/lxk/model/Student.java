package com.lxk.model;

/**
 * Created by lxk on 2017/3/23
 */
public class Student implements Cloneable {
    private String name;
    private Car car;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    @Override
    public Student clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
            if (car != null) {
                student.setCar(car.clone());
            }
        } catch (CloneNotSupportedException ignored) {
            System.out.println(ignored.getMessage());
        }
        return student;
    }
}
