package contest;
import java.io.*;
import java.util.*;

public class intriangle {
    public static void main(String[] args) throws IOException {

        Scanner n = new Scanner(System.in);

        int num = n.nextInt();

        int[][] result = new int[1001][1001];
        int re = 0;

        for(int i = 0; i < num-1; i++) {
            for(int j = 0; j < i; j++) {
                result[i][j] = n.nextInt();
            }
        }

        for (int i = 1; i < num; i++) {
            for(int j = 0; j < i+1; j++) {
                if(j==0)
                    result[i][0] += result[i-1][0];
                else if(j == i)
                    result[i][j] += result[i-1][j-1];
                else
                    result[i][j] += Math.max(result[i-1][j-1], result[i-1][j]);
            }
        }

        for(int i = 0; i < num+1; i++)
            re = Math.max(re,result[num-1][i]);
        System.out.println(re);
    }
}