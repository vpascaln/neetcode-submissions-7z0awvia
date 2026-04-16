class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create map key - string value a list 
        // for each word create in the list create int [26] increment the index by 1
        //arrar.toString() 
        //if string is not in the map add ut with a list 
        //add the current word to the given string 

        Map<String,List<String>> map= new HashMap<>();
        int[] freq;

        for(String str : strs){
            freq = new int[26];

            for (Character c: str.toCharArray()){
                freq[c-'a']++;
            }

            String s = Arrays.toString(freq);

            if(!map.containsKey(s))
                map.put(s, new ArrayList<>());
            
            
            map.get(s).add(str);
        }

        return new ArrayList<> (map.values());
    }  
}
//time complexity O(N* M) N the length of string array m- the length of the longest string
//space complexity O(N*M) M - size of longest string (int[26]) 
// + map - O (N) the bigest each map can have a list 