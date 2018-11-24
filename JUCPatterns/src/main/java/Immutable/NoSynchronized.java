/*
 * NoSynchronized.java  * Created on  2018/11/24
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
public class NoSynchronized {

    private static final long CALL_COUNT = 1000000000L;

    public static void main(String[] args) {
        trial("NotSynch",CALL_COUNT,new NotSynch());
        trial("Synch",CALL_COUNT,new Synch());
    }

    private static void trial(String msg,long count,Object object){
        System.out.println(msg + ": BEGIN");
        long start_time = System.currentTimeMillis();
         for (long i = 0; i< count; i++){
             object.toString();
         }

         System.out.println(msg + ": END");
         System.out.println("Elapsed time = " + (System.currentTimeMillis() - start_time) + "msec");
    }

    static class NotSynch{
        private final String name = "NotSynch";

        @Override
        public String toString() {
            return "NotSynch{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Synch{
        private final String name = "Synch";

        @Override
        public synchronized String toString() {
            return "Synch{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
