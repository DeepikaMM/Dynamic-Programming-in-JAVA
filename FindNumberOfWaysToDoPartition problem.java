import java.util.*;

public class FindNumberOfWaysToDoPartition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int count = 0;
        while (count < test) {
            int n = in.nextInt();
            int k = in.nextInt();
            int res = FindNumberOfWaysToDoPartition(n, k);
            System.out.println(res);
            count++;
        }
    }

    public static int FindNumberOfWaysToDoPartition(int n, int k) {
        if (n == 0 || k == 0 || k > n)
            return 0;
        if (k == 1 || k == n)
            return 1;
        return (FindNumberOfWaysToDoPartition(n - 1, k) * k) + FindNumberOfWaysToDoPartition(n - 1, k - 1);
    }
}
