package ta;

public class Locations {
	
	public static int checkLoc(int[] player, int[] gold, int[] enemy, int[] weapon) {
		int scenarioID=0;
		if (player[0] == gold[0] && player[1] == gold[1]) {
			scenarioID=1;
		}else if(player[0] == enemy[0] && player[1] == enemy[1]) {
			scenarioID=2;
		}else if (player[0] == weapon[0] && player[1] == weapon[1]) {
			scenarioID=3;
		}
		return scenarioID;
	}
	public static double goldDist(int[] player, int[] gold) {
		int xDist = gold[0] + player[0];
		int yDist = gold[1] + player[1];
		double distance= Math.sqrt((xDist*xDist)+(yDist*yDist));
		return distance;
	}

}
