package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

//    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else // item[i].name is aged brie or backstage
//            {
//
//                /*
//                 * items[i].quality >= 50 Nothing   //TODO DONE
//                 * items[i].quality < 50 && backstage {
//                 *   sellin < 11 -> {
//                 *          quality < 50 quality increase
//                 *           else the same
//                 * }
//                 *
//                 *  sellin < 6{
//                 *       quality < 50 quality increase
//                 *           else the same
//                 *   }
//                 * }
//                 * item[i].quality < 50 && ! backstage  --> quality increases by 1
//                 * */
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            // TODO
//            /*
//             *
//             * when item[i].name is Sulfuras, Hand of Ragnaros -> shouldn't decrease
//             *
//             * when item[i].name is not Sulfuras, Hand of Ragnaros -> should decrease
//             *
//             * */
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
//    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                AgedBrie_Quality_update(items[i]);
                AgedBrie_sellin_update(items[i]);

            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                Backstage_Quality_update(items[i]);
                Backstage_sellin_update(items[i]);

            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                Sulfuras_Quality_update(items[i]);
                Sulfuras_sellin_update(items[i]);

            } else if (items[i].name.equals("Conjured")) {
                Conjured_Quality_update(items[i]);
                Conjured__sellin_update(items[i]);
            } else {
                items[i].sellIn--;
                items[i].quality = Math.max(0, items[i].quality - 1);
            }
        }
    }


//    public static void main(String[] args) {
//        Item[] items = new Item[]{new Item("Aged Brie", 3, 5)};
//        AgedBrie_Quality_update(items[0]);
//        AgedBrie_sellin_update(items[0]);
//        System.out.println(items[0].quality + "   " + items[0].sellIn);
//    }

    public static void AgedBrie_Quality_update(Item item) {
        item.quality = Math.min(50, item.quality + 1);
    }

    public static void AgedBrie_sellin_update(Item item) {
        item.sellIn--;
    }

    public static void Backstage_Quality_update(Item item) {
        if (item.sellIn <= 0) item.quality = 0;
        else if (item.sellIn <= 5) item.quality = Math.min(50, item.quality + 3);
        else if (item.sellIn <= 10) item.quality = Math.min(50, item.quality + 2);
        else item.quality = Math.min(50, item.quality + 1);
    }

    public static void Backstage_sellin_update(Item item) {
        item.sellIn--;
    }

    public static void Conjured_Quality_update(Item item) {
        item.quality = Math.max(0, item.quality - 2);
    }

    public static void Conjured__sellin_update(Item item) {
        item.sellIn--;
    }

    public static void Sulfuras_Quality_update(Item item) {
        item.quality = item.quality;
    }

    public static void Sulfuras_sellin_update(Item item) {
        item.sellIn--;
    }
}