class Solution {
    public int maxArea(int[] height) {
        int lindex = 0;
        int rindex = height.length - 1;
        int maxArea = 0;
        int minHeight = 0;

        while(lindex != rindex)
        {
            minHeight = height[lindex] < height[rindex] ? height[lindex] : height[rindex];
            maxArea = maxArea < (minHeight * (rindex - lindex)) ? (minHeight * (rindex - lindex)) : maxArea;

            if(height[lindex] < height[rindex])
                lindex++;
            else
                rindex--;
        }
        

         /*
            timout 


        for(i = 0 ; i < height.length ; i++)
        {
            for(j = i + 1 ; j < height.length ; j++)
            {
                minHeight = height[i] < height[j] ? height[i] : height[j];
                maxArea = maxArea < (minHeight * (j - i)) ? (minHeight * (j - i)) : maxArea;
            }
        }*/
        return maxArea;
    }
}

