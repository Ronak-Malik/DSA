class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 2;
        int ans = 0;
        int i = 0;

        for(int j = 0; j<fruits.length; j++){
            
           map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

           while(map.size() > k){
            
            map.put(fruits[i], map.get(fruits[i])-1);

            if(map.get(fruits[i])==0){
                map.remove(fruits[i]);
            }
            i++;
           }
           ans = Math.max(ans, j-i+1);
        }

        return ans;

        
    }
}