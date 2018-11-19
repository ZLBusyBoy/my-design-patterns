/*
 * UserThread.java  * Created on  2018/11/19
 * Copyright (c) 2018 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */
package SingleThreadedExecution.NoPatterns;

/**
 * 人类，不断的通过们
 * @author ling.zhang
 */
public class UserThread extends Thread{
    private final Gate gate;
    private final String name;
    private final String address;

    public UserThread( Gate gate, String name, String address) {
        this.gate = gate;
        this.name = name;
        this.address = address;
    }

    @Override
    public void run(){
        //用户执行的动作，不断的去通过相应的门
        System.out.println(name + "Begin");
        while (true) {
            gate.pass(name, address);
        }
    }
}
