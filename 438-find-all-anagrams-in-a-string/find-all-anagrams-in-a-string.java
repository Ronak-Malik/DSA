class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> winMap = new HashMap<>();

        
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int k = p.length();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            winMap.put(ch, winMap.getOrDefault(ch, 0) + 1);

            
            if (right - left + 1 == k) {

                
                if (winMap.equals(pMap)) {
                    ans.add(left);
                }

                
                char leftChar = s.charAt(left);

                winMap.put(leftChar, winMap.get(leftChar) - 1);

                if (winMap.get(leftChar) == 0) {
                    winMap.remove(leftChar);
                }

                left++;
            }
        }

        return ans;
    }
}