package contest;
import java.io.*;

public class climbnum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int [] result = new int[1001];
        result[1] = 1;

        while(num >= 0) {
            for(int i = 2; i <= 10; i++) {
                result[i] = (result[i-1] + result[i]) % 10007;
            }
            num--;
        }

        bw.write(String.valueOf(result[10]));
        bw.flush();
        bw.close();
    }
}
