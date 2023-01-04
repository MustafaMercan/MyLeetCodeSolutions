/**
 * @param {character[][]} board
 * @return {boolean}
 */
 const fill_true_array = () =>{
     let arr = [];
     for(let i = 0; i < 9 ; i++)
        arr.push(true);
    return arr;
 }
 const check_3x3 = (board,i_index,j_index) =>{
     let check_arr = [];
     let i = 0;
     let j = 0;
     check_arr = fill_true_array();
     for(i = i_index; i < i_index + 3 ; i++)
     {
         for(j = j_index; j < j_index + 3 ;j ++)
         {
            if(!isNaN(parseInt(board[i][j])))
            {
                if(check_arr[parseInt(board[i][j])] == false)
                    return false;
                else
                    check_arr[parseInt(board[i][j])] = false;
            }   
         }
     }
     return true;
     


 };
var isValidSudoku = function(board) {
    let index = 0;
    let tmp;
    if(board.length != 9)
        return false;
    for(let i = 0; i < board.length ; i++)
    {
        tmp = fill_true_array();
        for(let j = 0 ; j < board[i].length ; j++)
        {
            if(board[i].length != 9)
                return false;
            if(i % 3 == 0 && j % 3 == 0)
            {
                if(!check_3x3(board,i,j))
                {
                    return false;
                }
            }
            if(!isNaN(parseInt(board[i][j])))
            {
                if(tmp[parseInt(board[i][j])] == false)
                    return false;
                else
                    tmp[parseInt(board[i][j])] = false;
            }
        }
    }
    for(let j = 0; j < board.length ; j++)
    {
        tmp = fill_true_array();
        if(board.length != 9)
            return false;
        for(let i = 0 ; i < board[j].length ; i++)
        {
            if(board[j].length != 9)
                return false;
            if(!isNaN(parseInt(board[i][j])))
            {
                if(tmp[parseInt(board[i][j])] == false)
                    return false;
                else
                    tmp[parseInt(board[i][j])] = false;
            }
        }
    }
    return check_3x3(board);
};

