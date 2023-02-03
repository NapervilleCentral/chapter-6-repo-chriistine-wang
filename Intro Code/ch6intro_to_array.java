/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;


public class ch6intro_to_array

{
    final static int MAX = 20;
    
    public static void main (String[] args)
        {
        //name arrays plural
        //arrays are objects
        // so pass by reference, makes it faster (1 obj vs 19 pieces of info)
        
                //mathy useful = new mathy();
                int x = 50;
                int[] nums = new int[20];
                int[] values = new int[MAX];
                //.length not a method, its public data/constant
                // once array made, cant modify size
                int[] oddnums = new int[nums.length];
                int[] evennums = new int[nums.length];
                int[] negnums = new int[MAX];
        
               Random gen = new Random();
               
                //for each loop
        
               // acts as int, will be passed by value
               nums[0] = 5;
                for(int i = 0; i < nums.length; i++)
                {
                    nums[i] = gen.nextInt(100)-50;
                }
        /*
         
                for each loop will only access the entire array
        
                /*
                
        */  for (int s: nums)
              System.out.println(s);
        
        System.out.println("-------Odds-----------");
        useful.getOdd(nums, oddnums);
        for (int s: oddnums)
            System.out.println(s);
        
            System.out.println("-------evens-----------");
        useful.getEven(nums);
        for (int s: evennums)
            System.out.println(s);
        
        int [] nums2 = {1,-5,6,89,54,-3,4,24,70,77};
        useful.getOdd(nums2,oddnums);
        for(int s: oddnums)
            System.out.println(s+"*");
            
            //go over Searches Monday
            
        
            
                //searches array for that value, when it finds val, returns index of location (8th num in arr)
                int look = 70;
                System.out.println("expected 8"  );
                System.out.println(Searches.linearSearch(nums2,look)  );
                Sorts.selectionSort(nums2);
                look = 55;
                System.out.println("expected -1");
                System.out.println(Searches.binarySearch(nums2,look)  );
        
        
        /*
        
        
        
        
                //System.out.println("----------SORTING-----------"  );
        
        
        
        
        
        
        /*
                System.out.println("Enter a number");
                int find = Keyboard.readInt();
        
                System.out.println(Searches. binarySearch(num,find));
        
           /*
        
        
        
        
        
        
        
         /**/
                //make a two dimensional array
                int [][] table = new int [5][10]; // java: row comes first/row major
                                     //row,  column
        
                // Load the table with values
                for (int row=0; row < table.length; row++)
                   for (int col=0; col < table[row].length; col++)
                     table[row][col] = row * 10 + col;
        
                //print the table
                 for (int row=0; row < table.length; row++)
                 {
                     for (int col=0; col < table[row].length; col++)
                          System.out.print (table[row][col] + "\t");
        
                        System.out.println();
                   }
        
        
            // make a 2d array with an iniitalizer list.
            // array of arrays
            //print the length of row and col
        /**/
            int [][] scores = {{1,2,3},//6
                                {2,2,3},//7
                                {3,2,3},//8
                                {4,2,3}};  //9
                                
            int []rowscores = scores[1];
            for (int s: rowscores)
                System.out.print(s+",");
        
            //how many columns // r&c start at 0
            System.out.println(scores[0].length+"col");
            //how many rows
            System.out.println(scores.length+"row");
        
            //sum entire 2D array
            System.out.print("The sum of this array is" );
        
            //sum a row of 2D array
           // System.out.print("The sum of row " + helpful.sumOneRow2DArray());
            
            //System.out.println(scores.
        
        
        
        
        
        
        

}

   public static int[] doubleSize(int[] array)
   {


        return array;


   }

//passing int by value
   public static void foo(int x)
   {

       x = 100;
   }


//arrays are passed by reference
    public static void foo(int [] num)
      {

          num[0] = 100;

      }

    /*


   public static void odd()
   {

       int count =0;


   }// end of odd /**/
   
}// end of class











