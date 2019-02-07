import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int count = 0;
        while (count < test) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int sum = in.nextInt();
            System.out.println("Found " + CoinChange(arr, sum, n) + " " + " ways");
            count++;
        }
    }

    public static int CoinChange(int arr[], int sum, int n) {
        if (sum == 0)
            return 1;
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (sum != 0 && n == 0)
            return 0;
        // here in second case no need to reduce n to n-1 because we can //include coins
        // as many times as we want
        return CoinChange(arr, sum, n - 1) + CoinChange(arr, sum - arr[n - 1], n);

    }
}
