package com.gildedrose.constant;

public enum Quality {
    FIRST_VALUE(0),
    SECOND_VALUE(50);

    private Integer value;

    Quality(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
