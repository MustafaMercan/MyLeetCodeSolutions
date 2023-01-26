/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let number = [];
    nums.sort((a,b) => a - b);
    
    for(let i = 0 ;i < nums.length - 2 ;i++)
    {
        if(i > 0 && nums[i] === nums[i - 1])
            continue;
        let rightIndex = nums.length - 1;
        let leftIndex = i + 1;

        while(leftIndex < rightIndex)
        {
            const sum = nums[i] + nums[leftIndex] + nums[rightIndex];
            if(sum < 0)
                leftIndex++;
            else if(sum > 0)
                rightIndex--;
            else
            {
                number.push([nums[i],nums[leftIndex],nums[rightIndex]]);
                leftIndex++;
                while(nums[leftIndex] === nums[leftIndex - 1] && leftIndex < rightIndex)
                    leftIndex++;
                    
            }

            // -2 -1 -1 0 1 2 3
        }
        
    }
    return number;
};