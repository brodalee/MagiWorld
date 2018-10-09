package Personnage;

/**
 *
 * @author alex
 */
interface PersonnagesInterface {
    public int basicAttak();
    public String getSentence();
    public void specialAttack(Personnages defender,int attTurn, int defTurn);
    public String getBasicAttackName();
    public String getSpecialAttackName();
}
