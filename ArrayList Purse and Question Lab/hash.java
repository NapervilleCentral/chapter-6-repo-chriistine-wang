
/**
 * Write a description of class notes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class hash
{
    public static void main (String[] args)
    {
        Account p1 = new Account ("Homer Simpson" ,0001, 1090.45);
        Account p2 = new Account ("Boomer Simpson", 0002, 786.54);
        Account p3  = new Account ("Bart Simpson", 1564, 4571.60);
        Account p4 = new Account ("Liz Wilson", 1349, 2034.52);
        Account p5 = new Account ("Jack Hagested", 2389, 280.67);
        Account p6 = new Account ("Jack Smith", 2391, 1008.53);
        Account p7 = new Account ("Emy Hayes", 3598, 1260.84);
        Account p8 = new Account ("Doug Dralle", 4562, 5783.90);
        Account p9 = new Account ("Eric Willhelm", 3208, 3420.75);
        Account p10 = new Account ("Julie Noris", 4568, 9041.49);
        
        Account [] people = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        
        Sorts.insertionSort(people);
        
        
        for (Account a : people)
        {
            System.out.println(a + ", ");
        }
        
        
        System.out.println("\n________________________________________\n");
        
        Account [] hashes = new Account[7 * people.length];
        
        for (int i = 0; i < people.length; i++)
        {
            hashes[people[i].hashCode() % 70] = people[i];
        }
        
        for (Account p : hashes)
            System.out.println(p);
        
        System.out.println(p9.compareTo(p10));
    }
}