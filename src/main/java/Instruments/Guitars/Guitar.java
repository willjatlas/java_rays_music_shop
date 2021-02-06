package Instruments.Guitars;

import Instruments.IPlay;
import Instruments.Instrument;

public abstract class Guitar extends Instrument implements IPlay {

    private String bodyMaterial;
    private String neckMaterial;
    private String fBoardMaterial;
    private String hWareMaterial;
    private String bodyStyle;
    private int numOfStrings;


    public Guitar(String brand, String model, String colour, String finish,
                  double costPrice, double salePrice, double retailPrice, boolean hasCase,
                  String bodyMaterial, String neckMaterial, String fBoardMaterial, String hWareMaterial,
                  String bodyStyle, int numOfStrings) {

        super(brand, model, colour, finish, costPrice, salePrice, retailPrice, hasCase);

        this.bodyMaterial   =  bodyMaterial;
        this.neckMaterial   =  neckMaterial;
        this.fBoardMaterial =  fBoardMaterial;
        this.hWareMaterial  =  hWareMaterial;
        this.bodyStyle      =  bodyStyle;
        this.numOfStrings   =  numOfStrings;

    }

    public String getBodyMaterial() { return bodyMaterial; }

    public void setBodyMaterial(String bodyMaterial) { this.bodyMaterial = bodyMaterial; }

    public String getNeckMaterial() { return neckMaterial; }

    public void setNeckMaterial(String neckMaterial) { this.neckMaterial = neckMaterial; }

    public String getfBoardMaterial() { return fBoardMaterial; }

    public void setfBoardMaterial(String fBoardMaterial) { this.fBoardMaterial = fBoardMaterial; }

    public String gethWareMaterial() { return hWareMaterial; }

    public void sethWareMaterial(String hWareMaterial) { this.hWareMaterial = hWareMaterial; }

    public String getBodyStyle() { return bodyStyle; }

    public void setBodyStyle(String bodyStyle) { this.bodyStyle = bodyStyle; }

    public int getNumOfStrings() { return numOfStrings; }

    public void setNumOfStrings(int numOfStrings) { this.numOfStrings = numOfStrings; }

}
