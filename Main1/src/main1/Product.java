
package main1;

public abstract class Product {
    public String nazivProizvoda;
    public int barKod;
    public double osnovnaCijena;
    
   
    //konstruktor
    public Product(String nazivProizvoda,int barKod, double osnovnaCijena)
    {
            this.nazivProizvoda=nazivProizvoda;
            this.barKod=barKod;
            this.osnovnaCijena=osnovnaCijena;
    }

    
    @Override
    public String toString(){ 
      return nazivProizvoda+" "+barKod+" "+osnovnaCijena;  
    }
    
    public abstract void show();

    public abstract double Izracun(double osnovnaCijena);
     
    
    
}
