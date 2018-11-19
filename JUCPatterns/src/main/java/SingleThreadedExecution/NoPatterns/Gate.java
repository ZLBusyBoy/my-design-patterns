/*
 * Gate.java  * Created on  2018/11/19
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

import sun.swing.plaf.synth.DefaultSynthStyle;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 门类，记录通过的人数和姓名出生地
 * @author ling.zhang
 */
public class Gate {
    private int counter =0;
    private String name;
    private String address;
    static Lock lock = new ReentrantLock();

    /**
     * 门的方法，通过
     * 没有做过多线程的处理，下面的四条语句在多线程的情况下很有可能是交错执行的，
     * 第一个线程走到了address，第二个线程则走到了name，之后check就会报错
     * @param name
     * @param address
     */
    public void pass(String name, String address) {
        try {
            lock.lock();
            this.counter++;
            this.name = name;
            this.address = address;
            check();
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "No." + counter + ":" + name + "，" + address;
    }


    private void check(){
        if (name.charAt(0) != address.charAt(0)){
            System.out.println("**** BROKEN ****" + toString());
        }
    }

}
