class Solution {
    public int[] twoSum(int[] nums, int t) {
        //*********קוד נחמד רק למערך ממוין**********///
        //    Arrays.sort(nums);
        //    int i=0, j;
        //    for(j=nums.length-1;j>0;j--){
        //     if (j<t) break;
        //    }
        //    while(i<j){
        //     if(nums[i]+nums[j]==t) return new int[]{i,j};
        //     if(nums[i]+nums[j]>t) j--;
        //     else if(nums[i]+nums[j]<t) i++;
        //    }
        //    return new int[]{i,j};
        Map<Integer, Integer> map= new HashMap<>();
        int dif;
        for(int i=0;i<nums.length; i++){
            dif= t-nums[i];
            if(map.containsKey(dif)) return new int[] {map.get(dif),i};
            map.put(nums[i],i);
        } 
        return new int[] {};
    }
}
