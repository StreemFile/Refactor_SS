package com.gildedrose.constant;

public enum Name {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES_TTO_A_TAFKAL80ETC_CONCERT("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS_HAND_OF_RAGNRAROS("Sulfuras, Hand of Ragnaros");

    private String value;

    Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
