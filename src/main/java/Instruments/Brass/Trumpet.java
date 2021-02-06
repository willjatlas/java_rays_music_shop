package Instruments.Brass;

import Instruments.IPlay;

public class Trumpet extends Brass implements IPlay {

    private String trumpetType;
    private String valveType;

    public Trumpet(String brand, String model, String colour, String finish,
                   double costPrice, double salePrice, double retailPrice, boolean hasCaseString,
                   String hornMaterial, String hwMaterial, String key, String bellType,
                   double boreSize) {

        super(brand, model, colour, finish, costPrice, salePrice, retailPrice, hasCaseString,
                hornMaterial, hwMaterial, key, bellType, boreSize);

    }

    public String makeSound() { return "A root toot toot"; }

}
