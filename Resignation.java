package contest;
import java.io.*;
import java.util.StringTokenizer;

public class Resignation {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] dp = new int[num+2][num+2];
        int[] result = new int[num+2];
        int res = 0;

        for(int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(st.nextToken());
            dp[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < num+2; i++) {
            if(dp[i][0] <= num+1)
                result[i] = Math.max(result[i], res);
            if(i+dp[i][0] <= num+1)
                result[i+dp[i][0]] = Math.max(result[i+dp[i][0]], dp[i][1] + result[i]);
            res = Math.max(result[i], res);
        }
        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}