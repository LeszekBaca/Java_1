package widok;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Manager;
import model.Pracownik;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 * Program zajmuje się spisem pracowników i menagerów firmy
 * Tytul: Lista pracownikow
 * @author Leszek Baca
 * @version 1.0
 */

public class Gui extends JFrame implements ActionListener, ChangeListener
{
    /**obiekt klasy PasekNarzedziowy*/
    PasekNarzedziowy pasekNarzedzi;
    /**obiekt klasy Pole*/
    Pole pole;
    /**obiekt klasy Manager*/
    Manager manager;
    /**obiekt klasy Pracownik*/
    Pracownik pracownik;
    /**obiekt klasy JList*/
    JList<Pracownik> lista;
    /**obiekt klasy Poczatek*/
    Poczatek poczatek;


/**
 * konstruktor tworzacy komponenty graficzne
 */

    public Gui() 
    {
        //okno
        setTitle("Lista pracowników");
        this.setMinimumSize(new Dimension(200, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        
        //obiekt Menu
        Menu menuGl = new Menu(this);
        this.setJMenuBar(menuGl);
     
        //obiekt PasekNarzedziowy
        pasekNarzedzi = new PasekNarzedziowy(this);
        add(pasekNarzedzi,BorderLayout.PAGE_END);

        
        //obiekt JList
        lista = new JList(new DefaultListModel());
        JScrollPane scrollableList = new JScrollPane(lista);
        this.add(scrollableList, BorderLayout.CENTER);
      
        //obiekt Pole
        pole = new Pole(this);
        add(pole,BorderLayout.BEFORE_FIRST_LINE);
       
        //obiekt Pracownik;
        Poczatek poczatek = new Poczatek(pracownik, this);
        poczatek.pack();
        poczatek.setMinimumSize(new Dimension(200, 150));
     
        poczatek.setVisible(true);
        
      
    }
/**
 * metoda pokazuje Gui
 */
public static void pokarzGui()
    {
        Gui window = new Gui();
        window.pack();
        window.setVisible(true);
    }
/**
 * metoda obsługująca zdarzenia
 * @param e obiekt wywołanej akcji
 */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch (e.getActionCommand())
        {
            case "Wyjście":
                this.dispose();
                break;
            case "Autor":
                JOptionPane.showMessageDialog(this, "Leszek Baca\nRok: IV\nStudia: NSI", "Autor", JOptionPane.PLAIN_MESSAGE);
                break;

            case "Dodaj":
                try
                {
                    
                    double p = Double.parseDouble(pasekNarzedzi.Wyplata.getText());
                    Pracownik pracownik = new Pracownik(pasekNarzedzi.Nazwisko.getText(),p);
                    Pracownik manager = new Pracownik("Manager"+pasekNarzedzi.Nazwisko.getText(),p);
                    if(pole.mManager.isSelected()==true)
                        ((DefaultListModel) lista.getModel()).addElement(manager);
                  
                    if(pole.mPracownik.isSelected()==true)
                        ((DefaultListModel) lista.getModel()).addElement(pracownik);
                }
                catch (NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(this, "Bład. W polu pensja mogą być "
                            + "wpisane cyfry całkowite lub zmiennoprzecinkowe","Warning", 
                            JOptionPane.WARNING_MESSAGE);
                }
                break;

            
            default:
                throw new UnsupportedOperationException("Not supported yet.");

        }

    }
     /**
     *
     * @param ce  obiekt nasluchujacy zmiany
     */
     @Override
    public void stateChanged(ChangeEvent ce)
    {
        
    }
    
}
