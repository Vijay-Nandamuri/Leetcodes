public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] prime = new boolean[n];
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        CountPrimes s = new CountPrimes();

        System.out.println(s.countPrimes(10)); 
        System.out.println(s.countPrimes(0));  
        System.out.println(s.countPrimes(1));  
    }
}