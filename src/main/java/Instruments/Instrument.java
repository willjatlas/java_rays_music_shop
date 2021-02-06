package Instruments;

public abstract class Instrument {

    private String brand;
    private String model;
    private String colour;
    private String finish;
    private double costPrice;
    private double salePrice;
    private double retailPrice;
    private double margin;
    private boolean hasCase;

    public Instrument(String brand, String model, String colour, String finish,
                      double costPrice, double salePrice, double retailPrice, double margin,
                      boolean hasCase){

        this.brand       =  brand;
        this.model       =  model;
        this.colour      =  colour;
        this.finish      =  finish;
        this.costPrice   =  costPrice;
        this.salePrice   =  salePrice;
        this.retailPrice =  retailPrice;
        this.margin      =  margin;
        this.hasCase     =  hasCase;

    }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public String getFinish() { return finish; }

    public void setFinish(String finish) { this.finish = finish; }

    public double getCostPrice() { return costPrice; }

    public void setCostPrice(double costPrice) { this.costPrice = costPrice; }

    public double getSalePrice() { return salePrice; }

    public void setSalePrice(double salePrice) { this.salePrice = salePrice; }

    public double getRetailPrice() { return retailPrice; }

    public void setRetailPrice(double retailPrice) { this.retailPrice = retailPrice; }

    public double getMargin() { return margin; }

    public void setMargin(double margin) { this.margin = margin; }

    public boolean isHasCase() { return hasCase; }

    public void setHasCase(boolean hasCase) { this.hasCase = hasCase; }
}
