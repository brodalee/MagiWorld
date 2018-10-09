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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
