/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import java.util.Random;

/**
 *
 * 
 * Noppa. Arpoo satunnaisen luvun väliltä 1-6.
 * 
 * @author hilla
 */
public class Noppa {

    /**
     * Arpoo lukuja.
     */
    private final Random arpoja;
    
    /**
     * Onko noppa klikattava, toisin sanoen onko tällä hetkellä sellainen vaihe
     * vuoroa, että pelaajan odotetaan heittävän noppaa.
     */
    private boolean onKlikattava;
    
    public Noppa(){
        this.arpoja = new Random();
        this.onKlikattava = true;
    }
    
    /**
     * Arpoo luvun väliltä 1-6.
     * 
     * @return palauttaa arvotun luvun int-tyyppisenä muuttujana
     */
    
    public int heitaNoppaa(){
        
        int arvottuLuku = arpoja.nextInt(6);
        arvottuLuku = arvottuLuku+1;
        
        return arvottuLuku;
    }
    
    public boolean onkoKlikattava(){
        return this.onKlikattava;
    }
    
    public void onkoKlikattava(boolean bool){
        this.onKlikattava = bool;
    }
}
