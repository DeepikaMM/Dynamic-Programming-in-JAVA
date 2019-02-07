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
            if (isSubSetSum(arr, sum, n) == true)
                System.out.println("Found a subset" + " with given sum");
            else
                System.out.println("No subset with" + " given sum");
            count++;
        }
    }

    public static boolean isSubSetSum(int arr[], int sum, int n) {
        boolean subset[][] = new boolean[sum + 1][n + 1];
        for (int j = 0; j <= n; j++)
            subset[0][j] = true;
        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
            for (int k = 1; k <= sum; k++) {
                for (int l = 1; l <= n; l++) {
                    subset[k][l] = subset[k][l - 1];
                    if (k >= arr[l - 1])
                        subset[k][l] = subset[k][l] || subset[k - arr[l - 1]][l - 1];
                }
            }
        }
        return subset[sum][n];
    }
}
