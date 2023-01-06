package contest;
import java.io.*;

public class tile2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;

        bw.write(String.valueOf(recur(dp, t)));
        bw.flush();
        bw.close();
    }

    public static int recur(int[] dp, int t) {
        for (int i = 3; i <= t; i++) {
            dp[i] = (2*dp[i - 2] + dp[i - 1]) % 10007;
        }
        return dp[t];
    }
}
