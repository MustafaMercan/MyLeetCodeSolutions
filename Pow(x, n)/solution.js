/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {

    let step = x;
    let res = 1;
    if(n == 0)
        return 1;
    if(x == 1)
        return 1;
    if(x == -1)
    {
        if(n % 2 == 0)
            return 1;
        return -1;
    }
    if(n < 0)
    {
        n*=-1;
        step = 1/x;
    }
    for(let i = 0 ; i < n ; i++ )
        res *= step; 
    return res;
    /*
        RangeError: Maximum call stack size exceeded
        x->0.00001
        n->2147483647
    if(n == 0)
        return 1;
    else if(n < 0 )
    {
        return 1 / myPow(x, n * -1);
    }
    else
        return x * myPow(x, n-  1 );
    */
};