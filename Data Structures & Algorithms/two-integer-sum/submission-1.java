class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(target-nums[i]))
                map.put(nums[i],i);
            else{
                result= new int[]{map.get(target-nums[i]), i};
                return result;
            }
        }
        for (Map.Entry<Integer,Integer> i : map.entrySet()) 
            System.out.println("Key = " + i.getKey() +
                             ", Value = " + i.getValue());


        return result;
    }
}
