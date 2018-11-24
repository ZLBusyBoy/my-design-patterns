/*
 * UserDetail.java  * Created on  2018/11/24
 * Copyright (c) 2018 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */
package Immutable.not_real_immutable;

import java.lang.reflect.Field;

/**
 * @author ling.zhang
 */
public final class UserDetail {
    private final StringBuffer detail;
    public UserDetail(String sex,int age,String address){
        this.detail = new StringBuffer(sex + ":" + age + ":" + address);
    }

    public StringBuffer getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "detail=" + detail +
                '}';
    }


    public static void main(String[] args) {
        /*UserDetail userDetail = new UserDetail("男",27,"北京");
        //显示
        System.out.println(userDetail);

        StringBuffer detail = userDetail.getDetail();
        detail.append(":::").append("test");
        //再次显示
        System.out.println(userDetail);*/

        //创建字符串"Hello World"， 并赋给引用s
        try {
            String s = "Hello World";
            System.out.println("s = " + s); //Hello World

            //获取String类中的value字段
            Field valueFieldOfString = String.class.getDeclaredField("value");
            //改变value属性的访问权限
            valueFieldOfString.setAccessible(true);

            //获取s对象上的value属性的值
            char[] value = (char[]) valueFieldOfString.get(s);
            //改变value所引用的数组中的第5个字符
            value[5] = '#';
            System.out.println("s = " + s);  //Hello_World
        }catch (Exception e){

        }
    }
}
