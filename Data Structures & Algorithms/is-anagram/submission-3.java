class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
    
    
        Map <Character, Integer> sMap= new HashMap<>();
        Map <Character, Integer> tMap= new HashMap<>();

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
          for (Map.Entry<Character, Integer> i : tMap.entrySet()) 
            System.out.println("Key = " + i.getKey() +
                             ", Value = " + i.getValue());
            for (Map.Entry<Character, Integer> i : sMap.entrySet()) 
            System.out.println("SKey = " + i.getKey() +
                             ", SValue = " + i.getValue());


        for (Map.Entry<Character, Integer> i : sMap.entrySet()) {
            System.out.println("Reached here Smap " +i.getKey() + " "+i.getValue());
            System.out.println("Reached here Tmap " +tMap.get(i.getKey()));
            System.out.println("Reached here map " +tMap.get(i.getKey()) + " "+i.getValue());
           // System.out.println(tMap.get(i.getKey()).equals( i.getValue()));
            System.out.println( i.getValue().equals(tMap.get(i.getKey())));
            System.out.println(1913 != 1913);
          if ( !i.getValue().equals(tMap.get(i.getKey())))
            return false;
        }
        System.out.println("~~~~~~Reached here");
      
        return true;
    }
}
