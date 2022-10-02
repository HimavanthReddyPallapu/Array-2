// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

import java.util.Arrays;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> res=new ArrayList<Integer>();
        
        Arrays.sort(nums);
        
        
        
        
        int[] a=new int[nums.length+1];
        
        
        
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]=nums[i];
        }
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==0)
            {
                res.add(i);
            }
            
        }
        
        
        
        
        
        
    return res;
    }
}
