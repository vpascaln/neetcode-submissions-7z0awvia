class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        List<Map.Entry<Integer, Integer>> list; 
        int [] result= new int[k];


        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        list= new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue()-a.getValue());

        for (int i=0; i<k; i++){
            result[i]=list.get(i).getKey();
        }


        return result;
        
    }
    //time complexity is O(n log n)
    // O(n) to build the HashMap
    // O(n log n) to sort the list
    // O(k) to build the result

    // space complexity is O (n)
}
