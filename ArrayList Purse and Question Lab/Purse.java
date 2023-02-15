
import java.util.ArrayList;

public class Purse
{
    private ArrayList<Coin> pocket = new ArrayList();
 
    public Purse()
    {
        
    }

    public Purse (Coin aCoin)
    {
        aCoin.setType(4);
        pocket.add(aCoin);
        pocket.add(aCoin);
        pocket.add(aCoin);
        pocket.add(aCoin);
        pocket.add(aCoin);
    }
    // did i do add and remove methods right??
      /** precondition: Coin will be initialized (value and name) correctly
      *               each variable will have a value
             postcondition: Puts the Coin into the array list pocket
      */
    public void add (Coin aCoin)
    {
        //aCoin 
        pocket.add(aCoin);
    }
    
    public void remove (Coin aCoin)
    {
        pocket.remove(aCoin);
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
          @return ???
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
      String result;
      
      result = getTotalPennies() + " Pennies\n" + getTotalNickels() + " Nickels\n"
      + getTotalDimes() + " Dimes\n" + getTotalQuarters() + " Quarters\n"
      + "Total: $" + getTotal();
      
      return result;
   }

}
//end of purse
