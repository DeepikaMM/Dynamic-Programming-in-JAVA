import java.util.*;

public class EgggDrop {

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
        int eggFloor[][] = new int[n + 1][k + 1];
        int i, j, x;
        for (i = 1; i <= n; i++) {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }
        for (j = 1; j <= k; j++)
            eggFloor[1][j] = j;
        int res;
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= k; j++) {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++) {
                    res = 1 + Math.max(eggFloor[i - 1][x - 1], eggFloor[i][j - x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;
                }
            }
        }
        return eggFloor[n][k];
    }
}
