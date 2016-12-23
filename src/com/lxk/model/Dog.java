package com.lxk.model;

/**
 * 测试boolean属性的getter和setter
 * <p>
 * Created by lxk on 2016/12/23
 */
public class Dog {
    private boolean isLoyal;//是忠诚的
    private boolean alive;//活蹦乱跳的

    public boolean isLoyal() {
        return isLoyal;
    }

    public void setLoyal(boolean loyal) {
        isLoyal = loyal;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
