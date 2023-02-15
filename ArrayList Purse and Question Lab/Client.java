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
        Coin aCoin = new Coin();
    
        while (!(choice.equals("X")))
        {
            System.out.println("Menu ___________\nA - Add a Coin \n" +
            "R - Remove a Coin\nD - Display Purse\nX - Exit");
            choice = kb.nextLine();
            if (choice.equals("A"))
            {
                System.out.println("Add what type of coin?\n 1 - Penny\n2 - Nickel\n3 - Dime\n4 - Quarter");
                aCoin.setType(kb.nextInt());
                wallet.add(aCoin);
            }
            if (choice.equals("R"))
            {
                System.out.println("Remove what type of coin?\n 1 - Penny\n2 - Nickel\n3 - Dime\n4 - Quarter");
                aCoin.setType(kb.nextInt());
                wallet.remove(aCoin);
            }
            //what does display all the coins mean?
            if (choice.equals("D"))
            {
                wallet.toString();
            }
        }
        
    }
}
