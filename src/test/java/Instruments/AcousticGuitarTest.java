package Instruments;

import Instruments.Guitars.AcousticGuitar;
import Instruments.Guitars.ElectricGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar aG;

    @Before
    public void before(){
        aG = new AcousticGuitar("Fender", "CD60", "Natural", "Gloss",
                64.33, 119.00, 149.00, false,
                "Laminate", "Laminate", "Laminate", "Aluminium",
                "Dreadnought", 6, "None", 76.5,
                false);
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Some delicious acoustic", aG.makeSound());
    }

}
