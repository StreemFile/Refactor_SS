package com.gildedrose.constant;

public enum SellIn {
    FIRST_VALUE(0),
    SECOND_VALUE(6),
    THIRD_VALUE(11);

    private Integer value;

    SellIn(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
