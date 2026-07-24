class Solution {
    public String longestPalindrome(String s) {

        int maxLen = 0;
        String ans = "";

        for(int i = 0; i < s.length(); i++){

            for(int j = i; j < s.length(); j++){

                if(solve(s, i, j)){

                    if(j - i + 1 > maxLen){
                        maxLen = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }

        return ans;
    }

    private boolean solve(String s, int i, int j){

        while(i <= j){

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}