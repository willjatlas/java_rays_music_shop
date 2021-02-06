package Instruments.Guitars;

import Instruments.IPlay;

public class AcousticGuitar extends Guitar implements IPlay {

    private String pickupSystem;
    private double soundholeDiam;
    private boolean isElectro;

    public AcousticGuitar(String brand, String model, String colour, String finish,
                          double costPrice, double salePrice, double retailPrice, boolean hasCase,
                          String bodyMaterial, String neckMaterial, String fBoardMaterial, String hWareMaterial,
                          String bodyStyle, int numOfStrings, String pickupSystem, double soundholeDiam,
                          boolean isElectro) {

        super(brand, model, colour, finish, costPrice, salePrice, retailPrice, hasCase, bodyMaterial,
                neckMaterial, fBoardMaterial, hWareMaterial, bodyStyle, numOfStrings);

        this.pickupSystem  = pickupSystem;
        this.soundholeDiam = soundholeDiam;
        this.isElectro     = isElectro;

    }

    public String getPickupSystem() { return pickupSystem; }

    public void setPickupSystem(String pickupSystem) { this.pickupSystem = pickupSystem; }

    public double getSoundholeDiam() { return soundholeDiam; }

    public void setSoundholeDiam(double soundholeDiam) { this.soundholeDiam = soundholeDiam; }

    public boolean isElectro() { return isElectro; }

    public void setElectro(boolean electro) { isElectro = electro; }

    public String makeSound(){ return "Some delicious acoustic"; }

}
