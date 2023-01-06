package contest;
import java.io.*;
import java.util.StringTokenizer;

public class normback {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [][] info = new int[num+1][num+1];
        int [][] dp = new int[num+1][K+1];

        for(int i = 1; i <= num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            info[i][0] = Integer.parseInt(st.nextToken());
            info[i][1]= Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= num; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = dp[i-1][j];
                if(j - info[i][0] >= 0)
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-info[i][0]]+info[i][1]);
            }
        }

//        for (int i = 0; i < num; i ++)
//            System.out.println(info[i][0] + ", " + info[i][1]);

        bw.write(String.valueOf(dp[num][K]));
        bw.flush();
        bw.close();
    }
}

//5 10
//3 8
//4 7
//1 9
//5 6
//2 1