package com.newtouch.watchman.echarts.utils;

/**
 * @author liuzh
 */
public interface Data<T> {
    /**
     * 添加元素
     *
     * @param values
     * @return
     */
    T data(Object... values);
}
