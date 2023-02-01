
/**
 * Write a description of class MagicSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquare
{
    private int[][] square;
    private int magicNum;
    private int numRows, numCols;
    
    public MagicSquare(int [][] array)
    {
        square = array;
        numRows = array.length;
        numCols = array[0].length;
    }
    
    public boolean isMagic()
    {
        
        
    }
    
    public int getMagicNum()// gets the magic number of 1 row/col/diag, etc
    {
        return magicNum;
    }
    
    public void setMagicSquare(int [][] array)
    {
        
    }
    // support methods
    
    public int addRow(int row)
    {
        int rowSum = 0;
        for (int col = 0; col < numRows; col++)
        {
            rowSum += square[row][col];
        }
        return rowSum;
    }
    
    public int[] addRows()
    {
        int cache = 0;
        for (int i = 0; i < numRows; i++)
        {
            if (addRow(i) == cache)
            {
                
            }
            else
            {
                
            }
            cache = this.addRow(i);
            
        }
    }
    
    public int addColumn(int col)
    {
        int colSum = 0;
        for (int i = 0; i < square.length-1; i++)
        {
            colSum += square[i][col];
    
        }
    }
    
    public int[] addColumns()
    {
        
    }
    
}
