import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		//making a new fighter object called warrior with preset stats
		Warrior warrior = new Warrior("warrior", 100, 4, 2, 0, 30, 0, 0);

		//Make a basic Enemy object called 'Slime'
		Enemy slime = new Enemy("Slime", 20, 2, 1);


		//testing calling a method to let program know our new fighter has killed an enemy
		System.out.println("Your current level: " + warrior.getLevel() + "\n");


		//asking user for player's name
		System.out.print("What is your name player? ");
		String name = kbd.next();


		//Displays player's character's stats before slaying an enemy
		System.out.println("Okay " + name + " You have recieved a Warrior with the following stats: \n");

		System.out.printf("%-15s %n","   Class   |   HP   |   Attack   |   Attack Type: Phsyical   |   Level   |   Experience");
		System.out.printf("%-15s %n","------------------------------------------------------------------------------------------");
		System.out.printf("%-15s %n","  Warrior  |  " + warrior.getHP() + "   |     " + warrior.getAttack() + "     |              " + warrior.getPhysical() + "            |     "
				+ warrior.getLevel() + "     |       " + warrior.getXP() + "   \n");


		//displays individual variables of each object to make sure everything is being updated
				System.out.println("player XP = " + warrior.getXP());
				System.out.println("XP = " + warrior.getXP());



		//a loop that keeps going until either player or enemy's HP equals 0
		System.out.println("A" + slime.getName() + " has appeared!");
		String attack;
		while (slime.getHP() >= 0) {
			System.out.println("Would you like to use Sword Thrust?");
			attack = kbd.next();
			if (attack.contains("yes")) {
				slime.setHP(slime.getHP() - warrior.basicMove());
			}

		}
		kbd.close();

		//shows stats after killing an enemy
		System.out.printf("%-15s %n","   Class   |   HP   |   Attack   |   Attack Type: Phsyical   |   Level   |   Experience");
		System.out.printf("%-15s %n","------------------------------------------------------------------------------------------");
		System.out.printf("%-15s %n","  Warrior  |  " + warrior.getHP() + "   |     " + warrior.getAttack() + "     |              " + warrior.getPhysical() + "            |     "
				+ warrior.getLevel() + "     |       " + warrior.getXP() + "   \n");


		System.out.println("gained XP = " + warrior.xp.getGainedXP());
		System.out.println("player XP = " + warrior.getXP());
	}

}
