package contest;
import java.io.*;

public class tile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        System.out.println(recur(dp, t));
    }

    public static int recur(int[] dp, int t) {
        for (int i = 3; i <= t; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        return dp[t];
    }
}
