class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        for(int i = 0 ; i < 9 ; i ++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                if(check(j,i,board) == false)
                    return false;
            }
        }
        return true;
        
    }

        public boolean[] fillArray()
    {
        boolean [] arr = new boolean[10];
        for(int i = 0 ; i < 10 ; i ++)
            arr[i] = false;
        return arr;
    }
        public boolean check(int row, int column,char[][] board)
    {
        boolean [] arr = fillArray();
        //arr[Character.getNumericValue(board[column][row])] = true; 
        //checks rows
        for(int i = 0 ; i < 9 ; i++)
        {
            if(board[column][i] != '.')
            {
                if(arr[Character.getNumericValue(board[column][i])] == false)
                    arr[Character.getNumericValue(board[column][i])] = true;
                else
                    return false;
            }
        }
        //checks columns
        arr = fillArray();
        for(int i = 0 ; i < 9 ; i++)
        {
            if(board[i][row] != '.')
            {
                if(arr[Character.getNumericValue(board[i][row])] == false)
                    arr[Character.getNumericValue(board[i][row])] = true;
                else
                    return false;
            }
        }
        //checks 3x3 table
        arr = fillArray();
        int count_row = 0;
        int count_column = 0;

        for(int i = column - (column % 3); count_column < 3 ; count_column++,i++)
        {
            count_row = 0;
            for(int j = row - (row % 3); count_row < 3; count_row++, j++)
            {
                if(board[i][j] != '.')
                {
                    if(arr[Character.getNumericValue(board[i][j])] == false)
                        arr[Character.getNumericValue(board[i][j])] = true;
                    else
                        return false;
                }
            }
            // if(board[i][row] != '.')
            // {
            //     if(arr[Character.getNumericValue(board[i][row])] == false)
            //         arr[Character.getNumericValue(board[i][row])] = true;
            //     else
            //         return false;
            // }
        }

        return true;
    }
}

