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
abstract class AATest extends AAATest{
    protected void service(){
        System.out.println("AATest service");
        doGet();
    }

    protected void doGet(){
        System.out.println("AATest doGet");
    }

}
