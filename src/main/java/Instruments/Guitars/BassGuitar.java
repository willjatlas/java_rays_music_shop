package Instruments.Guitars;

import Instruments.IPlay;

public class BassGuitar extends ElectricGuitar implements IPlay {

    private String scale;

    public BassGuitar(String brand, String model, String colour, String finish,
                      double costPrice, double salePrice, double retailPrice, boolean hasCase,
                      String bodyMaterial, String neckMaterial, String fBoardMaterial, String hWareMaterial,
                      String bodyStyle, int numOfStrings, String pickUpMake, String pickUpModel,
                      int numOfPickups, String scale) {

        super(brand, model, colour, finish, costPrice, salePrice, retailPrice, hasCase, bodyMaterial,
                neckMaterial, fBoardMaterial, hWareMaterial, bodyStyle, numOfStrings, pickUpMake, pickUpModel,
                numOfPickups);

        this.scale = scale;

    }

    public String getScale() { return scale; }

    public void setScale(String scale) { this.scale = scale; }

    public String makeSound(){ return "Slappin da bass"; };

}
