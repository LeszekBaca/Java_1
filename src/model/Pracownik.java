/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * Tytul: Lista pracownikow
 * @author Leszek Baca
 * @version 1.0
 * Klasa Pracownik opisujaca Pracownika
 */
public class Pracownik 
{
    /**zmienna name typu String przechowujaca nazwisko Pracownika*/
    private String name;
    /**zmienna wyplata typu double przechowujaca wyplate Pracownika */
    private double wyplata;
  
    /**
     * Konstruktor klsy Pracownik
     * @param nam zmienna typu String przechowujaca nazwisko Pracownika
     * @param wyp zmienna typu double przechowujaca wyplate Pracownika
     */
    public Pracownik (String nam, double wyp)
    {
        name = nam;
        wyplata = wyp;
    }
    /**
     * Metoda pobierająca nazwisko Pracownika
     * @return name. Zamienna typu String
     */
    public String getName() 
    {
        return name;
    }
    /**
     * Metoda pobierająca wypłate Pracownika
     * @return wyplata. Zmienna typu double
     */
    public double getWyplata() 
    {
        return wyplata;
    }

    
    /**
    * 
    * @param wyplata zmienna typu double pobierajca wypłate
    * @param procent zmienna typu double pobierajca procent
    * @return podatek. Zmienna typu double.
    */
    public double podatek(double wyplata, double procent) 
    {
            double zmienna = procent/100;
            double podatek = wyplata*zmienna;
            return podatek;
        
    }
    /**
     * Funkcja odpowiedzialna za wypisywanie tekst na liście
     * @return zestaw tekstu
     */
    public String toString() {
              
            return "Nazwisko: "+name + " Wypłata: " + wyplata + " Podatek: "+podatek(wyplata, 18);
      
          
        
    }
}
