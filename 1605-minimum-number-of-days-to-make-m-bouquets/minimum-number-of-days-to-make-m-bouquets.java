class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) bloomDay.length < (long) m * k) {
            return -1;
        }

        int left = 1;
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int minDay = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numOfBoquets(bloomDay, mid, k) >= m) {
                minDay = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return minDay;
    }

    public int numOfBoquets(int[] bloomDay, int mid, int k) {
        int numOfBoq = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {
                count++;
            } else {
                count = 0;
            }

            if (count == k) {
                numOfBoq++;
                count = 0;
            }
        }

        return numOfBoq;
    }
}