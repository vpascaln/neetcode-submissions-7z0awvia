class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        PriorityQueue <Map.Entry<Integer,Integer>> heap= new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        int [] result= new int[k];

        for (int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for ( Map.Entry<Integer, Integer> entry : map.entrySet()){
            heap.offer(entry);
            if ( heap.size()>k)
                heap.poll();
        }

        for (int i=0; i <k; i++){   
            result[i]=heap.poll().getKey();

        }






        return result;
        
    }

}
