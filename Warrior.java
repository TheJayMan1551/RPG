
/*our warrior class that extends "classes" class so we do not have to
  retype all the setters and getters again so this is useful when making
  more fighters
 */
public class Warrior extends classes {

	Experience xp;

	public Warrior(String name, int HP, int attack, int attackType, int magic, int physcial, int level, int XP) {
		super(name, HP, attack, attackType, magic, physcial, level, XP);
		xp = new Experience(XP, level);
	}

	//method to call when our fighter slays an enemy
	public int killedEnemy() {
		return xp.getXP();
	}
	
	public int checkLevel() {
		return xp.levelUp();
	}

}
