
package kolekcije;


public class Person {
    public String Ime;
    public String Prezime;
    public String Mjesto;
    public String Datum;
    
    public Person(String Ime, String Prezime,String Datum,String Mjesto){
        this.Ime=Ime;
        this.Prezime=Prezime;
        this.Datum=Datum;
        this.Mjesto=Mjesto;
    }
    
    public String getIme(){
        return Ime;
        
    }
    public void setIme(String Ime){
        this.Ime=Ime;
    }
    public String getPrezime(){
        return Prezime;
        
    }
    public void setPrezime(String Prezime){
        this.Prezime=Prezime;
    }
    public String getMjesto(){
        return Mjesto;
        
    }
    public void setMjesto(String Mjesto){
        this.Mjesto=Mjesto;
    }
    
    public String getDatum(){
        return Datum;
        
    }
    public void setDatum(String Datum){
        this.Datum=Datum;
    }
    
}
