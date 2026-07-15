class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            num.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(num.containsKey(diff) && num.get(diff) != i){
                    return new int[]{i, num.get(diff)};
                }
            }        
        return new int[0];
    }
}