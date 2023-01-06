package contest;
import java.io.*;
import java.util.*;

public class highestsequence {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[][] step = new int[1001][2];

        for(int i = 0; i < 1001; i++) {
            step[i][1] = 1;
        }

        int num = 1, count = 0;

        step[0][1] = num;

        for (int i = 0; i < n; i++) {
            step[i][0] = Integer.parseInt(st.nextToken());
            for(int j= 0; j < i; j++) {
                if (step[j][0] < step[i][0]) {
                    step[i][1] = Math.max(step[j][1] + 1,step[i][1]);
                }
                System.out.println(i + " , " + j + " , " + step[i][0] + " " + step[i][1]);
            }
        }

        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (tmp < step[i][1]) {
                tmp = step[i][1];
            }
        }

//        System.out.println(tmp);
    }
}