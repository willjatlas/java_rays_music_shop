package Shop;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stockList;

    public Shop(String name){
        this.name      = name;
        this.stockList = new ArrayList<ISell>();
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getStockListCount(){ return this.stockList.size(); }

    public void addStockItem(ISell item){ this.stockList.add(item); }

}
