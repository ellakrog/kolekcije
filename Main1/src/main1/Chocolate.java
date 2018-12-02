
package main1;


public class Chocolate extends Product{

    private final double POREZ=0.2;
   double tezina;

    

    Chocolate(String nazivProizvoda, int barKod, double osnovnaCijena, double tezina) {
        super(nazivProizvoda, barKod, osnovnaCijena);
        this.tezina=tezina;
    }
    @Override
    public String toString(){ 
      return nazivProizvoda+" "+barKod+" "+osnovnaCijena;  
    }

    @Override
    public void show() {
        System.out.println("Proizvod:" + nazivProizvoda + "bar-kod: " + barKod + "Osnovna Cijena:" + osnovnaCijena+ "Tezina"+ tezina);
    }

    @Override
   
    public double Izracun(double osnovnaCijena) {
        double konacnaCijena;
        konacnaCijena=osnovnaCijena+(POREZ*osnovnaCijena);
        return konacnaCijena;
    }

    
  
    
  
   

   
    
}
