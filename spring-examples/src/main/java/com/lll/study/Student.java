package com.lll.study;

/**
 * <p>detail description</p>
 *
 * @author zl
 * @version 1.0
 * @date 2022-04-15 15:39
 * @update 2022-04-15 15:39
 * @since 1.0
 **/
public class Student {

    private String name = "test";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
