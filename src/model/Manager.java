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
 * Klasa Manager opisująca Managera 
 */
public class Manager extends Pracownik 
{
   /** zmienna bonus typu double przechowujaca premie Managera */
   private double bonus;
   /**
    * Konstruktor klasy Manaager
    * @param name zmienna typu String przechowujaca nazwisko Managera
    * @param wyp zmienna typu double przechowujaca  wyplate Managera
    */
   public Manager(String name, double wyp)
   {
        super(name,wyp);
        bonus = 0;
   
   }
  /**
   * metoda pobierajaca bonus
   * @return bonus. Zmienna typu double
   */
   public double getBonus()
   {
        return bonus;
   }

   
}
