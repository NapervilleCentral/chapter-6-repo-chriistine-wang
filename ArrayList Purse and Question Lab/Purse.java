
import java.util.ArrayList;

public class Purse
{
    private ArrayList<Coin> pocket = new ArrayList();
 
    public Purse()
    {
        //pocket.add(coin1);
    }

    public Purse (Coin acoin)
    {
        pocket.add(acoin);
    }
  /** precondition: Coin will be initialized (value and name) correctly
  *               each variable will have a value
         postcondition: Puts the Coin into the array list pocket
  */
    public void add (Coin aCoin)
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
