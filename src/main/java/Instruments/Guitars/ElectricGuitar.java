package Instruments.Guitars;

import Instruments.IPlay;

public class ElectricGuitar extends Guitar implements IPlay {

    private String pickUpMake;
    private String pickUpModel;
    private int numOfPickups;

    public ElectricGuitar(String brand, String model, String colour, String finish,
                          double costPrice, double salePrice, double retailPrice, boolean hasCase,
                          String bodyMaterial, String neckMaterial, String fBoardMaterial, String hWareMaterial,
                          String bodyStyle, int numOfStrings, String pickUpMake, String pickUpModel,
                          int numOfPickups) {

        super(brand, model, colour, finish, costPrice, salePrice, retailPrice, hasCase, bodyMaterial,
                neckMaterial, fBoardMaterial, hWareMaterial, bodyStyle, numOfStrings);

        this.pickUpMake   = pickUpMake;
        this.pickUpModel  = pickUpModel;
        this.numOfPickups = numOfPickups;

    }

    public String getPickUpMake() { return pickUpMake; }

    public void setPickUpMake(String pickUpMake) { this.pickUpMake = pickUpMake; }

    public String getPickUpModel() { return pickUpModel; }

    public void setPickUpModel(String pickUpModel) { this.pickUpModel = pickUpModel; }

    public int getNumOfPickups() { return numOfPickups; }

    public void setNumOfPickups(int numOfPickups) { this.numOfPickups = numOfPickups; }

    public String makeSound(){ return "Tasty electric guitar licks"; }

}
