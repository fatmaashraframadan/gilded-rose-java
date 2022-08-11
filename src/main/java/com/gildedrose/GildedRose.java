package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                AgedBrie agedBrie = new AgedBrie();

                items[i].quality = agedBrie.update_quality(items[i]);
                items[i].sellIn = agedBrie.update_sellin(items[i]);

            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                BackStage backStage = new BackStage();

                items[i].quality = backStage.update_quality(items[i]);
                items[i].sellIn = backStage.update_sellin(items[i]);


            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                Sulfuras sulfuras = new Sulfuras();

                items[i].quality = sulfuras.update_quality(items[i]);
                items[i].sellIn = sulfuras.update_sellin(items[i]);

            } else if (items[i].name.equals("Conjured")) {
                Conjured conjured = new Conjured();

                items[i].quality = conjured.update_quality(items[i]);
                items[i].sellIn = conjured.update_sellin(items[i]);

            } else {
                items[i].sellIn--;
                items[i].quality = Math.max(0, items[i].quality - 1);
            }
        }
    }


//
//    public static void AgedBrie_Quality_update(Item item) {
//        item.quality = Math.min(50, item.quality + 1);
//    }
//
//    public static void AgedBrie_sellin_update(Item item) {
//        item.sellIn--;
//    }
//
//    public static void Backstage_Quality_update(Item item) {
//        if (item.sellIn <= 0) item.quality = 0;
//        else if (item.sellIn <= 5) item.quality = Math.min(50, item.quality + 3);
//        else if (item.sellIn <= 10) item.quality = Math.min(50, item.quality + 2);
//        else item.quality = Math.min(50, item.quality + 1);
//    }
//
//    public static void Backstage_sellin_update(Item item) {
//        item.sellIn--;
//    }
//
//    public static void Conjured_Quality_update(Item item) {
//        item.quality = Math.max(0, item.quality - 2);
//    }
//
//    public static void Conjured__sellin_update(Item item) {
//        item.sellIn--;
//    }
//
//    public static void Sulfuras_Quality_update(Item item) {
//        item.quality = item.quality;
//    }
//
//    public static void Sulfuras_sellin_update(Item item) {
//        item.sellIn--;
//    }

}