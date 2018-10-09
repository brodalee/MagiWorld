/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonnagesTest;

import Personnage.Rodeur;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex
 */
public class RodeurTest {
    
    @Test
    public void RodeurDescTest() throws Exception{
        Rodeur rodeur = new Rodeur(100, 0, 100, 0);
        assertEquals(rodeur.getSentence(), "Oyé oyé chevalier joueur");
    }
    
    @Test
    public void RodeurBasicAttakTest() throws Exception{
        Rodeur rodeur = new Rodeur(100, 0, 100, 0);
        Rodeur adversaire = new Rodeur(100, 0, 100, 0);
        adversaire.looseHp(rodeur.basicAttak());
        assertEquals(rodeur.basicAttak(), 100);
    }
    
    @Test
    public void RodeurSpecialAttakTest() throws Exception{
        Rodeur rodeur = new Rodeur(100, 0, 100, 0);
        Rodeur adversaire = new Rodeur(100, 0, 100, 0);
        rodeur.specialAttack(adversaire, 1, 2);
        assertEquals(rodeur.toString(), "Joueur 1 utilise concentration et gagne 50 d'agilité");
    }
}
