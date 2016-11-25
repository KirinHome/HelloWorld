package com.lxk.designPattern.proxy.staticProxy;

/**
 * 代理对象类也实现目标接口
 * 继而实现目标方法。
 */
public class ProxyObject implements TargetInterface {

    /**
     * 面向接口编程，这个target其实指的是目标对象
     * MainTest测试的时候，传入的就是目标接口的实现类的对象。
     */
    private TargetInterface target;

    /**
     * 构造方法，代理对象得到真实的目标对象
     * 即：给真实目标对象赋值
     */
    public ProxyObject(TargetInterface target) {
        this.target = target;
    }

    /**
     * 在目标类的目标方法的上下文加一些内容
     *
     * 代理对象和真实对象的方法名是相同的，但是相对目标对象的目标方法，得到了扩展。
     * 对外看来，使用方式是一致的,都调用同 一方法名。
     * 类似生活中：
     * 商店买的和直接厂家买的东西都是一样的。
     * 厂家买：直接OK；
     * 商店买：这个税，那个税，这个程序，那个程序。前前后后加了很多包装
     * 只是经历的程序不一样，走的程序的多少的问题。代理一词来源于生活。
     * 代理看似麻烦，但是却解决了很多问题。解耦，分工明确。
     * 你不用到工厂去买你想要的东西。
     * 工厂也不用管一些乱七八糟的东西。
     *
     * AOP:定义一个切面，在切面的纵向定义处理方法，处理完成之后，回到横向业务流。
     * 具体看下示意图：注释不好整，就在下面截图啦。
     */
    @Override
    public void business() {
        System.out.println("aaaaa");//切面方法a();
        //。。。
        this.target.business();//目标类的目标方法(横向业务流：对应示意图的5();)
        //。。。
        System.out.println("bbbbb");//切面方法f();
    }

    /*
        缺点：目标类的目标方法写死了，每当目标类的目标方法修改，那么代理对象类的方法就得跟着修改。
        所以就出现了动态代理。
     */

}
