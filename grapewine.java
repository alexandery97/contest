package contest;
import java.io.*;

public class grapewine {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] sum = new int[10000];
        int[] dp = new int[10000];
        int con = 0, result = 0;

        for (int i = 0; i < num; i++)
            sum[i] = Integer.parseInt(br.readLine());

        for (int i = 1; i < num; i++) {
            if (con == 2) {
                con = 0;
                continue;
            }
            else {
                dp[i] = Math.max(dp[i] + sum[i + 1], sum[i]);
            }
            con += 1;
            System.out.println(dp[i] + " , " + con + " , " + sum[i]);
            result += sum[i];
        }
        bw.write(String.valueOf(result + dp[0]));
        bw.flush();
        bw.close();
    }
}
