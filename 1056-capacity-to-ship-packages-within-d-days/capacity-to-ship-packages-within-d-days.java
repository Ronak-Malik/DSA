class Solution { 
    public int shipWithinDays(int[] weights, int days) { 
        int left = 0; 
        int right = 0; 
 
        for(int weight : weights){ 
            left = Math.max(weight, left); 
            right += weight; 
        } 
 
        while(left <= right){ 
            int mid = left + (right - left) / 2; 
 
            if(capacity(weights, mid, days)){ 
                right = mid - 1; 
            }else{ 
                left = mid + 1; 
            } 
        } 
 
        return left; 
    } 
 
    public boolean capacity(int[] weights, int mid, int days){ 
        int din = 1; 
        int packageWeight = 0; 
 
        for(int weight : weights){ 
            if(packageWeight + weight > mid){ 
                din++; 
                packageWeight = weight; 
            }else{ 
                packageWeight += weight; 
            } 
        } 
 
        return din <= days; 
    } 
}