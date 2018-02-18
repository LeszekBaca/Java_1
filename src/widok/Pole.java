/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package widok;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

/**
 * Klasa odpowiedzialna za wyświetlanie pola na dole okna głównego
 * Teamat: Lista pracowników
 * @author Leszek Baca
 * @version 1.0
 */
public class Pole extends JToolBar
{
    
    /**obiekt klasy ButtonGroup*/
    ButtonGroup mGrupaButon;
    /**obiekty klasy JRadioButton*/
    JRadioButton mPracownik,mManager;
    
    public Pole(ActionListener it)
    {
    
        mGrupaButon = new ButtonGroup();
    
        //dodanie przycisku Pracownik
        mPracownik = new JRadioButton("Pracownik", true);
        mGrupaButon.add(mPracownik);
        this.add(mPracownik);
        
       
        //dodanie przycisku Manager
        mManager = new JRadioButton("Manager", false);
        mGrupaButon.add(mManager);
        this.add(mManager);
        
    
    } 
}
