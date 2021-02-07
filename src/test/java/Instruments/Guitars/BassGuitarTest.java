package Instruments.Guitars;

import Instruments.Guitars.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    BassGuitar bG;

    @Before
    public void before(){
        bG = new BassGuitar("Yamaha", "RBX170", "Metallic Red", "Gloss",
                112.87, 189.00, 249.00, false,
                "Basswood", "Mahogany", "Rosewood", "Aluminium",
                "RBX", 4, "Yamaha", "Standard",
                2, "Long");
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Slappin da bass", bG.makeSound());
    }

}
