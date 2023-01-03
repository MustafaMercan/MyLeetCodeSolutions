class Solution {
    public String getPermutation(int n, int k) {
        

        List <Integer> numbers = new ArrayList<>();
        for(int i = 1 ; i <= n ; i ++)
            numbers.add(i);
        int fac = 1;
        for(int i = 2 ; i <= n; i++)
            fac*=i;
        
        StringBuilder result = new StringBuilder();

        k--;
        for(int i = n; i> 0 ; i--)
        {
            fac /= i;
            int index = k /fac;
            result.append(numbers.get(index));
            numbers.remove(index);
            k -= index * fac;
        }
        return result.toString();








        /*String str = "";
        for(int i = 1 ; i <= n ; i++)
            str += String.valueOf(i);
        List <String> permutations = new ArrayList<>();

        //return backTracking(str,k-1);

        permutations(str,0,str.length(),permutations);
        sort(permutations);
        
        return permutations.get(k - 1);*/
    }
    /*
    public void sort(List <String> data)
    {
        int j;
        String currentItem;
        for(int i = 1 ; i < data.size() ; i++)
        {
            j = i - 1;
            currentItem = data.get(i);

            while(j >= 0 && data.get(j).compareTo(currentItem) > 0)
            {
                data.set(j + 1,data.get(j));
                j--;
            }
            data.set(j + 1,currentItem);
        }

    }
    public void permutations(String str,int startIndex, int endIndex,List <String> permutations)
    {
        if(startIndex == endIndex)
            permutations.add(str);
        else
        {
            for(int i = startIndex ; i < endIndex ; i ++)
            {
                str = swap(str,startIndex,i);

                permutations(str,startIndex + 1, endIndex, permutations);

                str = swap(str,startIndex ,i);
            }

        }


    }
    public String swap(String str,int index1,int index2)
    {
        /*
            tmp = str[index1]
            str[index1] = str[index2]
            str[index2] = tmp;
            mu (s)ta(f)a 
            muftafa
        
        char tmp = str.charAt(index1);
        str = str.substring(0,index1) + str.charAt(index2) + str.substring(index1 + 1);
        str = str.substring(0,index2) + tmp + str.substring(index2 + 1);
        return str;
    }

    //backTracking method time limit exceeded :(((
    /*public String backTracking(String str,int index)
    {
        List<String> permutations = new ArrayList<>();
        backTracking("",str,permutations);
        return permutations.get(index);
        System.out.println(permutations.get(index));
    }
    public void backTracking(String prefix, String suffix, List <String> permutations)
    {
        if(suffix.length() == 0)
            permutations.add(prefix);
        else
        {
            for(int i = 0; i < suffix.length() ; i ++)
            {
                backTracking(prefix + suffix.charAt(i),suffix.substring(0,i) + suffix.substring(i + 1),
                                                                                    permutations);
            }
        }
        //abcd
        //step 0
        //prefix -> a
        //suffix -> bcd 

        //prefix -> ab
        //suffix -> cd


        //abcd
        //prefix -> b
        //suffix a + cd


    }*/
}

