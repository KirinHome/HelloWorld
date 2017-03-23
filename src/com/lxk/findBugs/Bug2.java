package com.lxk.findBugs;

import com.lxk.model.Car;
import com.lxk.model.Student;

/**
 * 引用传递也就是地址传递需要注意的地方，引起的bug
 *
 * Created by lxk on 2017/3/23
 */
public class Bug2 {
    public static void main(String[] args) {
        Student student = new Student();
        Car car = new Car("oooo", 100);
        student.setCar(car);
        System.out.println(student);
        car.setSign("X5");
        System.out.println(student);
    }
}
