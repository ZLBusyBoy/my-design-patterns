package cn.busyboy.builder;

import javax.lang.model.type.PrimitiveType;

/**
 * Create by ling.zhang on 2018/9/9.
 */
public enum  HouseType {
    ONEBEDROOM("one-bedroom"),
    TWOBEDROOM("two-bedroom"),
    THREEBEDROOM("three-bedroom");

    String title;

    HouseType(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
