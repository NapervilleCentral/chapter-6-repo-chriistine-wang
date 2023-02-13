import java.util.ArrayList;//required for AL
import java.util.Scanner;
import java.io.*;//required for File i/o

public class WordList2022
{
  public static void main (String [] args) throws IOException // required for File IO
   {

       ArrayList myList = new ArrayList();;
       Scanner scanFile = new Scanner(new File("words.txt"));
       int count = 0;
       while(scanFile.hasNext())
       {
           
           String word = scanFile.nextLine();
           if(word.length() == 6){
               myList.add(word);
               count++;}
       }
       
       for (int i=myList.size()-1; i>=0;i--)
       {
            int s = i-1;
            if (s > 0)
                if(myList.get(i).equals(myList.get(s)))
                 myList.remove(i);
       }
       
       System.out.println(myList);
       System.out.println(count);
       System.out.println();
       System.out.println(myList);
       System.out.println(myList.size());
       count = 0;
       for (int i=myList.size()-1; i>=0;i--)
       {
            count++;
            int s = i-1;
            String word = (String)myList.get(i);
            if(word.contains("aa") || word.contains("ii") || word.contains("uu"))
                myList.remove(i);
               
       }
       System.out.println();
       System.out.println(myList);
       System.out.println(myList.size());
    }
}