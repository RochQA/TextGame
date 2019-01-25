package ta;

public class Setup {
	
	
	public static int[] setupPlayer() {
		int startX = (int)(Math.random()* 50+0);
		int startY = (int)(Math.random()* 50+0);
		int[] player = new int[5];
		player[0] = startX;
		player[1] = startY;
		player[2] = 100;
		player[3] = 20;
		player[4] = 0;
		
		return(player);
	}
	public static int[] setupGold(int[] player) {
		boolean posSet=false;
		int[] gold = new int[2];
		while(!posSet) {
			int startX = (int)(Math.random()* 50+0);
		    int startY = (int)(Math.random()* 50+0);
		    if (startX != player[0] || startY != player[1]) {
		    	gold[0] = startX;
		    	gold[1] = startY;
		    	posSet = true;
		    }
		}
		return gold;
	}
	public static int[] setupEnemy(int[] player, int [] gold) {
		boolean posSet=false;
		int[] enemy = new int[4];
		while(!posSet) {
			int startX = (int)(Math.random()* 50+0);
		    int startY = (int)(Math.random()* 50+0 );
		    if ((startX != player[0] || startY != player[1])&& (startX != gold[0] || startY != gold[1])) {
		    	enemy[0] = startX;
		    	enemy[1] = startY;
		    	enemy[2] =(int)(Math.random()* 50+10) ;
		    	enemy[3] =(int)(Math.random()* 70+30) ;
		    	posSet = true;
		    }
		}
		return enemy;
	}
	public static int[] setupWeapon(int[] player, int [] gold, int[] enemy) {
		boolean posSet=false;
		int[] weapon = new int[4];
		while(!posSet) {
			int startX = (int)(Math.random()*50+0);
		    int startY = (int)(Math.random()*50+0);
		    if ((startX != player[0] || startY != player[1])&& (startX != gold[0] || startY != gold[1]) && (startX != enemy[0] || startY != enemy[1])) {
		    	weapon[0] = startX;
		    	weapon[1] = startY;
		    	weapon[2] = (int)(Math.random()* 25+5);
		    	weapon[3] = 0;
		    	posSet = true;
		    }
		}
		return weapon;
	}
	public static int[] setupNewWeapon(int[] player, int [] gold, int[] enemy, int[] oldweapon) {
		boolean posSet=false;
		int[] weapon = new int[4];
		while(!posSet) {
			int startX = (int)(Math.random()* 50+0);
		    int startY = (int)(Math.random()* 50+0);
		    if ((startX != player[0] || startY != player[1])&& (startX != gold[0] || startY != gold[1]) && (startX != enemy[0] || startY != enemy[1])&&(startX != oldweapon[0] || startY != oldweapon[1])) {
		    	weapon[0] = startX;
		    	weapon[1] = startY;
		    	weapon[2] = (int)(Math.random()* 25+5);
		    	weapon[3] = 0;
		    	posSet = true;
		    }
		}
		return weapon;
	}
	public static int[] setupNewEnemy(int[] player, int [] gold, int[] oldenemy, int[] weapon) {
		boolean posSet=false;
		int[] enemy = new int[4];
		while(!posSet) {
			int startX = (int)(Math.random()* 50+0);
		    int startY = (int)(Math.random()* 50+0);
		    if ((startX != player[0] || startY != player[1])&& (startX != gold[0] || startY != gold[1]) && (startX != oldenemy[0] || startY != oldenemy[1])&&(startX != weapon[0] || startY != weapon[1])) {
		    	enemy[0] = startX;
		    	enemy[1] = startY;
		    	enemy[2] =(int)(Math.random()* 50+10) ;
		    	enemy[3] =(int)(Math.random()* 70+30) ;
		    	posSet = true;
		    }
		}
		return enemy;
	}
}
