package contest;
import java.io.*;
import java.util.StringTokenizer;

public class BinomialCoefficient {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int denom = Integer.parseInt(st.nextToken());
        int nume = Integer.parseInt(st.nextToken());

        int [][] table = new int[1010][1010];

        for (int i = 1; i <= 1000; i++) {
            table[i][0] = table[i][i] = 1;
            for (int j = 1; j < i; j++) {
                table[i][j] = (table[i-1][j] + table[i-1][j-1]) % 10007;
            }
        }

        bw.write(String.valueOf(table[denom][nume]));
        bw.flush();
        bw.close();
    }
}
