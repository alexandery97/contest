package contest;
import java.io.*;
import java.util.*;

public class continuousum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] result = new int[num];
        int[] dp = new int[num];

        for (int i = 0; i < num; i++)
            result[i] = Integer.parseInt(st.nextToken());

        int max = dp[0] = result[0];

        for (int i = 1; i < num; i++) {
            dp[i] = Math.max(dp[i - 1] + result[i], result[i]);
            max = Math.max(max, dp[i]);
        }
//        for(int i = 0; i < num; i++) {
//            System.out.println(i + ", " + dp[i] + " , " + result[i]);
//        }
        System.out.println(max);
    }
}
