package com.gildedrose.utils;

import com.gildedrose.model.Item;
import com.gildedrose.constant.Name;

/**
 * Created by IntelliJ IDEA.
 * gilded-rose-kata.NameUtils
 *
 * @Autor: vovamv
 * @DateTime: 26.10.2021|13:17
 * @Version NameUtils: 1.0
 */

public class ItemUtils {

    public static Boolean isAgedBrie(Item item) {
        return item != null && Name.AGED_BRIE
            .getValue()
            .equals(item.getName());
    }

    public static Boolean isNotAgedBrie(Item item) {
        return !isAgedBrie(item);
    }

    public static Boolean isBackstage(Item item) {
        return item != null && Name.BACKSTAGE_PASSES_TTO_A_TAFKAL80ETC_CONCERT
            .getValue()
            .equals(item.getName());
    }

    public static Boolean isNotBackstage(Item item) {
        return !isBackstage(item);
    }

    public static Boolean isAgedBrieAndBackstage(Item item) {
        return isAgedBrie(item) && isBackstage(item);
    }

    public static Boolean isNotAgedBrieAndBackstage(Item item) {
        return isAgedBrieAndBackstage(item);
    }

    public static Boolean isSulfuras(Item item) {
        return item != null && Name.SULFURAS_HAND_OF_RAGNRAROS
            .getValue()
            .equals(item.getName());
    }

    public static Boolean isNotSulfuras(Item item) {
        return !isSulfuras(item);
    }

    public static Boolean isQualityMoreThan(Item item, Integer value) {
        checkItem(item);
        return item.getQuality() > value;
    }

    public static Boolean isQualityLessThan(Item item, Integer value) {
        return !isQualityMoreThan(item, value);
    }

    public static void incrementQuality(Item item) {
        checkItem(item);
        item.setQuality(item.getQuality() + 1);
    }

    public static void decrementQuality(Item item) {
        checkItem(item);
        item.setQuality(item.getQuality() - 1);
    }

    public static void setQualityZero(Item item) {
        checkItem(item);
        item.setQuality(0);
    }

    public static Boolean isSellInLessThan(Item item, Integer value) {
        checkItem(item);
        return item.getSellIn() < value;
    }

    public static void decrementSellIn(Item item) {
        checkItem(item);
        item.setSellIn(item.getSellIn() - 1);
    }

    private static void checkItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is null!");
        }
    }
}
