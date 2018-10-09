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
abstract public class Personnages {

    private int level, hp, strenght, agility, intel;

    public Personnages(int level, int strenght, int agility, int intel) {
        this.level = level;
        this.strenght = strenght;
        this.agility = agility;
        this.intel = intel;
        this.hp = level * 5;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) throws Exception {
        if (level >= 1 && level <= 100) {
            this.level = level;
        } else {
            throw new Exception("You have to set level between 1 and 100");
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) throws Exception {
        if (this.verifyCaract(strenght)) {
            this.strenght = strenght;
        }
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) throws Exception {
        if (this.verifyCaract(agility)) {
            this.agility = agility;
        }
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) throws Exception {
        if (this.verifyCaract(intel)) {
            this.intel = intel;
        }
    }

    private boolean verifyCaract(int caract) throws Exception {
        if (caract < 0 || caract > 100) {
            throw new Exception("You have to set caract between 0 and 100");
        } else {
            return true;
        }
    }

}