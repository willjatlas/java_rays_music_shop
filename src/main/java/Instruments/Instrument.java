package Instruments;

import Shop.ISell;

public abstract class Instrument implements ISell {

    private String brand;
    private String model;
    private String colour;
    private String finish;
    private double costPrice;
    private double salePrice;
    private double retailPrice;
    private boolean hasCase;

    public Instrument(String brand, String model, String colour, String finish,
                      double costPrice, double salePrice, double retailPrice, boolean hasCase){

        this.brand       =  brand;
        this.model       =  model;
        this.colour      =  colour;
        this.finish      =  finish;
        this.costPrice   =  costPrice;
        this.salePrice   =  salePrice;
        this.retailPrice =  retailPrice;
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

    public boolean isHasCase() { return hasCase; }

    public void setHasCase(boolean hasCase) { this.hasCase = hasCase; }

    // Returns the profit value as a percentage (ie. return of 20.00 is 20%)
    public double calculateMarkup(){
        double markup = ((this.salePrice - this.costPrice) / costPrice) * 100;
        return Math.round(markup * 100.0)/ 100.0;
    }

    // Returns the profit difference between sale and cost price.
    public double getProfitValue(){
        return this.getSalePrice() - this.getCostPrice();
    }

}
