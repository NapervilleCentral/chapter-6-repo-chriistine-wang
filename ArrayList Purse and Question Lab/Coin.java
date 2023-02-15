/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/

import java.util.Random;

public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   
   private int face;
   private double amount;
   private int type;
   private String name;

   /**-----------------------------------------------------------------
   *  Sets up the coin by flipping it initially.
   */
   public Coin ()
   {
       if (type == 1)
      {
          this.amount = 0.01;
          this.name = "Penny";
      }
      else if (type == 2)
      {
          this.amount = 0.05;
          this.name = "Nickel";
      }
      else if (type == 3)
      {
          this.amount = 0.10;
          this.name = "Dime";
      }
      else if (type == 4)
      {
          this.amount = 0.25;
          this.name = "Quarter";
      }
      //are these needed?
      getValue();
      getType();
      getName();
   }

   /**-----------------------------------------------------------------
   *  Flips the coin by randomly choosing a face value.
   */
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   public double getValue()
   {
       return amount;
   }
   
   public int getType()
   {
       return type;
   }
   
   public String getName()
   {
       return name;
   }
   public int setType(int choice)
   {
       return type = choice;
   }
   /**-----------------------------------------------------------------
   *  Returns true if the current face of the coin is heads.
           @return boolean, true if heads
   */
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   /**-----------------------------------------------------------------
   *  Returns the value and type of the coin.
      @return String
   */
   public String toString()
   {
      return name + " " + amount;
   }
}
