
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
        square = array;
        numRows = array.length;
        numCols = array[0].length;
    }
    // support methods
    
    public int addRow(int row)
    {
        int rowSum = 0;
        for (int i = 0; i < numCols; i++)
        {
            rowSum += square[row][i];
        }
        return rowSum;
    }
    
    public int[] addRows()
    {
        int[] rowSums = new int[numRows];
        
        for (int i = 0; i < numRows; i++)
        {
            rowSums[i] = addRow(i);
        }
        return rowSums;
    }
    
    public int addColumn(int col)
    {
        int colSum = 0;
        for (int i = 0; i < numRows; i++)
        {
            colSum += square[i][col];
            
        }
        return colSum;
    }
    
    public int[] addColumns()
    {
        int[] colSums = new int[numCols];
        for (int i = 0; i < numCols; i++)
        {
            colSums[i] = addColumn(i);
        }
        return colSums;
    }
    
    public int addDiagonal(int Diag)
    {
        int diagSum = 0;
        int row = 0, col = 0;
        for (int i = 0; i < numCols; row++, col++, i++)
        
    }
    
    public int[] addDiagonals()
    {
        
    }
}
