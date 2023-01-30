import java.util.*;

/**
 * Write a description of class Nim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nim
{
    
    
    public static void main(String[] args)
    {
        boolean playing = true;
        
        while (playing)
        {
            playing = false;
            
            int[] stones = {3, 5, 8};
            boolean turn = true; // true = player 1 turn :: false = player 2 turn
            boolean end = false;
            
            while (end == false) // game loop (until someone wins)
            {
                display(stones); // displays the board
                move(stones, turn); // current player moves
                end = win(stones, turn); // checks if the game is over
                
                turn = !turn; // change whos turn it is
            }
            
            System.out.println();
            System.out.println("Would you like to play again (y/n): "); // ask if they want to play again
            String response = new Scanner(System.in).nextLine();
            if (response.equals("y")) playing = true;
        }
    }
    
    public static void display(int[] stones) // displays the current board
    {
        System.out.println("______________________");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Row " + (i + 1) + ": ");
            for (int s = 0; s < stones[i]; s++)
            {
                System.out.print("O");
            }
            System.out.println();
        }
    }
    
    public static void move (int[] stones, boolean turn)
    {
        Scanner scn = new Scanner(System.in);
        
        String player; // the player who's turn it is
        if (turn == true)
        {
            player = "PLAYER-1";
        }
        else
        {
            player = "PLAYER-2";
        }
        System.out.println("It is " + player + "'s turn!");
        System.out.println();
        
        
        System.out.println("Would you like the computer to move for you (y/n): ");
        if (scn.nextLine().equals("y")) // Bot moves
        {
            int optimalMove = NimBOT.botMove(stones);
            
            stones[optimalMove / 100] -= optimalMove % 100;
        }
        else // player moves
        {
            System.out.println();
            
            
            System.out.println("Which row would you like to take stones from: ");
            int row = scn.nextInt();
            
            System.out.println("How many stones would you like to take from ROW " + row + ": ");
            int count = scn.nextInt();
            
            stones[row - 1] -= count; // remove stones from a row
        }
    }
    
    public static boolean win(int[] stones, boolean turn)
    {
        boolean ans = true;
        
        
        
        for (int i = 0; i < stones.length && ans == true; i++) // check if there are no stones left
        {
            if (stones[i] > 0)
            {
                ans = false;
            }
        }
        
        
        if (ans == true) // print out who won
        {
            String player; // the winning player
            if (turn == false)
            {
                player = "PLAYER-1";
            }
            else
            {
                player = "PLAYER-2";
            }
            
            display(stones);
            System.out.println(player + " wins the game!!!");
        }
        
        
        return ans; // return if the game ended
    }
}
