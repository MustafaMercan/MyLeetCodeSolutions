class Solution {
    boolean polindrome_check(String str)
    {
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev))
            return true;
        return false;
    }
    String polindrom_substr(String str,int left, int right)
    {
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
        {
            left--;
            right++;
        }
        return str.substring(left + 1,right);
    }
    public String longestPalindrome(String s) {

        String result = "";
        String tmp = "";
        
        if(s.length() <= 1)
            return s;
        for(int i = 0 ; i < s.length() ; i++)
        {
            tmp = polindrom_substr(s,i,i);
            result = tmp.length() > result.length() ? tmp : result;
            tmp = polindrom_substr(s,i,i+1);
            result = tmp.length() > result.length() ? tmp : result;
        }
    
        // if(s.length() <= 1)
        //     return s;
        // if(polindrome_check(s))
        //     return s;
        // for(int i = 0 ; i < s.length() ; i ++)
        // {
        //     for(int j = i + 1 ; j <= s.length(); j++)
        //     {
        //         tmp = s.substring(i,j);
        //         if(polindrome_check(tmp))
        //         {
        //             result = result.length() < tmp.length() ? tmp : result ;
        //         }
        //     }
        // }

        

        return result;   
    }
}

