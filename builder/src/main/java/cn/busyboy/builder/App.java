package cn.busyboy.builder;

/**
 * Create by ling.zhang on 2018/9/9.
 */
public class App {

    public static void main(String[] args) {
        House one = new House.Builder().setHouseType(HouseType.ONEBEDROOM)
                .setBed(Bed.PLANKBED).setWindow(Window.FRENCHWINDOW)
                .build();
        System.out.println(one.toString());

        System.currentTimeMillis();
    }
}
