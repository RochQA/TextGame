package ta;

import java.util.Scanner;

public class Decision {
	public static int[] decision(int[] player,int[] enemy,int[] weapon, int decisionID) {
		int[] playerNew = player;
		int enemyAtt = enemy[2];
		int enemyHealth = enemy[3];
		int weaponDamage = weapon[2];
		int currWepDam = player[3] - 20;
		int playerAtt = player[3];
		boolean decisionMade = false;
		Scanner inp = new Scanner(System.in);
		String decision = "";		
		if (decisionID == 2) {
			System.out.println("You encounter a swamp monster");
			System.out.println("You currently do "+ player[4]+" damage!");
			while(!decisionMade) {
				System.out.println("Do you want to attack?");
				decision = inp.nextLine();
				if(decision .equals("yes")||decision .equals("y")) {
					decisionMade=true;
					boolean combat = true;
					while(combat) {
						System.out.println("Swamp Monsters Health: "+ enemyHealth);
						System.out.println("You attack the monster for "+ playerAtt +" damage!");
						enemyHealth = enemyHealth - playerAtt;
						if (enemyHealth>0) {
							System.out.println("The monster attacks you for "+ enemyAtt +" damage!");
							playerNew[2] = playerNew[2] - enemyAtt;
							System.out.println("Your health is "+ playerNew[2]);
							if(playerNew[2]>0) {
								System.out.println("Do you want to continue fighting?");
								decision = inp.nextLine();
								decisionMade=true;
								while(!decisionMade) {
									if(decision .equals("no")||decision .equals("n")) {
										combat=false;
										decisionMade=true;
										System.out.println("You couragiously decided to run away!");
									}else if(decision .equals("yes")||decision .equals("y")) {
										decisionMade=true;
									}else {
										System.out.println("Enter a valid decision");
									}
							}
							}else {
								System.out.println("You Dead!");
							}
						}
					}
				}else if(decision .equals("no")||decision .equals("n")) {
					System.out.println("You couragiously decided to run away!");
					decisionMade=true;
				}else {
					System.out.println("Enter a valid decision");
				}
			}
		}else if(decisionID == 3) {
			System.out.println("You find a sword that does +" + weaponDamage + " damage!");
			if(currWepDam>0) {
				System.out.println("Your current sword does +" + currWepDam + "damage!");
				System.out.println("Do you want swap your sword");
			}else {
				System.out.println("Do you want to take the sword");
			}
			decision = inp.nextLine();
			if(decision .equals("yes")||decision .equals("y")) {
				playerNew[3] = 20 + weaponDamage;
				System.out.println("You now do " + playerNew[3] + " damage");	
			}else if(decision .equals("no")||decision .equals("n")) {
				System.out.println("You leave the sword");					
			}else {
				System.out.println("Enter a valid decision");
			}
		}
	return playerNew;
	}

}
