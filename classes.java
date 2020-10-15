

//General Class to allow combat types to use this as their foundation
//a bunch of setters and getters
public class classes {

	protected String name;
	private int HP;
	private int attack;
	private int attackType;
	private int magic;
	private int physical;
	private int level;
	private int XP;

	//constructor that will take in base stats when child class is made
	public classes(String name, int HP, int attack, int attackType, int magic, int physcial, int level, int XP) {

		this.name = name;
		this.HP = HP;
		this.attack = attack;
		this.attackType = attackType;
		this.level = level;
		this.XP = XP;

	}

	//setters and getters for all variables declared
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getHP() {
		return HP;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttackType(int attackType) {
		this.attackType = attackType;
	}

	public int getAttackType() {
		return attackType;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getMagic() {
		return magic;
	}

	public void setPhysical(int physical) {
		this.physical = physical;
	}

	public int getPhysical() {
		return physical;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setXP(int XP) {
		this.XP += XP;
	}

	public int getXP() {
		return XP;
	}

}
