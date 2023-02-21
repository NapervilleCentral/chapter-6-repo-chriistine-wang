import java.util.Scanner;    
/**
 * Write a description of class Client here.
 *
 * @author Christine
 * @version (a version number or a date)
 */
public class Client
{
    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);
        Purse wallet = new Purse();
        
        System.out.println("Menu ___________\nA - Add a Coin \n" +
        "R - Remove a Coin\nD - Display Purse\nX - Exit");
        String choice = kb.nextLine();
        

        while (!(choice.equals("X")))
        {
            if (choice.equals("A"))
            {
                System.out.println("Add what type of coin?\n1 - Penny\n2 - Nickel\n3 - Dime\n4 - Quarter");
                int coinType = kb.nextInt();
                Coin newCoin = new Coin(coinType);
                wallet.add(newCoin);
                kb.nextLine();
            }
            if (choice.equals("R"))
            {
                System.out.println("Remove what type of coin?\n1 - Penny\n2 - Nickel\n3 - Dime\n4 - Quarter");
                int coinType = kb.nextInt();
                wallet.remove(coinType);
                kb.nextLine();
            }
            if (choice.equals("D"))
            {
                System.out.println(wallet.toString());
            }
            System.out.println("Menu ___________\nA - Add a Coin \n" +
            "R - Remove a Coin\nD - Display Purse\nX - Exit");
            choice = kb.nextLine();
    
        }
        
    }
}
