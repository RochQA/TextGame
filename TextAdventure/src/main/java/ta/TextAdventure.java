package ta;

import java.util.Scanner;

public class TextAdventure {

	public static void main(String[] args) {
		int [] player = Setup.setupPlayer();
		int[] gold = Setup.setupGold(player);
		int[] enemy = Setup.setupEnemy(player, gold);
		int[] weapon = Setup.setupWeapon(player, gold, enemy);
		
		System.out.println("Grey foggy clouds float oppressively close to you, \n" +
							"reflected in the murky grey water which reaches up your shins. \n"+
							"Some black plants barely poke out of the shallow water. \n"+
							"Try 'north'or'n', 'south'or's', 'east'or'e', or 'west'or'w' (lowecase)\n"+
							"You notice a small watch-like device in your left hand. \n" + 
							"It has hands like a watch, but the hands don't seem to tell time. \n");
		boolean victory = false;
		boolean fail = false;
		while(!victory && !fail) {
			System.out.println("The dial reads "+ Locations.goldDist(player,gold));
			player = Movement.move(player);
			int scenarioID = Locations.checkLoc(player, gold, enemy, weapon);
			player = Decision.decision(player, enemy, weapon, scenarioID);
			if (scenarioID == 1){
				victory=true;
			}else if (scenarioID == 2){
				enemy = Setup.setupNewEnemy(player, gold, enemy, weapon);
			}else if (scenarioID == 3){
				weapon = Setup.setupNewWeapon(player, gold, enemy, weapon);
			}
			if(player[2]<1) {
				fail=true;
			}
			
				
		}
		if(victory) {
			System.out.println("You found the gold!!!");
		}else {
			System.out.println("You failed to find the gold!!");
		}

	}

}
