
package magicworld;

import Personnage.Guerrier;
import Personnage.Mage;
import Personnage.Personnages;
import Personnage.Rodeur;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class MagicWorld {

    private int turn = 1;
    private final Scanner sc = new Scanner(System.in);
    private List<Personnages> persos = new ArrayList<>();
    private Combat fight = new Combat();
    private boolean end = false;

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     * Lance l'initialisation des 2 Joueurs pour ensuite, lancer le combat.
     */
    public static void main(String[] args) throws Exception {
        MagicWorld magic = new MagicWorld();
        magic.verifPersonnage(magic.initPersonnage(1));
        magic.verifPersonnage(magic.initPersonnage(2));
        magic.fight();
    }

    /**
     * 
     * @param turnPlayer
     * @return List<Integer> contenant les choix fait par l'utilisateur selon
     * la classe, les caractéristiques.
     * @throws Exception 
     */
    public List<Integer> initPersonnage(int turnPlayer) throws Exception {
        List<Integer> perso = new ArrayList<>();
        System.out.println("Création du personnage du joueur " + turnPlayer);
        perso.add(this.chooseClasses());
        perso.add(this.chooseLevel());
        perso.add(this.chooseStrenght());
        perso.add(this.chooseAgility());
        perso.add(this.chooseIntel());
        return perso;
    }

    /**
     * 
     * @return int
     * @throws Exception 
     * Permet de choisir la classe du personnage entre 1, 2 ou 3
     */
    public int chooseClasses() throws Exception {
        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage)");
        int classes = this.sc.nextInt();
        if (classes != 1) {
            if (classes != 2) {
                if (classes != 3) {
                    throw new Exception("You have to choose 1 , 2 or 3");
                }
            }
        }
        return classes;
    }

    /**
     * 
     * @return int
     * @throws Exception 
     * Permet de choisir le niveau du personnage  entre 1 et 100
     */
    public int chooseLevel() throws Exception {
        System.out.println("Niveau du personnage ?");
        int level = this.sc.nextInt();
        if (level < 1 || level > 100) {
            throw new Exception("You have to set level between 1 and 100");
        }
        return level;
    }

    /**
     * 
     * @return int
     * @throws Exception 
     * Permet de choisir la force du personnage entre 0 et 100
     */
    public int chooseStrenght() throws Exception {
        System.out.println("Force du personnage ?");
        int force = this.sc.nextInt();
        if (force < 0 || force > 100) {
            throw new Exception("You have to set Strenght between 0 and 100");
        }
        return force;
    }

    /**
     * 
     * @return int
     * @throws Exception 
     * Permet de choisir l'agilité du personnage entre 0 et 100
     */
    public int chooseAgility() throws Exception {
        System.out.println("Agilité du personnage ?");
        int agility = this.sc.nextInt();
        if (agility < 0 || agility > 100) {
            throw new Exception("You have to set agility between 0 and 100");
        }
        return agility;
    }

    /**
     * 
     * @return int
     * @throws Exception 
     * Permet de choisir l'intélligence du personnage entre 0 et 100
     */
    public int chooseIntel() throws Exception {
        System.out.println("Intelligence du personnage ?");
        int intel = this.sc.nextInt();
        if (intel < 0 || intel > 100) {
            throw new Exception("You have to set intel between 0 and 100");
        }
        return intel;
    }
    
    /**
     * 
     * @param perso
     * @throws Exception 
     * Permet d'ajouter à la liste des joueurs, un nouveau joueur selon
     * la classe choisie
     */
    public void verifPersonnage(List<Integer> perso) throws Exception {
        if (null != perso.get(0)) {
            switch (perso.get(0)) {
                case 1:
                    this.persos.add(new Guerrier(perso.get(1), perso.get(2), perso.get(3), perso.get(4)));
                    break;
                case 2:
                    this.persos.add(new Rodeur(perso.get(1), perso.get(2), perso.get(3), perso.get(4)));
                    break;
                case 3:
                    this.persos.add(new Mage(perso.get(1), perso.get(2), perso.get(3), perso.get(4)));
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 
     * @throws Exception 
     * Permet de vérifier si l'action est bonne, si oui, alors l'attaque 
     * choisie par l'utilisateur sera executé
     */
    private void verifyAction() throws Exception {
        int action = this.sc.nextInt();
        if (action == 2) {
            if (this.turn == 1) {
                this.fight.specialAttack(this.persos.get(0), this.persos.get(1), turn, turn + 1);
            } else {
                this.fight.specialAttack(this.persos.get(1), this.persos.get(0), turn, turn - 1);
            }
        } else if (action == 1) {
            if (this.turn == 1) {
                this.fight.basicAttack(this.persos.get(0), this.persos.get(1), turn, turn + 1);
            } else {
                this.fight.basicAttack(this.persos.get(1), this.persos.get(0), turn, turn - 1);
            }
        } else {
            throw new Exception("You have to set 1 || 2");
        }
    }

    /**
     * 
     * @throws Exception 
     * Methode lancé après l'initialisation des personnages. Permet de
     * lancer le combat en tour par tour
     */
    public void fight() throws Exception {
        while (!this.end) {
            if (this.turn == 1) {
                System.out.println("Joueur 1 (" + this.persos.get(0).getHp() + " vitalié) veuillez choisir votre action (1: Attaque Basique, 2: Attaque Spéciale)");
                this.verifyAction();
                this.turn += 1;
            } else {
                System.out.println("Joueur 2 (" + this.persos.get(1).getHp() + " vitalié) veuillez choisir votre action (1: Attaque Basique, 2: Attaque Spéciale)");
                this.verifyAction();
                this.turn -= 1;
            }
            if(this.persos.get(0).getHp() <= 0){
                this.end = true;
                System.out.println("Joueur 1 a perdu !");
            }else if(this.persos.get(1).getHp() <=0){
                this.end = true;
                System.out.println("Joueur 2 a perdu !");
            }
        }
    }
}
