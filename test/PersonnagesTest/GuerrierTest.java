/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonnagesTest;

import Personnage.Guerrier;
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
public class GuerrierTest {
    
    @Test
    public void GuerrierDescTest() throws Exception{
        Guerrier guerrier = new Guerrier(100, 100, 0, 0);
        assertEquals(guerrier.toString(), "Woarg je suis le joueur");
    }
    
    @Test
    public void GuerrierBasicAttackTest() throws Exception{
        Guerrier guerrier = new Guerrier(100, 100, 0, 0);
        Guerrier adversaire = new Guerrier(100, 100, 0, 0);
        adversaire.looseHp(guerrier.basicAttak());
        assertEquals(guerrier, "Joueur 1 utilise Coup d'épé et inflige 100 de dégats");
    }
    
    @Test
    public void GuerrierspecialAttackTest() throws Exception{
        Guerrier guerrier = new Guerrier(100, 100, 0, 0);
        Guerrier adversaire = new Guerrier(100, 100, 0, 0);
        guerrier.specialAttack(adversaire, 1, 2);
        assertEquals(guerrier, "Joueur 1 utilise Coup de rage et inflige 200 de dégats et perd 50 points de vie");
    }
}
