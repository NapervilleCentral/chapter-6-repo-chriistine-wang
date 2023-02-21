
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Purse
{
    private ArrayList<Coin> pocket = new ArrayList();
 
    public Purse()
    {
        for (int i = 0; i < 5; i++)
        {
            pocket.add(new Coin(4));
        }
    }

    /** precondition: Coin will be initialized (value and name) correctly
      *               each variable will have a value
             postcondition: Puts the Coin into the array list pocket
      */
    public void add (Coin aCoin)
    {
        pocket.add(aCoin);
    }
    
    public void remove (int coinType)
    {
        for (int i = 0; i < pocket.size(); i++)
        {
            Coin aCoin = pocket.get(i);
            if (aCoin.getType() == coinType)
            {
                pocket.remove(i);
                return;
            }
        }
    }
    
    public double getTotalPennies()
    {
        double count = 0;
        for (Coin aCoin: pocket)
            if (aCoin.getType() == 1)
            {
                count++;
            }
        return count;
    }
    
    public double getTotalNickels()
    {
        double count = 0;
        for (Coin aCoin: pocket)
            if (aCoin.getType() == 2)
            {
                count++;
            }
        return count;
    }
    
    public double getTotalDimes()
    {
        double count = 0;
        for (Coin aCoin: pocket)
            if (aCoin.getType() == 3)
            {
                count++;
            }
        return count;
    }
    
    public double getTotalQuarters()
    {
        double count = 0;
        for (Coin aCoin: pocket)
            if (aCoin.getType() == 4)
            {
                count++;
            }
        return count;
    }
    
  /** Returns the total value of the coins in the array
  *                 list change
          @return total
  */
    public double getTotal()
    {
        double total = 0;
        
        for (Coin aCoin: pocket)
            total += aCoin.getValue();
        
        return total;

    }

 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
    String result = "";
    DecimalFormat df = new DecimalFormat("#0.00");
    
      result = getTotalPennies() + " Pennies\n" + getTotalNickels() + " Nickels\n"
      + getTotalDimes() + " Dimes\n" + getTotalQuarters() + " Quarters\n"
      + "Total: $" + df.format(getTotal());
      
      return result;

    }

}
//end of purse
