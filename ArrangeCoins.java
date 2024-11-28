class Solution {
    public int arrangeCoins(int n) {
          int res = 0, l = 0, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long coins = (long) mid * (mid + 1) / 2;
            if (coins == n) return mid;
            else if (coins > n) r = mid - 1;
            else {
                res = mid;
                l = mid + 1;
            }
        }
        return res;
        
    }
}