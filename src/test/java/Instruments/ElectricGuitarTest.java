package Instruments;

import Instruments.Guitars.ElectricGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar eG;

    @Before
    public void before(){
        eG = new ElectricGuitar("Fender", "Player Strat", "Black", "Gloss",
                345.56, 569.00, 649.00, true,
                "Alder", "Maple", "Rosewood", "Steel",
                "Stratocaster", 6, "Fender", "Player Series Alnico",
                3);
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Tasty electric guitar licks", eG.makeSound());
    }

}
