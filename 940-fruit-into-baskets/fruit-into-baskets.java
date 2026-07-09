class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 2;
        int total = 0;
        int i = 0;

        for(int j = 0; j<fruits.length; j++){
            total += 1;
           map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

           if(map.size() > k){
            total -= 1;
            map.put(fruits[i], map.get(fruits[i])-1);

            if(map.get(fruits[i])==0){
                map.remove(fruits[i]);
            }
            i++;
           }
        }

        return total;

        
    }
}