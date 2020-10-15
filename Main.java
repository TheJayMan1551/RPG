import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		//making a new fighter object called warrior with preset stats
		Warrior warrior = new Warrior("warrior", 100, 10, 2, 0, 30, 0, 0);
		int gainedXP = 0;
		int currentLevel = 0;
		

		//testing calling a method to let program know our new fighter has killed an enemy
		System.out.println("Your current level: " + warrior.getLevel() + "\n");
		

		//asking user for player's name
		System.out.print("What is your name player? ");
		String name = kbd.next();

		
		//Displays player's character's stats before slaying an enemy
		System.out.println("Okay Jay!" + " You have recieved a Warrior with the following stats: \n");

		System.out.printf("%-15s %n","   Class   |   HP   |   Attack   |   Attack Type: Phsyical   |   Level   |   Experience");
		System.out.printf("%-15s %n","------------------------------------------------------------------------------------------");
		System.out.printf("%-15s %n","  Warrior  |  " + warrior.getHP() + "   |     " + warrior.getAttack() + "     |              " + warrior.getPhysical() + "            |     " 
				+ warrior.getLevel() + "     |       " + warrior.getXP() + "   \n");

		
		//simple loop to kill 2 enemies and gain the experience
		for (int i = 0; i < 2; i++) {
			gainedXP = warrior.killedEnemy();
			warrior.setXP(gainedXP);
			currentLevel = warrior.checkLevel();
			warrior.setLevel(currentLevel);
		}


		//displays individual variables of each object to make sure everything is being updated
		System.out.println("totalXP = " + gainedXP);
		System.out.println("XP = " + warrior.getXP());
		System.out.println("gainedPlayeXP = " + warrior.xp.getGainedPlayerXP() + "\n");


	}

}
