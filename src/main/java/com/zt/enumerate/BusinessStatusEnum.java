package com.zt.enumerate;

/**
 * @description: 数据状态枚举
 */
public enum BusinessStatusEnum {
    // 0-正常，-1-不正常
    NORMAL((byte)0),
    DELETE((byte)-1);

    // 自定义构造函数
    BusinessStatusEnum(Byte status) {
        this.status = status;
    }

    public Byte getStatus() {
        return status;
    }

    // 自定义方法
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 自定义属性值
     */
    private Byte status;

    public static void main(String[] args) {
        BusinessStatusEnum statusEnum = BusinessStatusEnum.NORMAL;

        Byte testEnum = 0;

        if (statusEnum.getStatus().equals(testEnum)) {
            System.out.println("ok");
        }
    }
}