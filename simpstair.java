package contest;
import java.io.*;

public class simpstair {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] res = new int[101][10];
        long ans = 0;

        for(int i = 1; i <= 9; i++) {
            res[1][i] = 1;
        }

        for(int i = 2; i <= num ; i++){
            for(int j = 0; j <= 9; j++){
                if(j == 0)
                    res[i][j] = res[i-1][1] % 1000000000;
                else if(j == 9)
                    res[i][j] = res[i-1][8] % 1000000000;
                else
                    res[i][j] = (res[i-1][j+1] + res[i-1][j-1]) % 1000000000;
                System.out.println(res[i][j] + " , " + i + " , " + j);
            }
        }

        for(int i = 0 ; i <= 9; i++){
            ans += res[num][i];
        }
        bw.write(String.valueOf(ans % 1000000000));
        bw.flush();
        bw.close();
    }
}