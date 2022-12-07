package entities;

public class Invoice {

    private int numIntem;
    private String abtItem;
    private int qtdItem;
    private double priceItem;

    public Invoice(int numIntem, String abtItem, int qtdItem, double priceItem){
        this.numIntem = numIntem;
        this.abtItem = abtItem;
        this.qtdItem = qtdItem;
        this.priceItem = priceItem;

        if(qtdItem < 0){
            this.qtdItem = 0;
        }

        if(priceItem < 0){
            this.priceItem = 0.0;
        }
    }

    public int getNumIntem() {
        return numIntem;
    }

    public void setNumIntem(int numIntem) {
        this.numIntem = numIntem;
    }

    public String getAbtItem() {
        return abtItem;
    }

    public void setAbtItem(String abtItem) {
        this.abtItem = abtItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public double getInvoiceAmount(){
        return qtdItem * priceItem;
    }
}