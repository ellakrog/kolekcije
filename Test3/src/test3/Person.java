
package test3;

public class Person {
     private String ime;
        private String prezime;
        private String mjesto;
        private String datum;
 
        Person(String ime, String prezime, String mjesto, String datum) {
                this.ime = ime;
                this.prezime = prezime;
                this.mjesto = mjesto;
                this.datum = datum;
 
        }
 
        public String getIme() {
                return ime;
        }
 
        public void setIme(String ime) {
                this.ime = ime;
        }
 
        public String getPrezime() {
                return prezime;
        }
 
        public void setPrezime(String prezime) {
                this.prezime = prezime;
        }
 
        public String getMjesto() {
                return mjesto;
        }
 
        public void setMjesto(String mjesto) {
                this.mjesto = mjesto;
        }
 
        public String getDatum() {
                return datum;
        }
 
        public void setDatum(String datum) {
                this.datum = datum;
        }
}

