package com.gildedrose.model;

public class Item {

    private String name;

    private Integer sellIn;

    private Integer quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Item{" +
               "name='" + name + '\'' +
               ", sellIn=" + sellIn +
               ", quality=" + quality +
               '}';
    }
}
