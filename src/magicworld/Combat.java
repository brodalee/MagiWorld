/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicworld;

import Personnage.Personnages;

/**
 *
 * @author alex
 */
public class Combat {
    
    public void basicAttack(Personnages att, Personnages defender, int attTurn, int defTurn){
        defender.looseHp(att.basicAttak());
        System.out.println("Joueur "+defTurn+" perd "+att.basicAttak()+" point de vie");
    }
    
    public void specialAttack(Personnages att, Personnages defender){
        
    }
}
