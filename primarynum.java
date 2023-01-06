package contest;
import java.io.*;

public class primarynum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        long[][] res = new long[91][2];
        long ans = 0;

        res[1][0] = 0;
        res[1][1] = 1;

        for(int i = 2; i <= num ; i++){
            res[i][0] = res[i - 1][0] + res[i - 1][1];
            res[i][1] = res[i - 1][0];
        }

        for(int i = 0 ; i < 2; i++){
            ans += res[num][i];
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}

//[2][1] X [3][1] 101 [4][1] 1001 [5][1] 10101,10001 [6][1] 101001, 100101 [7][1] 1010101,1001010
//[2][0] 10 [3][0] 100 [4][0] 1000,1010 [5][0] 10000, 10100, 10010 [6][0] 101010, 100100, 101000, 100010, 1 [7][0] 1000000, 1010100
