package com.gildedrose;

import com.gildedrose.constant.Quality;
import com.gildedrose.constant.SellIn;
import com.gildedrose.model.Item;
import com.gildedrose.utils.ItemUtils;

import java.util.List;

class GildedRose {
    List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        items.forEach(this::updateQuality);
    }

    private void updateQuality(Item item) {
        checkNameAndQualityAndUpdateQuality(item);
        checkIsNotSulfurasAndUpdateSellIn(item);
        checkNameAndQualityAndSellInAndUpdateQuality(item);
    }

    private void checkNameAndQualityAndUpdateQuality(Item item) {
        if (ItemUtils.isNotAgedBrieAndBackstage(item)) {
            decrementQualityWithCheck(item);
        } else {
            if (ItemUtils.isQualityLessThan(item, Quality.SECOND_VALUE.getValue())) {
                ItemUtils.incrementQuality(item);
                if (ItemUtils.isBackstage(item)) {
                    checkSellInAndQualityAndUpdateQuality(item,
                                                          SellIn.THIRD_VALUE.getValue(),
                                                          Quality.SECOND_VALUE.getValue());
                    checkSellInAndQualityAndUpdateQuality(item,
                                                          SellIn.SECOND_VALUE.getValue(),
                                                          Quality.SECOND_VALUE.getValue());
                }
            }
        }
    }

    private void checkIsNotSulfurasAndUpdateSellIn(Item item) {
        if (ItemUtils.isNotSulfuras(item)) {
            ItemUtils.decrementSellIn(item);
        }
    }

    private void checkNameAndQualityAndSellInAndUpdateQuality(Item item) {
        if (ItemUtils.isSellInLessThan(item, SellIn.FIRST_VALUE.getValue())) {
            if (ItemUtils.isNotAgedBrie(item)) {
                if (ItemUtils.isNotBackstage(item)) {
                    decrementQualityWithCheck(item);
                } else {
                    ItemUtils.setQualityZero(item);
                }
            } else {
                if (ItemUtils.isQualityLessThan(item, Quality.SECOND_VALUE.getValue())) {
                    ItemUtils.incrementQuality(item);
                }
            }
        }
    }

    private void checkSellInAndQualityAndUpdateQuality(Item item, Integer sellIn, Integer quality) {
        if (ItemUtils.isSellInLessThan(item, sellIn)) {
            if (ItemUtils.isQualityLessThan(item, quality)) {
                ItemUtils.incrementQuality(item);
            }
        }
    }

    private void decrementQualityWithCheck(Item item) {
        if (ItemUtils.isQualityMoreThan(item, Quality.FIRST_VALUE.getValue())) {
            if (ItemUtils.isNotSulfuras(item)) {
                ItemUtils.decrementQuality(item);
            }
        }
    }
}
