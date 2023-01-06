package contest;
import java.util.Scanner;

public class sumofsquare {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int [] dp = new int[100001];

        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = i;
            int j = 1;
            while(i>=j*j){
                dp[i] = Math.min(dp[i - j * j]+1, dp[i]);
                System.out.println(i + " , " + j);
                j++;
            }
        }
        System.out.println(dp[N]);
    }
}