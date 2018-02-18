/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package widok;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Wyświetlenie głownego okna
 * Temat: Lista pracowników
 * @author Leszek Baca
 * @version 1.0
 */
public class Menu extends JMenuBar
{

 /**
  * konstruktor klasy Menu
  *
  * @param It obiekt wywolanej akcji
  */
    
    public Menu(ActionListener lt)
    {
        //menu Wyjście
        JMenuItem wyjscie = new JMenuItem("Wyjście");
        wyjscie.addActionListener(lt);
        wyjscie.setActionCommand("Wyjście");
        

        //menu Autor
        JMenuItem autor = new JMenuItem("Autor");
        autor.addActionListener(lt);
        autor.setActionCommand("Autor");

        //menu Menu
        JMenu menu = new JMenu("Menu");
        menu.add(wyjscie);
        add(menu);
        
        //menu Informacje
        JMenu informacje = new JMenu("Informacje");
        informacje.add(autor);
        add(informacje);

    }
    
}
