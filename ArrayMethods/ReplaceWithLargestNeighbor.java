import java.util.Random;

public class ReplaceWithLargestNeighbor
{
   public void replaceWithLargestNeighbor(int[] arr)
   {
      // Start loop at one, and stop before the end
      int temp;
      int count =0;
      for (int s: arr)
      {
         if (count == 0)
             {
                 if (arr[count+1] > arr[count])
                     {
                         temp = arr[count];
                         arr[count] = arr[count+1];
                         arr[count+1] = temp;
                     }
             }
         else if (arr[count] < 9)
         {
                 if (arr[count-1] > arr[count+1])
                     {
                         temp = s;
                         arr[count] = arr[count-1];
                         arr[count-1] = temp;
                     }
                 else
                 {
                     temp = s;
                     arr[count] = arr[count+1];
                     arr[count+1] = temp;
                 }
             }
         else
         {
            if (arr[count-1] > arr[count])
                 {
                     temp = s;
                     arr[count] = arr[count-1];
                     arr[count] = temp;
                 }
         }
         count++;
        }
      

   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      ReplaceWithLargestNeighbor util = new ReplaceWithLargestNeighbor();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Replace with largest neighbor
      util.replaceWithLargestNeighbor(randoms);

      // Print again to see new elements.
      for (int i = 0; i < 10; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
