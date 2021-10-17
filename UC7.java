import java.util.*;
public class UC7 {
    public static final int StartingPoint=0;
    public static final int Player1 = 0;
    public static final int Player2 = 1;
    public static int Position =0;
    public static int Dice_Count =0;
    public static int Player1Position = 0;
    public static int Player2Position = 0;
    public static void main(String[] args) {
        int Player = 0;
		System.out.println("welcome to snake and ladder game");
        System.out.println("Game started with two players at the starting position of " + StartingPoint);
        while (Position < 100) {
            if (Player == Player1){
                Position = Player1Position;
            }
            else{
                Position = Player2Position;
            }
            Random r = new Random();
            int Dice = 1 + r.nextInt(6);
            int options = r.nextInt(3);
            switch (options) {
                case 0: {
                    Position = Position;  
                    break;
                }
                case 1: {
                    Position = Position + Dice;   //ladder
                    if (Position > 100)
                        Position = Position - Dice;
                    if (Position == 100) {
                        if (Player == Player2)
                            System.out.println("Player1 Wins");
                        else
                            System.out.println("Player2 Wins");
                    }
                    break;
                }
                default: {
                    Position = Position - Dice;    
                    if (Position < 0)
                        Position =0;
                    break;
                }
            }
            Dice_Count = Dice_Count + 1;
            if (Player == Player1){
                Player1Position = Position;
                Player = Player2;
            }
            else{
                Player2Position = Position;
                Player = Player1;
            }
            if (options == 1){
                Player = 0;
            }
            else
                Player = 1;

        }
        System.out.println("Number of dice roll : " + Dice_Count);
        System.out.println(Position);
    }


}