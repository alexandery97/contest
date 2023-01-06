package contest;
import java.io.*;
import java.util.StringTokenizer;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int number = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int[] S = new int[number+1];
        int[] dp = new int[10001];

        for(int i = 1; i <= number; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        for(int i = 1; i <= number; i++) {
            for(int j = S[i]; j <= sum; j++) {
                System.out.println(i + " , " + j + " , " + dp[j]);
                dp[j] += dp[j - S[i]];
            }
        }

//        for(int i = 0; i <= sum; i++)
//            System.out.println(dp[i]);

        bw.write(String.valueOf(dp[sum]));
        bw.flush();
        bw.close();
    }
}
