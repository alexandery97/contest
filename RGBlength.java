package contest;
import java.io.*;
import java.util.*;

public class RGBlength {
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);

        int t = br.nextInt();
        int[][] dp = new int[1001][3];

        for(int i = 1; i <= t; i++){
            int R = br.nextInt();
            int G = br.nextInt();
            int B = br.nextInt();

            dp[i][0] = Math.min(dp[i-1][1] + R, dp[i-1][2] + R);
            dp[i][1] = Math.min(dp[i-1][0] + G, dp[i-1][2] + G);
            dp[i][2] = Math.min(dp[i-1][0] + B, dp[i-1][1] + B);
        }

        int answer = Math.min(dp[t][0], dp[t][1]);
        answer = Math.min(answer, dp[t][2]);
        System.out.println(answer);
    }
}
