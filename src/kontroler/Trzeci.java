/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

/**
 * Program zajmuje się spisem pracowników i menagerów firmy
 * Temat: Lista pracowników
 * @version 1.0
 * @author Leszek Baca
 */
public class Trzeci 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                widok.Gui.pokarzGui();
            }
        });

    }
}
