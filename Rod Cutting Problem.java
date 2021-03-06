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
            int result = CutRod(val, n, l);
            System.out.println("Number of ways are " + result);
            count++;
        }
    }

    public static int CutRod(int val[], int n, int l) {
        if (n == 0 || l <= 0)
            return 0;
        return Math.max(CutRod(val, l - n, l - n) + val[n - 1], CutRod(val, n - 1, l));
    }
}
