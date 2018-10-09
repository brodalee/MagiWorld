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
public class Mage extends Personnages{
    /**
     * Nombre d'hp max (utile pour faire le test des soins)
     */
    private final int maxHp = this.getLevel()*5;
    
    /**
     * 
     * @param level
     * @param strenght
     * @param agility
     * @param intel
     * @throws Exception 
     */
    public Mage(int level, int strenght, int agility, int intel) throws Exception {
        super(level, strenght, agility, intel);
    }

    /**
     * 
     * @return int
     * Attaque Basique - Boule de Feu : Effectue des dommages égaux à
     * l’intelligence du joueur sur l’adversaire.
     */
    @Override
    public int basicAttak() {
        return this.getIntel();
    }

    /**
     * 
     * @return String 
     * Retourne un string représentant le "cri de guerre" du personnage
     */
    @Override
    public String getSentence() {
        return "Abracadabra je suis le mage joueur";
    }

    /**
     * 
     * @param defender
     * @param attTurn
     * @param defTurn 
     * Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa
     * quantité d’intelligence fois 2 en points de vie. Attention, il ne
     * peut pas avoir plus de vie qu’il n’en avait au départ.
     */
    @Override
    public void specialAttack(Personnages defender, int attTurn, int defTurn) {
        this.winHp(this.getLevel()/2);
    }
    
    /**
     * 
     * @return String représentant le nom de l'attaque de base
     */
    @Override
    public String getBasicAttackName() {
        return "Boule de Feu";
    }

    /**
     * 
     * @return String représentant le nom de l'attaque spéciale
     */
    @Override
    public String getSpecialAttackName() {
        return "Soin";
    }
    
    /**
     * 
     * @param hp 
     * Permet de faire un gain de point de vie
     * tout en controllant le maxhp
     */
    private void winHp(int hp){
        this.setHp(this.getHp()+hp);
        if(this.getHp() > this.maxHp){
            this.setHp(this.maxHp);
        }
    }
    
}
