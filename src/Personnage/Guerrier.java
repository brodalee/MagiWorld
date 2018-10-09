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
    public void specialAttack(Personnages defender, int attTurn, int defTurn) {
        System.out.println("Joueur " + attTurn + " utilise " + this.getSpecialAttackName() + " et inflige " + (this.getStrenght() * 2) + " point de vie");
        defender.looseHp(this.getStrenght() * 2);
        System.out.println("Joueur " + defTurn + " perd " + (this.getStrenght() * 2));
        this.looseHp(this.getStrenght() / 2);
        System.out.println("Joueur " + attTurn + " perd " + (this.getStrenght() / 2));
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
