package contest;
import java.io.*;
import java.util.StringTokenizer;

public class binatile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int [] result = new int [1000001];

        result[0] = 1;
        result[1] = 2;

        for(int i = 2; i < num; i++) {
            result[i] = (result[i-2] + result[i-1]) % 15746;
        }

        bw.write(String.valueOf(result[num-1]));
        bw.flush();
        bw.close();
    }
}
