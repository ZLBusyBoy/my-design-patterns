/*
 * Main.java  * Created on  2018/11/19
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
 * 创建门的类，让三个人不断的通过
 * @author ling.zhang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("System init");
        Gate gate = new Gate();

        new UserThread(gate,"zhangling","zhangjiakou").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"fangjiazhuang","fangshan").start();
    }
}
