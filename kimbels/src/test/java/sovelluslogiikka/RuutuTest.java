/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static sovelluslogiikka.VARI.*;

/**
 *
 * @author hilla
 */
public class RuutuTest {

    private Ruutu ruutu;
    private Pelaaja pelaaja;

    public RuutuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.ruutu = new Ruutu(2, null);
        this.pelaaja = new Pelaaja(KELTAINEN);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void ruudunSijaintiOikein() {
        assertTrue(this.ruutu.getSijainti() == 2);
    }

    @Test
    public void nappulanAsettaminenRuutuunOnnistuu() {
        Nappula nappula = new Nappula(this.pelaaja);
        this.ruutu.asetaNappulaRuutuun(nappula);

        assertTrue(this.ruutu.getNappula().equals(nappula));
    }

    @Test
    public void nappulanAsettaminenRuutuunOnnistuuReturnsTrue() {
        Nappula nappula = new Nappula(this.pelaaja);
        this.ruutu.asetaNappulaRuutuun(nappula);
        assertTrue(this.ruutu.getNappula().equals(nappula));
    }



    @Test
    public void kunNappulaSiirretaanRuutuunNappulanSijaintiPaivittyy() {
        Nappula nappula = new Nappula(this.pelaaja);
        this.ruutu.asetaNappulaRuutuun(nappula);
        assertTrue(nappula.getSijainti() == this.ruutu.getSijainti());
    }

    @Test
    public void poistaNappulaRuudusta() {
        Nappula nappula = new Nappula(this.pelaaja);
        this.ruutu.asetaNappulaRuutuun(nappula);
        this.ruutu.poistaNappulaRuudusta();
        assertTrue(this.ruutu.getNappula() == null);
    }

    @Test
    public void asetaValittavaksiTrue() {
        this.ruutu.setOnkoValittava(true);
        assertTrue(this.ruutu.onkoValittava());
    }

    @Test
    public void valittavuusAlussaFalse() {
        assertTrue(this.ruutu.onkoValittava() == false);
    }

    @Test
    public void asetaValittavaksiFalse() {
        this.ruutu.setOnkoValittava(true);
        this.ruutu.setOnkoValittava(false);
        assertTrue(this.ruutu.onkoValittava() == false);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
