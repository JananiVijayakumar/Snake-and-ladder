import java.util.*;
public class UC3 {
	public static void main(String[] args){
	System.out.println("welcome to snake and ladder game");
	int Starting_point=0;
		Random r = new Random();
		int n=r.nextInt(7);
		System.out.println("dice number :" + n);
		int game = (int) Math.floor(Math.random() * 10) % 3 + 1;

	switch(game) {
		case 1:
		Starting_point=Starting_point + n;
		break;
		case 2:
		Starting_point=Starting_point - n;
		break;
		default:
		System.out.println("player is not start the game");
		}
		System.out.println("position of the player : " + Starting_point);
	}
}