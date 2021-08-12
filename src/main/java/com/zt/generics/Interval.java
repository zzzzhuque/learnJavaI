package com.zt.generics;

import java.io.Serializable;


/**
 * 《java核心技术I》P334解释范型擦除
 * 原始类型用第一个限定来替换类型变量，如果没有给出限定，用Object替换
 */
public class Interval <T extends Comparable & Serializable> implements Serializable{
    private T lower;
    private T upper;

    public Interval(T first, T second) {
        if (first.compareTo(second) <= 0) {
            lower = first;
            upper = second;
        } else {
            lower = second;
            upper = first;
        }
    }
}
