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
            System.out.println("\nfreq.toString() "+Arrays.toString(freq));

            for (Character c: str.toCharArray()){
                freq[c-'a']++;
            }

            String s = Arrays.toString(freq);
            System.out.println("str "+str);
            System.out.println("s "+s);

            if(!map.containsKey(s))
                map.put(s, new ArrayList<>());
            
            
            map.get(s).add(str);
            System.out.println("Map.get "+map.get(s));
        }

        for( Map.Entry entry: map.entrySet()){
            System.out.println("Entry "+entry);
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        

        return new ArrayList<> (map.values());
    }  
}
