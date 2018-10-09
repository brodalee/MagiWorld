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
public class Guerrier extends Personnages {

    /**
     * 
     * @param level
     * @param strenght
     * @param agility
     * @param intel
     * @throws Exception 
     */
    public Guerrier(int level, int strenght, int agility, int intel) throws Exception {
        super(level, strenght, agility, intel);
    }

    /**
     * 
     * @return int
     * Attaque Basique - Coup d’Épée : Effectue des dommages 
     * égaux à la force du joueur sur l’adversaire.
     */
    @Override
    public int basicAttak() {
        return this.getStrenght();
    }
    
    /**
     * 
     * @return String 
     * Retourne un string représentant le "cri de guerre" du personnage
     */
    @Override
    public String getSentence() {
        return "Woarg je suis le guerrier joueur";
    }

    /**
     * 
     * @param defender
     * @param attTurn
     * @param defTurn 
     * Attaque Spéciale - Coup de Rage : Effectue des dommages égaux
     * à la force du joueur fois deux sur l’adversaire. Le joueur
     * lançant l'attaque perd de la vitalité : la valeur de
     * sa force divisée par 2.
     */
    @Override
    public void specialAttack(Personnages defender, int attTurn, int defTurn) {
        System.out.println("Joueur " + attTurn + " utilise " + this.getSpecialAttackName() + " et inflige " + (this.getStrenght() * 2) + " point de vie");
        defender.looseHp(this.getStrenght() * 2);
        System.out.println("Joueur " + defTurn + " perd " + (this.getStrenght() * 2));
        this.looseHp(this.getStrenght() / 2);
        System.out.println("Joueur " + attTurn + " perd " + (this.getStrenght() / 2));
    }

    /**
     * 
     * @return String représentant le nom de l'attaque de base
     */
    @Override
    public String getBasicAttackName() {
        return "Coup d’Épée";
    }

    /**
     * 
     * @return String représentant le nom de l'attaque spéciale
     */
    @Override
    public String getSpecialAttackName() {
        return "Coup de Rage";
    }

}
