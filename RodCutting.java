import java.util.*;

public class CuttingRod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int count = 0;
        while (count < test) {
            int n = in.nextInt();
            int val[] = new int[n];
            for (int i = 0; i < n; i++)
                val[i] = in.nextInt();
            int l = n;
            int dp[][] = new int[100][100];
            for (int k = 0; k < 100; k++)
                for (int m = 0; m < 100; m++)
                    dp[k][m] = -1;
            int result = CutRod(val, n, l, dp);
            System.out.println("Number of ways are " + result);
            count++;
        }
    }

    public static int CutRod(int val[], int n, int l, int dp[][]) {
        if (dp[n][l] != -1)
            return dp[n][l];
        if (n == 0 || l <= 0)
            return 0;
        dp[n][l] = Math.max(CutRod(val, l - n, l - n, dp) + val[n - 1], CutRod(val, n - 1, l, dp));
        return dp[n][l];
    }
}
