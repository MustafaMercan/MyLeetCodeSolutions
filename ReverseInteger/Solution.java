class Solution {
    public int reverse(int x) {
        
        int op = 1;
        String str;
        String rev = "";
        long test;

        if(x < 0)
        {
            op = -1;
            x*=-1;
        }
        if(x == -2147483648)
            return 0;
        

        System.out.println(x);
        str = Integer.toString(x);

        for(int i = 0 ; i < str.length() ; i++)
        {
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
        if(Long.parseLong(rev) > 2147483647 || Long.parseLong(rev) < -2147483648)
            return 0;

        x = Integer.parseInt(rev);
        x*=op;
        return x;

        
    }
}

