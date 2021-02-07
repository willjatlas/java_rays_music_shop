package Shop;

import Instruments.Brass.Trumpet;
import Instruments.Guitars.ElectricGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ElectricGuitar eGuitar;
    Trumpet trumpet;

    @Before
    public void before(){
        this.shop    = new Shop("Ray's Music Exchage");
        this.eGuitar = new ElectricGuitar("Fender", "Player Strat", "Black", "Gloss",
                300.00, 600.00, 649.00, true,
                "Alder", "Maple", "Rosewood", "Steel",
                "Stratocaster", 6, "Fender", "Player Series Alnico",
                3);
        this.trumpet = new Trumpet("Yamaha", "YTR2330", "Gold", "Metal",
                250, 450.00, 549.00, true,
                "Instruments/Brass", "Steel", "Bb", "One Piece", 11.65);
    }

    @Test
    public void canAddItemToStock(){
        shop.addStockItem(eGuitar);
        assertEquals(1, shop.getStockListCount());
    }

    @Test
    public void canRemoveStockItem(){
        shop.addStockItem(eGuitar);
        shop.removeStockItem(eGuitar);
        assertEquals(0, shop.getStockListCount());
    }

    @Test
    public void canGetStockProfitValue(){
        shop.addStockItem(eGuitar);
        shop.addStockItem(trumpet);
        assertEquals(500.00, shop.getTotalProfitValue(), 0.01);
    }

}
