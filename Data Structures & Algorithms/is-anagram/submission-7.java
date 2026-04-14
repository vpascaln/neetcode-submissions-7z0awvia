class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
    
    
        Map <Character, Integer> sMap= new HashMap<>();
        Map <Character, Integer> tMap= new HashMap<>();


        for(Character x : s.toCharArray()){
                sMap.put(x, sMap.getOrDefault(x,0)+1);
            
        }

        for(Character x : t.toCharArray()){
                tMap.put(x, tMap.getOrDefault(x,0)+1);
            
        }

        for (Map.Entry<Character, Integer> i : sMap.entrySet()) {
          if ( !i.getValue().equals(tMap.get(i.getKey())))
            return false;
        }

        return true;
    }
}
