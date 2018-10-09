/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnage;

/**
 *
 * @author alex
 */
public class Guerrier extends Personnages{
    
    public Guerrier(int level, int strenght, int agility, int intel) {
        super(level, strenght, agility, intel);
    }

    @Override
    public int basicAttak() {
        System.out.println("");
        return this.getStrenght();
    }

    @Override
    public String getSentence() {
        return "Woarg je suis le guerrier joueur";
    }

    @Override
    public void specialAttack(Personnages defender) {
        
    }

    @Override
    public String getBasicAttackName() {
        return "Coup d’Épée";
    }

    @Override
    public String getSpecialAttackName() {
        return "Coup de Rage";
    }
    
}
