
/**
 * Write a description of class MagicSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquare
{
    private int[][] square;
    
    public MagicSquare(int [][] array)
    {
        square = array;
    }
    
    public boolean isMagic()
    {
        
    }
    
    public int getMagicNum()
    {
        
    }
    
    public void setMagicSquare(int [][] array)
    {
        
    }
    // support methods
    
    public int addRow(int row)
    {
        
    }
    
    public int[] addRows()
    {
        
    }
    
    public int addColumn(int col)
    {
        int sum = 0;
        for (int i = 0; i < square.length-1; i++)
        {
            sum += square[i][col];
            
        }
    }
    
    public int[] addColumns()
    {
        
    }
    
}
