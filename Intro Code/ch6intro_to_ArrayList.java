/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;//yes AL are in util

public class ch6intro_to_ArrayList

{
    final static int MAX = 20;

public static void main (String[] args)
{
    //ArrayList notes
    /**/
    // <> indicates the type of ArrayList
    //diamond syntax
    ArrayList <String> farm = new ArrayList<>();
    //dont set size

    //ArrayList stuff = new ArrayList();//enter mix types String, Student, Address
    //String word = (String)stuff.get(0); //needs to cast it
    
    //AL only takes objects
    // ArrayList<int> grades = new ArrayList<>(); doesnt work, do Integer
    
    farm.add("cow");farm.add("chicken"); //adds to end
    for (int i = 0; i<20;i++)
    {
        farm.add("cow");
        farm.add("chicken");
        farm.add("chicken");
        farm.add("duck");
        farm.add("horse");

    }
    farm.add("dog");farm.add("dog");farm.add("dog");
    farm.add("pig");farm.add("pig");farm.add("pig");
    farm.add("pig");farm.add("pig");farm.add("pig");

    System.out.println(farm);
    System.out.println(farm.size());
    
    //.length is constant., .size() is method, bc for AL length changing
    
    int count = 0;
    for (int i = 0; i<farm.size();)//i++)
    {
        //if(farm.get(i).equals("chicken"))
            //count++;
        /*
        if (farm.get(i).equals("chicken"))
        {
            farm.remove(i); // if u remove smt, size(index) shrink 
            //i--;
        }
        else
            i++;
        //increase only when u dont remove */
    }
        
    //collapses, moves w u
    for (int i = farm.size()-1; i>=0; i--)
    {
        if (farm.get(i).equals("chicken"))
        {
            farm.remove(i);
        }
    }
    System.out.println("There are " + count+ " chickens");
    
    //set method will replace at index and return the object at said index
    String animal = farm.set(5, "Llama");
    //add (index, obj) add at said index
    farm.add(7, "llama");    
    System.out.println(animal + "===" +farm);
    
    ArrayList <Integer> numbers = new ArrayList<>();
    
    insertInOrder(numbers,2);
    insertInOrder(numbers,3);
    insertInOrder(numbers,1); 
    
    System.out.println(numbers);

    /*
    ArrayList <String> list = new ArrayList<>();

    //ArrayList <int> list1 = new ArrayList<>();// no primitive data types

    ArrayList <Integer> list1 = new ArrayList<>();

    ArrayList <CD> mycds = new ArrayList<>();

    for(int i = 0; i<3; i++)
    {

    mycds.add(new CD("Wilco","Jeff Tweety",12.99,16);
    mycds.add(new CD("Throwup","Britiny Spears",12.99,16);
    mycds.add(new CD("Oxygen","CatFish and the Bottlemen",12.99,16);

    System.out.print(mycds);

    }/* */

}// end of main
public static void insertInOrder(ArrayList <Integer> numbers, Integer num)
    {
        if (numbers.size() == 0)
        {
            numbers.add(num);
            return;
        }
        
        
            boolean found = false;
            for(int i = 0; (i<numbers.size() && found == false); i++){
                if (numbers.get(i) > num)
                {
                    numbers.add(i, num);
                    return;
                }
            }
            
            numbers.add(num); //(goes at end anyway);
        
    }
}












