class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set=new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        return nums.length != set.size();
        
    }
}