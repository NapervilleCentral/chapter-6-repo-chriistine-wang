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
        Coin aCoin = new Coin();
        Purse wallet = new Purse(aCoin);
    
        System.out.println("Menu ___________\nA - Add a Coin \n" +
        "R - Remove a Coin\nD - Display Purse\nX - Exit");
        String choice = kb.nextLine();

        while (!(choice.equals("X")))
        {
            if (choice.equals("A"))
            {
                System.out.println("Add what type of coin?\n1 - Penny\n2 - Nickel\n3 - Dime\n4 - Quarter");
                aCoin.setType(kb.nextInt());
                wallet.add(aCoin);
                kb.nextLine();
            }
            if (choice.equals("R"))
            {
                System.out.println("Remove what type of coin?\n1 - Penny\n2 - Nickel\n3 - Dime\n4 - Quarter");
                aCoin.setType(kb.nextInt());
                wallet.remove(aCoin);
                kb.nextLine();
            }
            //what does display all the coins mean?
            if (choice.equals("D"))
            {
                System.out.println("h");
                System.out.println(wallet.toString());
            }
            System.out.println("Menu ___________\nA - Add a Coin \n" +
            "R - Remove a Coin\nD - Display Purse\nX - Exit");
            choice = kb.nextLine();
    
        }
        
    }
}
