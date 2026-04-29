class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        List<Integer> [] list = new List [nums.length+1];
        HashMap<Integer, Integer> mp=new HashMap<>();
        for ( int x : nums )
            mp.put(x, mp.getOrDefault(x,0)+1);
        for ( int i=0; i<list.length; i++ )
            list[i]=new ArrayList<>();

        for (Map.Entry<Integer, Integer> map: mp.entrySet()){
            list[map.getValue()].add(map.getKey());
        }
        int j=0;
        for ( int i= list.length-1; i >=0 && j<k; i-- ){

            for(int x: list[i]){
                result[j++]=x;
                if (j==k)
                    return result;
            }
        }
        return result;
    }

}
