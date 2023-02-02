
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
        int[] rowsCheck = addRows();
        int[] colsCheck = addColumns();
        int[] diagCheck = addDiagonals();
        int target;
        boolean check = false;
        
        for (int i = 0; i < rowsCheck.length-1; i++)
        {
            target = rowsCheck[0];
            
            if (target == rowsCheck[i])
            {
                check = true;
            }
            else
            {
                check = false;
            }
        }
        for (int i = 0; i < colsCheck.length-1; i++)
        {
            target = colsCheck[0];
            
            if (target == colsCheck[i])
            {
                check = true;
            }
            else
            {
                check = false;
            }
        }
        for (int i = 0; i < diagCheck.length-1; i++)
        {
            target = diagCheck[0];
            
            if (target == diagCheck[i])
            {
                check = true;
            }
            else
            {
                check = false;
            }
        }
        
        return check;
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
        int target;
        for (int i = 0; i < numRows; i++)
        {
            rowSums[i] = addRow(i);
        }
        for (int i = 0; i < rowSums.length; i++)
        {
            target = rowSums[i];
            
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
    
    public int[] addDiagonals()
    {
        int diagSum = 0;
        int diagSum2 = 0;
        
        for (int i=0; i < numCols; i++, i++)
        {
            diagSum += square[i][i];
        }
        for (int i=numCols -1; i > 0; i--)
        {
            System.out.print(i);
            diagSum2 += square[i][i];
        }
        
        int[] diagSums = {diagSum, diagSum2};
        
        return diagSums;
    }
}
