package Instruments.Brass;

import Instruments.IPlay;
import Instruments.Instrument;

public class Trombone extends Brass implements IPlay {

    private String scale;
    private double slideLength;

    public Trombone(String brand, String model, String colour, String finish,
                    double costPrice, double salePrice, double retailPrice, boolean hasCaseString,
                    String hornMaterial, String hwMaterial, String key, String bellType,
                    double boreSize, String scale, double slideLength) {

        super(brand, model, colour, finish, costPrice, salePrice, retailPrice, hasCaseString,
                hornMaterial, hwMaterial, key, bellType, boreSize);

        this.scale       = scale;
        this.slideLength = slideLength;

    }

    public String getScale() { return scale; }

    public void setScale(String scale) { this.scale = scale; }

    public double getSlideLength() { return slideLength; }

    public void setSlideLength(double slideLength) { this.slideLength = slideLength; }

    public String makeSound() { return "Lurpak Spreadable"; }

}
