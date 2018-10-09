/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonnagesTest;

import Personnage.Mage;
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
public class MageTest {
    
    @Test
    public void MageDescTest() throws Exception{
        Mage mage = new Mage(100, 0, 0, 100);
        assertEquals(mage.getSentence(), "Abracadabra je suis le mage joueur");
    }
    
    @Test
    public void MageBasicAttackTest() throws Exception{
        Mage mage = new Mage(100, 0, 0, 100);
        Mage adversaire = new Mage(100, 0, 0, 100);
        adversaire.looseHp(mage.basicAttak());
        assertEquals(mage.getIntel(), 100);
    }
    
    @Test
    public void MageSpecialAttackTest() throws Exception{
        Mage mage = new Mage(100, 0, 0, 100);
        Mage adversaire = new Mage(100, 0, 0, 100);
        mage.specialAttack(adversaire, 0, 0);
        assertEquals(mage.toString(), "");
        
    }
}
