class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
    
    
        Map <Character, Integer> sMap= new HashMap<>();
        Map <Character, Integer> tMap= new HashMap<>();



        // for (Character x : s.toCharArray()) {
        //     sMap.merge(x, 1, Integer::sum);
        // }
        // for (Character x : t.toCharArray()) {
        //     tMap.merge(x, 1, Integer::sum);
        // }

        for(Character x : s.toCharArray()){
            if (sMap.containsKey(x)){
                sMap.put(x, sMap.get(x)+1);
                // os there a vetter way to do this?
            }else
                sMap.put(x, 1);
        }
        for(Character x : t.toCharArray()){
            if (tMap.containsKey(x)){
                tMap.put(x, tMap.get(x)+1);
            }
            else
                tMap.put(x, 1);
        }

        for (Map.Entry<Character, Integer> i : sMap.entrySet()) {
          if ( !i.getValue().equals(tMap.get(i.getKey())))
            return false;
        }

        return true;
    }
}
