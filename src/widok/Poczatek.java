/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package widok;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Pracownik;
import model.Manager;

/**
 * Wyświetlenie pierwszego okna
 * Teamt: Lista pracowników
 * @version 1.0
 * @author Leszek Baca
 */

public class Poczatek extends JDialog implements ActionListener
{
    /**obiekt klasy Manager*/
    Manager manager;
    /**obiekt klasy Pracownik*/
    Pracownik pracownik;
    /**obiekty klasy JTextField*/
    JTextField tekstNazwisko,tekstPensja;
    /**obiekt klasy Gui*/
    Gui gui;
    
    /**
     * Konstruktor klasy Poczatek
     * @param prac przekazukacy Pracownika
     * @param okno przekazujacy Gui
     */
   Poczatek(Pracownik prac, Gui okno)
   {
        
        super(okno, "Stan poczatkowy", true);
        gui = okno;
        
        //Jlabel opisujący JTextField-a
        JLabel nazwa = new JLabel("Podaj dane poczatkowe:");
        //JLabel opsiujacy JTextField-a
        JLabel nazwisko = new JLabel("Podaj nazwisko:");

        //pole na podanie nazwiska
        tekstNazwisko = new JTextField(10);
        //Jlabel opisujacy JTextField-a
        JLabel pensja = new JLabel("Podaj pensje:");
        //pole na podanie pensji 
        tekstPensja = new JTextField(10);
        
        //dodawanie elementów do panelu
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(nazwa);
        panel.add(nazwisko);
        panel.add(tekstNazwisko);
        panel.add(pensja);
        panel.add(tekstPensja);
        
        //przycisk ok
        JButton button = new JButton("Ok");
        button.setActionCommand("ok");
        button.addActionListener(this);

        this.add(panel, BorderLayout.PAGE_START);
        this.add(button, BorderLayout.CENTER);

       
    }
   /**
    * 
    * @param e obekt wywołanej akcji
    */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        switch (e.getActionCommand())
        {
            case "ok":
                try
                {
                    double p = Double.parseDouble(tekstPensja.getText());
                    if(!(tekstNazwisko.getText().isEmpty()))
                    {
                        Pracownik pracownik = new Pracownik(tekstNazwisko.getText(),p);
                        ((DefaultListModel) gui.lista.getModel()).addElement(pracownik);
                        dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Pole: Podaj nazwisko jest puste", "Warning", JOptionPane.WARNING_MESSAGE);    
                
                 
                }
                catch (NumberFormatException ep)
                {
                    JOptionPane.showMessageDialog(this, "W polu Podaj pensje muszą być wpisane "
                            + "liczby\n całkowite lub zmiennoprzecinkowe\n", "Warning", JOptionPane.WARNING_MESSAGE);
                }
               
                break;
        }
    }
    
}
