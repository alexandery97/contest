package contest;
import java.io.*;

public class wavesequence {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        long [] sum = new long[100];

        sum[0] = sum[1] = sum[2] = 1;
        sum[3] = sum[4] = 2;

        for(int i = 0; i < num; i++) {
            int result = Integer.parseInt(br.readLine());
            for(int j = 5; j < 100; j++)
                sum[j] = sum[j - 3] + sum[j - 2];
//            bw.write(sum[result-1] + "\n");
        }

        for(int i = 0; i < 100; i++)
            bw.write(sum[i] + "\n");
        bw.flush();
        bw.close();
    }
}
