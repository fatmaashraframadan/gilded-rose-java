package com.gildedrose;

abstract public class Quality {
    int update_sellin(Item item) {
        return item.sellIn-1;
    }

    abstract int update_quality(Item item);
}

class AgedBrie extends Quality {
    int update_quality(Item item) {
        return Math.min(50, item.quality + 1);
    }
}

class BackStage extends Quality {
    int update_quality(Item item) {
        int newItemQuality = item.quality;
        if (item.sellIn <= 0) newItemQuality = 0;
        else if (item.sellIn <= 5) newItemQuality = Math.min(50, newItemQuality + 3);
        else if (item.sellIn <= 10) newItemQuality = Math.min(50, newItemQuality + 2);
        else newItemQuality = Math.min(50, newItemQuality + 1);

        return newItemQuality;
    }
}

class Sulfuras extends Quality {
    int update_quality(Item item) {
        return item.quality;
    }
}

class Conjured extends Quality {
    int update_quality(Item item) {
        return Math.max(0, item.quality - 2);

    }
}