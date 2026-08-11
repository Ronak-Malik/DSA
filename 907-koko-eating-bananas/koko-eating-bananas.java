class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for(int pile : piles ){
            right = Math.max(right, pile);
        }

        while(left < right ){
            int mid = left + (right - left )/2;

            if(caneat(piles,mid,h)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left ;
        
    }
    public boolean caneat(int[]piles , int mid , int h ){
        int actualhrs = 0;

        for(int pile : piles){
            actualhrs += pile/mid;
            if(pile%mid != 0){
                actualhrs ++;
            }
        }
        if( actualhrs <= h){
            return true;
        }

        return false;
    }
}