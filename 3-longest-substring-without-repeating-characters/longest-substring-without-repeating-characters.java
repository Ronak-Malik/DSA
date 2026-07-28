class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = 0;
        int left = 0;
        for(int right = left ; right < s.length(); right ++){
            char ch = s.charAt(right);
            

            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char leftch = s.charAt(left);
                map.put(leftch, map.get(leftch)-1);
                if(map.get(leftch)==0){
                    map.remove(leftch);
                }
                left++;


            }
            len= Math.max(len, right - left+1);
            
        }

        return len;
        
    }
}