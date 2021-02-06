package Shop;

import Instruments.Guitars.ElectricGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ElectricGuitar eGuitar;

    @Before
    public void before(){
        this.shop    = new Shop("Ray's Music Exchage");
        this.eGuitar = new ElectricGuitar("Fender", "Player Strat", "Black", "Gloss",
                345.56, 569.00, 649.00, true,
                "Alder", "Maple", "Rosewood", "Steel",
                "Stratocaster", 6, "Fender", "Player Series Alnico",
                3);
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

}
