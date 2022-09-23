import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n;ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = Solution.aVeryBigSum(n, ar);
        System.out.println(result);;
    }
}