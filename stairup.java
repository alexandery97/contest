package contest;
import java.io.*;
import java.util.*;

//public class stairup {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//        int[] step = new int[n + 1];
//
//        for (int i = 1; i < n + 1; i++) {
//            step[i] = Integer.parseInt(br.readLine());
//        }
//
//
//        int[] dp = new int[n + 1];
//        for (int i = 1; i < n + 1; i++) {
//            if (i == 1) {
//                dp[i] = step[1];
//            } else if (i == 2) {
//                dp[i] = Math.max(step[1] + step[2], step[2]);
//            } else if (i == 3) {
//                dp[i] = Math.max(step[1] + step[3], step[2] + step[3]);
//            } else {
//                dp[i] = Math.max(dp[i - 3] + step[i - 1] + step[i], dp[i - 2] + step[i]);
//            }
//        }
//
//        System.out.println(dp[n]);
//
//    }
//}
// dp[0][i] = step;
// dp[1][i] = dp

public class stairup {
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);

        int t = br.nextInt();
        int[][] dp = new int[2][t+1];

        for(int i = 1; i < t+1; i++){
            dp[0][i] = br.nextInt();

            if(i == 1) {
                dp[1][i] = dp[0][1];
            }
            else if(i == 2) {
                dp[1][i] = Math.max(dp[0][1] + dp[0][2], dp[0][2]);
            }
            else if(i == 3) {
                dp[1][i] = Math.max(dp[0][1] + dp[0][3], dp[0][2] + dp[0][3]);
            }
            else {
                dp[1][i] = Math.max(dp[1][i-3] + dp[0][i-1] + dp[0][i], dp[1][i-2] + dp[0][i]);
            }
        }
        System.out.println(dp[1][t]);
    }
}
