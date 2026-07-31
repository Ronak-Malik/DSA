class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> winMap = new HashMap<>();

        
        for (char ch : s1.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int k = s1.length();

        for (int right = 0; right < s2.length(); right++) {

            char ch = s2.charAt(right);
            winMap.put(ch, winMap.getOrDefault(ch, 0) + 1);

            
            if (right - left + 1 == k) {

                
                if (winMap.equals(sMap)) {
                    return true;
                }

                
                char leftChar = s2.charAt(left);
                winMap.put(leftChar, winMap.get(leftChar) - 1);

                if (winMap.get(leftChar) == 0) {
                    winMap.remove(leftChar);
                }

                left++;
            }
        }

        return false;
    }
}