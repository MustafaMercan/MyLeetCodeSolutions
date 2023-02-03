int divide(int dividend, int divisor){
    double tmp;
    double tmp2;
    int res = 0;

    
    tmp = (double)dividend / (double)divisor;
    
    tmp2 = ((double)dividend / (double)divisor);
    if((double)tmp2 - (double)tmp > 0.5)
        res = 1;
    if(tmp2 < 0)
        res*= -1;
    tmp += res;
    
    if(tmp == 2147483648.0 )
        return 2147483647;
    return tmp;
}