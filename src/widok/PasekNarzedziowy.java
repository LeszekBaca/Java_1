/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package widok;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 * Wyświetlenie paska narzedziowego
 * Teamat: Lista pracowników
 * @author Leszek Baca
 * @version 1.0
 */
public class PasekNarzedziowy extends JToolBar
{
    /**obiekty klasy JTextField*/
    JTextField Nazwisko,Wyplata;
    /**obiekt klasy JLable*/
    JLabel nazwisko;
    /**obiekt klasy JLabel*/
    JLabel wyplata;
    
     /**
      * Konstruktor klasy PasekNarzędziowy
      * @param it obiekt wywołanej akcji
      */
    public PasekNarzedziowy(ActionListener it)
    {
        super(JToolBar.HORIZONTAL);
        this.setFloatable(false);

        //przycisk dodajacy wpis
        JButton przycisk = new JButton("Dodaj");
        przycisk.addActionListener(it);
        przycisk.setActionCommand("Dodaj");

        //wyświetlanie tekstu  pól JTextField-a
        nazwisko = new JLabel("Nazwisko");
        wyplata = new JLabel("Pensja");
        
        //pole do wpisania (JTextField)
        Nazwisko = new JTextField(10);
        Wyplata = new JTextField(10);
        
        //dodanie elemntów do paska
        this.add(przycisk);
        this.add(nazwisko);
        this.add(Nazwisko);
        this.add(wyplata);
        this.add(Wyplata);
        
    }

}
