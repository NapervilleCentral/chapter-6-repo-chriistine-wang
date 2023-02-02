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
    
    farm.add("cow");farm.add("chicken");
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
    for (int i = 0; i<farm.size();i++)
    {
        //if(farm.get(i).equals("chicken"))
            //count++;

        if (farm.get(i).equals("chicken"))
        {
            farm.remove(i); // if u remove smt, size shrink
        }
        i--;
        //When u dont remove increm
    }

    System.out.println("There are " + count+ " chickens");

    System.out.println(farm);
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

}// end of class











