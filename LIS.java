package contest;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] step = new int[1001];
        int[] dp = new int[1001];

        for (int i = 0; i < N; i++) {
            step[i] = in.nextInt();
        }
        int Max = step[0];

        for (int i = 0; i < N; i++) {
            dp[i] = step[i];
            for (int j = 0; j < i; j++) {
                if (step[j] < step[i] && dp[i] < dp[j] + step[i]) {
                    dp[i] = dp[j] + step[i];
                    Max = Math.max(Max, dp[i]);
                }
            }
        }
        System.out.println(Max);
    }
}