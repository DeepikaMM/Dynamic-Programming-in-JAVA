import java.util.*;

public class CuttingRod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int count = 0;
        while (count < test) {
            int n = in.nextInt();
            int k = in.nextInt();
            int result = EggDrop(n, k);
            System.out.println("The number of min wasy to find out the safe floor are " + result);
            count++;
        }
    }

    public static int EggDrop(int n, int k) {
        if (n == 0)
            return 0;
        if (n == 1)
            return k;
        if (k == 1 || k == 0)
            return k;
        int min = Integer.MAX_VALUE;
        int res;
        for (int i = 2; i <= k; i++) {
            res = Math.max(EggDrop(n - 1, i - 1), EggDrop(n, k - i));
            if (res < min)
                min = res;
        }
        return min + 1;
    }
}
