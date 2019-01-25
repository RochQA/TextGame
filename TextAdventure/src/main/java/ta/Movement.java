package ta;

import java.util.Scanner;

public class Movement {
	public static int[] move(int[] player) {
		int[] playerNew = player;
		Scanner inp = new Scanner(System.in);
		int userY = player[1];
		int userX = player[0];
		boolean moved = false;
		if(userX>49|| userY>49 || userX<1 || userY<1){
			System.out.print("Your path is blocked");
			if(userX>49) {
				System.out.print(", you cannot travel north");
			}
			if(userX<1) {
				System.out.print(", you cannot travel south");
			}
			if(userY>49) {
				System.out.print(", you cannot travel east");
			}
			if(userY<1) {
				System.out.print(", you cannot travel west");
			}
		}
		
		while(!moved) {
			System.out.println("Which direction would you like to travel?");
			String dir = inp.nextLine();
			if(dir .equals("north") || dir .equals("n")) {
				if(userY<50) {
					userY += 1;
					moved = true;
				}else {
					System.out.println("You cannot go north, the path is blocked");
				}
			}else if(dir .equals("south")|| dir .equals("s")) {
				if(userY>0) {
					userY -= 1;
					moved = true;
				}else {
				System.out.println("You cannot go south, the path is blocked");
				}
			}else if(dir .equals("east")|| dir .equals("e")) {
				if(userX<50) {
					userX+= 1;
					moved = true;
				}else {
					System.out.println("You cannot go east, the path is blocked");
				}
			}else if(dir .equals("west")|| dir .equals("w")) {
				if(userX>0) {
					userX -= 1;
					moved = true;
				}else {
					System.out.println("You cannot go west, the path is blocked");
				}
			}else {
				System.out.println("Please enter a valid choice!");
			}	
		}
		playerNew[0] = userX;
		playerNew[1] = userY;
		return playerNew;
	}

}
