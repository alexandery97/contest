package contest;
import java.io.*;
import java.util.StringTokenizer;

public class sticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int length;
        int num = Integer.parseInt(br.readLine());
        int [][]S;
        int [][]D;

        for (int i = 0; i < num; i++) {
            length = Integer.parseInt(br.readLine());

            S = new int[2][length+1];
            D = new int[2][length+1];

            for(int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= length; k++) {
                    S[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            D[0][1] = S[0][1];
            D[1][1] = S[1][1];

            for (int j = 2; j <= length; j++) {
                D[0][j] = Math.max(D[1][j - 1], D[1][j - 2]) + S[0][j];
                D[1][j] = Math.max(D[0][j - 1], D[0][j - 2]) + S[1][j];
            }
            System.out.println(Math.max(D[0][length], D[1][length]));
        }
    }
}
