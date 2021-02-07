package Instruments.Brass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Yamaha", "YTR2330", "Gold", "Metal",
                247.89, 449.00, 599.00, true,
                "Instruments/Brass", "Steel", "Bb", "One Piece", 11.65);
    }

    @Test
    public void canPlayTrumpt(){
        assertEquals("A root toot toot", trumpet.makeSound());
    }

}
