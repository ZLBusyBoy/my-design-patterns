package cn.busyboy.builder;

/**
 * Create by ling.zhang on 2018/9/9.
 */
public enum  Window {
    WOODWINDOW("木窗"),
    PVCWINDOW("塑钢窗"),
    SCREENWINDOW("纱窗"),
    FRENCHWINDOW("落地窗"),
    LUCARNEWINDOW("屋顶窗");

    String title;

    Window(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
