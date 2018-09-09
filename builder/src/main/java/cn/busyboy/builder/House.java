package cn.busyboy.builder;

import java.sql.BatchUpdateException;

/**
 * Create by ling.zhang on 2018/9/9.
 */
public final class House {

    private final HouseType houseType;
    private final Bed bed;
    private final Window window;

    public House(Builder builder) {
        this.houseType = builder.houseType;
        this.bed = builder.bed;
        this.window = builder.window;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public Bed getBed() {
        return bed;
    }

    public Window getWindow() {
        return window;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("this new house config is ")
                .append(houseType)
                .append(" and the bed is ")
                .append(bed)
                .append(" and the window is ")
                .append(window);

        return builder.toString();
    }

    public static class Builder{
        private HouseType houseType;
        private Bed bed;
        private Window window;

        public Builder setHouseType(HouseType houseType){
            this.houseType = houseType;
            return this;
        }

        public Builder setBed(Bed bed){
            this.bed = bed;
            return this;
        }

        public Builder setWindow(Window window){
            this.window = window;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
