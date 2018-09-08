/**
 * 元年软件
 *
 * @author 王文龙
 * @date 2018/8/16 19:53
 * @version V1.0
 */
package com.epoch.calltest;

/**
 * <类描述>
 * @author 王文龙
 * @date 2018/8/16 19:53
 * @version V1.0
 */
public class ATest extends AATest{
    protected void doGet(){
        System.out.println("ATest doGet");
    }

    public static void main(String[] args) {
        new ATest().service();
    }
}
