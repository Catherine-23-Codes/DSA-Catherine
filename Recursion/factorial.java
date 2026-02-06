public class factorial {
    public static int factorial_number(int n) {
        if (n == 0) { // Base case
            return 1;
        }
        int fnm1 = factorial_number(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorial_number(n));
    }
}


/*
TC = O(n)
SC = O(n) 
*/