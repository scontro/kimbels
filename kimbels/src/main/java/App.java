

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import kayttoliittyma.Kayttoliittyma;
import kayttoliittyma.Peliaction;
import kayttoliittyma.PyoreaNappi;
import sovelluslogiikka.*;

/**
 * Pääohjelma. Käynnistää Peliactionin.
 *
 */
public class App {

    public static void main(String[] args) {
        
        Peliaction action = new Peliaction();
        SwingUtilities.invokeLater(action);

    }
}
