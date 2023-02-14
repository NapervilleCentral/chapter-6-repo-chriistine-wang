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
        String choice = kb.nextLine();
        Purse wallet = new Purse();        
        System.out.println("Menu ___________\nA - Add a Coin \n" +
         "R - Remove a Coin\nX - Display Purse");
        
        if (choice == "A")
        {
            System.out.println("Add what type of coin? 1 - Penny\n2 - Nickel\n3 - Dime\n4 - Quarter");
            wallet.add();
        }
        
         
        
    }
}
