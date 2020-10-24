
public class Enemy {

	private String name;
	private int HP;
	private int ATK;
	private int level;

	public Enemy(String name, int HP, int ATK, int level) {
		this.name = name;
		this.HP = HP;
		this.ATK = ATK;
		this.level = level;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public void setATK(int ATK) {
		this.ATK = ATK;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public int getHP() {
		return HP;
	}

	public int getATK() {
		return ATK;
	}

	public int getLevel() {
		return level;
	}

}
