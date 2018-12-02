/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcije;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author MULTINORM-USR-78
 */
public class Kolekcije {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
     SimpleDateFormat formatter= new SimpleDateFormat("dd '.' MMM yyyy", Locale.ENGLISH);
    SimpleDateFormat parser = new SimpleDateFormat("ddMMyyyy");    
        
     List<Person> retVal = new ArrayList<Person>();
 
                String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
 
                String[] raz = text.split(" ");
                for (int i = 0; i < raz.length; i++) {
                        String[] podaci = raz[i].split("/");
                        String[] imePrezime = podaci[0].split("\\.");
                       
                       
                        Person novaOsoba = new Person( imePrezime[0],  imePrezime[1],
                                        podaci[2], podaci[1]);
                        retVal.add(novaOsoba);
                        
                }
            
               
                   
                   
                for (int i = 0; i < retVal.size(); i++) {
                        String izlaz = "Person " + i + ": "
                                        + retVal.get(i).getIme() + " "
                                        + retVal.get(i).getPrezime() + ", "
                                        + formatter.format(parser.parse(retVal.get(i).getDatum())) + ", "
                                        + retVal.get(i).getMjesto() + ";";
                        
                        System.out.println(izlaz);
                }
       
  }
   
}