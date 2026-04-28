class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        char []ch=new char[26];
        Map<String, List<String>> map= new HashMap<>();
        String temp="";

        for (String s: strs){
            for (char c: s.toCharArray()){
                ch[c-'a']++;
                //may have to reset
            }
            temp=new String(ch);

            System.out.println(" "+s+" "+temp);
            if (!map.containsKey(temp))
                map.put(temp, new ArrayList<>());
            
            map.get(temp).add(s);
            ch=new char[26];
        }
        result=new ArrayList(map.values());
     
     return result;
    }  
}
