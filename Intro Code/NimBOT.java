import java.util.*;

/**
 * Write a description of class NimBOT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NimBOT
{
    public static int botMove(int[] stones)
    {
        if (winningMove(stones) != -999)
        {
            return winningMove(stones);
        }
        
        if (zeroNimSum(stones) == true) // if current position is loseing, play a random move
        {
            for (int i = 0; i < stones.length; i++)
            {
                if (stones[i] > 0)
                {
                    return (100 * i) + 1;
                }
            }
        }
        else // the position is winning. find a move
        {
            for (int i = 0; i < stones.length; i++)
            {
                for (int left = 0; left < stones[i]; left++)
                {
                    int[] tempArr = stones.clone();
                    tempArr[i] = left;
                    if (zeroNimSum(tempArr) == true)
                    {
                        return (100 * i) + stones[i] - tempArr[i];
                    }
                }
            }
        }
        
        return 305; // THIS SHOULD NOT CALL!!! // Example: remove 5 stones from row 3
    }
    
    public static boolean zeroNimSum(int[] stones) // if the nim sum of a position is zero, it is winning (says Google)
    {
        boolean b1 = false; // the value of the binary digets of the nim sum
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        
        for (int i = 0; i < stones.length; i++)
        {
            int num = stones[i];
            
            int n1;
            int n2;
            int n3;
            int n4;
            
            n4 = num / 8; num -= n4 * 8;
            n3 = num / 4; num -= n3 * 4;
            n2 = num / 2; num -= n2 * 2;
            n1 = num / 1; num -= n1 * 1; // num should now be zero and we should have it converted to binary
                        
            if (n1 > 0)
            {
                b1 = !b1;
            }
            if (n2 > 0)
            {
                b2 = !b2;
            }
            if (n3 > 0)
            {
                b3 = !b3;
            }
            if (n4 > 0)
            {
                b4 = !b4;
            }
        }
        
        
        if (b1 == false && b2 == false && b3 == false && b4 == false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static int winningMove(int[] stones) // winning move if there is only one pile left or only 2 piles with on containing a single rock
    {
        int fullRows = 0;
        int singleRows = 0;
        for (int i = 0; i < stones.length; i++) // find the number of occupied rows and rows with only 1 stone
        {
            if (stones[i] > 0)
            {
                fullRows++;
                if (stones[i] == 1)
                {
                    singleRows++;
                }
            }
        }
        
        
        if (fullRows == 1 && singleRows == 0) // These are the three possible winning moves
        {
            for (int i = 0; i < stones.length; i++)
            {
                if (stones[i] > 0)
                {
                    return (100 * i) + stones[i] - 1; 
                }
            }
        }
        else if (fullRows == 2 && singleRows == 1)
        {
            for (int i = 0; i < stones.length; i++)
            {
                if (stones[i] > 1)
                {
                    return (100 * i) + stones[i]; 
                }
            }
        }
        else if (fullRows == 3 && singleRows == 2)// only non-zero-nim-sum move that is winning
        {
            for (int i = 0; i < stones.length; i++)
            {
                if (stones[i] > 1)
                {
                    return (100 * i) + stones[i] - 1; 
                }
            }
        }
        
        return -999;
    }
}
