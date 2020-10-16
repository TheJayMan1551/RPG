
/*XP class to take care experience problems and compute correct experience point gains to return 
  back to its respective fighter
 */
public class Experience {

	private int PlayerXP;
	private int playerLvl;
	private int gainedXP = 10;

	public Experience(int xp, int lvl) {
		this.PlayerXP = xp;
		this.playerLvl = lvl;
	}

	//method to call to receive experience points
	public int getXP() {
		System.out.println("you gained 10 experience");
		PlayerXP += 10;
		return 10;
	}

	//method to check whether player has enough experience to level up
	public int levelUp() {
		switch (PlayerXP) {
		case 10:
			playerLvl = 1;
			return 1;
		case 100:
			playerLvl = 2;
			return 2;
		case 1000:
			playerLvl = 3;
			return 3;
		default:
			return playerLvl;
		}
	}

	public int getGainedXP() {
		return gainedXP;
	}
	
}
