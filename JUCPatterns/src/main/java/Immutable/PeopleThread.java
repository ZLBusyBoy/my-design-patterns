/*
 * PeopleThread.java  * Created on  2018/11/24
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
public class PeopleThread extends Thread{

    private People people;

    public PeopleThread(People people){
        this.people = people;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + " prints " + people);
        }
    }
}
