package com.lxk.TryCatchFinallyTest;

/**
 * 测试 try{}catch(){}finally{}的具体执行顺序
 * <p>
 * Created by lxk on 2016/11/11
 */
public class TryCatchFinallyTest {
    public static void main(String[] args) {
        testFunc1();
    }
    /**
     *
     */
    private static int testFunc1() {
        String s = null;
        int result;
        try {
            s.equals("ss");
            result = 1;                             //不走
            System.out.println("try " + result);    //不走
            return result;                          //try 的return语句
        } catch (Exception e) {
            result = 2;
            System.out.println("catch " + result);  //走，且会给result赋值
            //return result;                          //不一定会return
        } finally {
            result = 3;
            System.out.println("finally " + result);
            //return result;                        //这个打开返回的就是finally中的结果 3；关闭返回的就是catch中的结果 2
        }
        //result = 4;
        System.out.println("之外" + result);
        return result;                              //这个就占个位置，打开finally的return这个返回就永远走不到了，得注释了。
    }
}
