package Personnage;

/**
 *
 * @author alex
 */
abstract public class Personnages implements PersonnagesInterface{

    /**
     * Caractéristiques de tout personnages
     */
    private int level, hp, strenght, agility, intel;

    public Personnages(int level, int strenght, int agility, int intel) throws Exception {
        this.level = level;
        this.strenght = strenght;
        this.agility = agility;
        this.intel = intel;
        this.hp = level * 5;
        this.verifIfCaractRespectPoints();
    }

    /**
     * 
     * @return int niveau du personnage
     */
    public int getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     * @throws Exception 
     */
    public void setLevel(int level) throws Exception {
        if (level >= 1 && level <= 100) {
            this.level = level;
        } else {
            throw new Exception("You have to set level between 1 and 100");
        }
    }

    /**
     * 
     * @return int le nombre de point de vie actuel du personnage
     */
    public int getHp() {
        return hp;
    }

    /**
     * 
     * @param hp 
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * 
     * @return int la force du personnage
     */
    public int getStrenght() {
        return strenght;
    }

    /**
     * 
     * @param strenght
     * @throws Exception 
     */
    public void setStrenght(int strenght) throws Exception {
        if (this.verifyCaract(strenght)) {
            this.strenght = strenght;
        }
    }

    /**
     * 
     * @return int l'agilité du personnage
     */
    public int getAgility() {
        return agility;
    }

    /**
     * 
     * @param agility
     * @throws Exception 
     */
    public void setAgility(int agility) throws Exception {
        if (this.verifyCaract(agility)) {
            this.agility = agility;
        }
    }

    /**
     * 
     * @return int l'intelligence du personnage
     */
    public int getIntel() {
        return intel;
    }

    /**
     * 
     * @param intel
     * @throws Exception 
     */
    public void setIntel(int intel) throws Exception {
        if (this.verifyCaract(intel)) {
            this.intel = intel;
        }
    }

    /**
     * 
     * @param caract
     * @return
     * @throws Exception 
     * Permet de verifier si les caractéristiques données sont valables
     */
    private boolean verifyCaract(int caract) throws Exception {
        if (caract < 0 || caract > 100) {
            throw new Exception("You have to set caract between 0 and 100");
        } else {
            return true;
        }
    }
    
    /**
     * 
     * @param dmgs 
     * Permet de faire perdre des points de vie
     */
    public void looseHp(int dmgs){
        this.hp = this.getHp() - dmgs;
    }
    
    /**
     * 
     * @return
     * @throws Exception 
     * Verifie si tous les points sont égaux ou inferieur par rapport au niveau
     */
    private boolean verifIfCaractRespectPoints() throws Exception{
        if(this.getAgility() + this.getIntel() + this.getStrenght() > this.level){
            throw new Exception("You have to set the same numbers of point level as caracters point skills");
        }
        return true;
    }
}
