/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    if(nums.indexOf(target) != -1)
        return nums.indexOf(target);
    else
    {
        let i;
        i = 0;
        while(i < nums.length && nums[i] < target){i++;}
        return i ;

    }
    
};
