//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address implements Comparable
{
   private String streetAddress, city, state;
   private int zipCode;
   
   //hashes are unique identifiers and for speed

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }

   public int compareTo(Object other)
   {
       Address obj = (Address) other;





       return 0;

   }

     /**
         creates a hash number
         array size must be size of hash table
    */
      public int hashCode ( )

      {
          int hash_num = 0;

          for (int i = 0; i<streetAddress.length(); i++)
          {
              hash_num += streetAddress.charAt(i);

          }

          int factor = 31;
          

          for (int i = 0; i<city.length(); i++)
                hash_num +=city.charAt(i);
        hash_num += zipCode;
        
        hash_num *= factor;






        return hash_num;
      }




   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
