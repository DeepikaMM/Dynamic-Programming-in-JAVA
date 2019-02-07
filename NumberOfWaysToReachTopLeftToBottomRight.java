import java.util.*;

public class NumberOfWaysToReachTopLeftToBottomRight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int count = 0;
        while (count < test) {
            int m = in.nextInt();
            int n = in.nextInt();
            int res = FindNumberOfWaysToReachTopLeftToBottomRight(m, n);
            System.out.println(res);
            count++;
        }
    }

    public static int FindNumberOfWaysToReachTopLeftToBottomRight(int m, int n) {
        int dp[][] = new int[m][n];
        int i, j;
        for (i = 0; i < n; i++)
            dp[0][i] = 1;
        for (j = 0; j < m; j++)
            dp[j][0] = 1;

        for (i = 1; i < m; i++) {
            for (j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
