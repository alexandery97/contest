package contest;
import java.io.*;

public class LCS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine();
        String sec = br.readLine();

        String x[] = first.split("");
        String y[] = sec.split("");

        int c[][] = new int[x.length+1][y.length+1];

        for(int i = 0; i < (x.length+1); i++) {
            c[i][0] = 0;
        }

        for(int j = 0; j < (y.length+1); j++) {
            c[0][j] = 0;
        }

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < y.length; j++) {
                if( x[i].equals(y[j]) ) {
                    c[i+1][j+1] = c[i][j] +1;
                }
                else {
                    c[i+1][j+1] = Math.max(c[i+1][j], c[i][j+1]);
                }
            }
        }
        bw.write(String.valueOf(c[x.length][y.length]));
        bw.flush();
        bw.close();
    }
}
