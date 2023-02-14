
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
        
    }
    // for each coin
    // if coin c.getType = Penny
    // count++
    public int getTotalPennies()
    {
        int count = 0;
        for (Coin aCoin: pocket)
            if (aCoin.getType() == 1)
            {
                count++;
            }
        return count;
    }
    
    public int getTotalNickels()
    {
        int count = 0;
        for (Coin aCoin: pocket)
            if (aCoin.getType() == 1)
            {
                count++;
            }
        return count;
    }
    
    public int getTotalDimes()
    {
    
    }
    
    public int getTotalQuarters()
    {
        
    }
    
  /** Returns the total value of the coins in the array
  *                 list change
          @return ???
  */
    public double getTotal()
    {


        return 0;

    }



 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
      return " --";
   }

}
//end of purse
