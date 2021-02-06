package Instruments.Brass;

import Instruments.Instrument;

public abstract class Brass extends Instrument {

    private String hornMaterial;
    private String hwMaterial;
    private String key;
    private String bellType;
    private double boreSize;

    public Brass(String brand, String model, String colour, String finish,
                 double costPrice, double salePrice, double retailPrice, boolean hasCaseString,
                 String hornMaterial, String hwMaterial, String key, String bellType,
                 double boreSize){

        super(brand, model, colour, finish, costPrice, salePrice, retailPrice, hasCaseString);

        this.hornMaterial = hornMaterial;
        this.hwMaterial   = hwMaterial;
        this.key          = key;
        this.bellType     = bellType;
        this.boreSize     = boreSize;

    }

    public String getHornMaterial() { return hornMaterial; }

    public void setHornMaterial(String hornMaterial) { this.hornMaterial = hornMaterial; }

    public String getHwMaterial() { return hwMaterial; }

    public void setHwMaterial(String hwMaterial) { this.hwMaterial = hwMaterial; }

    public String getKey() { return key; }

    public void setKey(String key) { this.key = key; }

    public String getBellType() { return bellType; }

    public void setBellType(String bellType) { this.bellType = bellType; }

    public double getBoreSize() { return boreSize; }

    public void setBoreSize(double boreSize) { this.boreSize = boreSize; }

}
