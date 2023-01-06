package contest;
import java.io.*;
import java.util.StringTokenizer;

public class bridgeput {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] dp = new int[31][31];

        for(int i=0; i<30; i++) {
            dp[i][i] = 1;
            dp[0][i] = i+1;
        }

        for(int i=1; i<30; i++) {
            for(int j=i+1; j<30; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
            }
        }

        for(int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(dp[N-1][M-1]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}

