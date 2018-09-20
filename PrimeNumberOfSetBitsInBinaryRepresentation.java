class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
        if(isPrime(ones(i))){
            count++;
        }
         }
    return count;
}
    
    public boolean isPrime(int num) {
    boolean ans = true;
    if (num == 1) {
        return false;
    }
    for (int i = 2; i <= (int)Math.sqrt(num); i++) {
        if (num % i == 0) {
            ans = false;
            break;
        }
    }
    return ans;
}
    public int ones(int num) {
    int count = 0;
    while (num != 0) {
        count += (num & 1);
        num >>= 1;
    }
    return count;
}
}