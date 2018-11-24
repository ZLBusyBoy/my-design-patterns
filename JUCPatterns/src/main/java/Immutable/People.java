/*
 * People.java  * Created on  2018/11/24
 * Copyright (c) 2018 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */
package Immutable;

/**
 * @author ling.zhang
 */
public final class People {
    private final String sex;
    private final int age;
    private final String address;

    public People(String sex, int age, String address) {
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "People{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
