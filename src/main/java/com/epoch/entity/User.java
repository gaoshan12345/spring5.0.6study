/**
 * 元年软件
 *
 * @author 王文龙
 * @date 2018/6/26 19:53
 * @version V1.0
 */
package com.epoch.entity;

/**
 * <类描述>
 * @author 王文龙
 * @date 2018/6/26 19:53
 * @version V1.0
 */
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
