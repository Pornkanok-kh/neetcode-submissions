class Solution {
    /*use for loop collect num in length 
    and check if there is duplicated number, 
    return true if it is and return false if it not
    => optimize to use hash set instead*/
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}