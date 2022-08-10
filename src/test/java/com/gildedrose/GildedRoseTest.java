package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TDD
//DB
class GildedRoseTest {

//    @Test
//    void foo() {
//        Item[] items = new Item[]{new Item("foo", 0, 0)};
//        GildedRose app = new GildedRose(items);
//        app.updateQuality();
//        assertEquals("fixme", app.items[0].name);
//    }


    // All items sellin date decreased by one every day and sell in >= 1
    @Test
    void sellIn_Decremenet_AgedBrie() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void sellIn_Decremenet_BackStage() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void sellIn_Decremenet_Sulfuras() {
        Item[] items = new Item[]{new Item("Sulfuras", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void sellIn_Decremenet_Conjured() {
        Item[] items = new Item[]{new Item("Conjured", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

// ------------------------------------------------------------------------------------------------------------------------------------
/*  NOT mentioned in scenario and code reduces sellin to negative
    // All items sellin date decreased by one every day and sell in <= 0
    @Test
    void sellIn_Decremenet_AgedBrie_non_negative() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void sellIn_Decremenet_BackStage_non_negative() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void sellIn_Decremenet_Sulfuras_non_negative() {
        Item[] items = new Item[]{new Item("Sulfuras", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void sellIn_Decremenet_Conjured_non_negative() {
        Item[] items = new Item[]{new Item("Conjured", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

*/


    // Aged Brie quality increases by 1 as it gets older and quality < 50
    @Test
    void AgedBrie_Quality_is_higher_as_it_gets_older_Quality_lessthan_50() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
    }

    // Aged Brie quality increases by 1 as it gets older and quality >=50
    @Test
    void AgedBrie_Quality_is_higher_as_it_gets_older_Quality_50() {
        Item[] items = new Item[]{new Item("Aged Brie", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    // BackStage passes quality increases by 1 as it gets older and sellin > 10 and quality < 50
    @Test
    void BackStagePasses_Quality_is_higher_as_it_gets_older_and_sellin_higher_than_10_Quality_lessthan_50() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 11, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
    }

    // BackStage passes quality increases by 1 as it gets older and sellin > 10 and quality >= 50
    @Test
    void BackStagePasses_Quality_is_higher_as_it_gets_older_and_sellin_higher_than_10_higher_or_equal_50() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 11, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }


    // BackStage passes quality increases by 2 as it gets older and sellin <= 10 and sellin >0 and quality < 49
    @Test
    void BackStagePasses_Quality_is_higher_as_it_gets_older_and_sellin_less_than_11_and_not_0_quality_lessthan_49() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    // BackStage passes quality increases by 2 as it gets older and sellin <= 10 and sellin >0 and quality >= 49
    @Test
    void BackStagePasses_Quality_is_higher_as_it_gets_older_and_sellin_less_than_11_and_not_0_quality_higherthan_48() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }


    // BackStage passes quality increases by 3 as it gets older and sellin <= 5 and sellin >0 and quality < 48
    @Test
    void BackStagePasses_Quality_is_higher_as_it_gets_older_and_sellin_less_than_6_and_not_0_quality_lessthan_48() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 3, 47)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    // BackStage passes quality increases by 3 as it gets older and sellin <= 5 and sellin >0 and quality > 47
    @Test
    void BackStagePasses_Quality_is_higher_as_it_gets_older_and_sellin_less_than_6_and_not_0_quality_higherthan_47() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 3, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    // BackStage passes quality increases by 3 as it gets older and sellin ==0 then quality = 0
    @Test
    void BackStagePasses_Quality_is_higher_as_it_gets_older_and_sellin__equals_0() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    // Sulfuras quality doesn't change quality value.
    @Test
    void Sulfuras_Quality_never_change() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 3, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    // Conjured quality decreases by 2 when sellin > 0 and quality >= 2
    @Test
    void Conjured_Quality_higher_than_1() {
        Item[] items = new Item[]{new Item("Conjured", 10, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    // Conjured quality decreases by 2 when sellin > 0 and quality < 2
    @Test
    void Conjured_Quality_less_than_2() {
        Item[] items = new Item[]{new Item("Conjured", 10, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    // Conjured quality decreases by 2 when sellin <= 0 and quality >= 2
    @Test
    void Conjured_Quality_sellin_0_quality_higher_than_1() {
        Item[] items = new Item[]{new Item("Conjured", 0, 2)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    // Conjured quality decreases by 2 when sellin <= 0 and quality < 2
    @Test
    void Conjured_Quality_sellin_0_Quality_less_than_2() {
        Item[] items = new Item[]{new Item("Conjured", 0, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }


}
