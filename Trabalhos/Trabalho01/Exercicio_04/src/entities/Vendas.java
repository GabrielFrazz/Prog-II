package entities;

public class Vendas {
    
    private double[][] matVendas = new double[12][4];

    public Vendas(double[][] matVendas){
        this.matVendas = matVendas;
    }
    /**
     * @return double[][] return the matVendas
     */
    public double[][] getMatVendas() {
        return matVendas;
    }

    /**
     * @param matVendas the matVendas to set
     */
    public void setMatVendas(double[][] matVendas) {
        this.matVendas = matVendas;
    }

    public double[] totalMes(){
        double[] vetMes = new double[12];
        for(int i = 0; i< vetMes.length; i++){
            double aux = 0;
            for(int j = 0; j<4; j++){
                aux += matVendas[i][j];
            }
            vetMes[i] = aux;
        }
        return vetMes;
    }
}