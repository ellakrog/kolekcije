
package main1;


public class Wine extends Product{
    public final double POREZ1=0.1;
    double volumen;
    
    
    public Wine(String nazivProizvoda, int barKod, double osnovnaCijena,double volumen) {
        super(nazivProizvoda, barKod, osnovnaCijena);
        this.volumen=volumen;
    }
    @Override
    public String toString(){ 
      return nazivProizvoda+" "+barKod+" "+osnovnaCijena;  
    }
    
    @Override
    public void show() {
        System.out.println("Proizvod:" + nazivProizvoda + "bar-kod: " + barKod + "Osnovna Cijena:" + osnovnaCijena+"volumen:" +volumen);
    }

    @Override
    public double Izracun(double osnovnaCijena) {
        double konacnaCijena;
        konacnaCijena=osnovnaCijena/0.72;
        return konacnaCijena;
    }
    
}
