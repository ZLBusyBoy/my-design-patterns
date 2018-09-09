package cn.busyboy.builder;

/**
 * Create by ling.zhang on 2018/9/9.
 */
public enum Bed {

    PLANKBED("实木床"),
    BUNKBED("上下床"),
    SOFABED("沙发床"),
    BAMBOOBED("竹床"),
    HAMMOCK("吊床");

    String title;

    Bed(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
