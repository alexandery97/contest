package contest;
import java.io.*;

public class Owner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[15][15];

            for (int x = 1; x < 15; x++) {
                arr[x][1] = 1;
            }

            for (int y = 1; y < 15; y++) {
                arr[0][y] = y;
            }

            for (int a = 1; a < 15; a++) {
                for (int b = 2; b < 15; b++) {
                    arr[a][b] += arr[a][b - 1] + arr[a - 1][b];
                }
            }
            bw.write(arr[k][n] + "\n");
        }

//      **메모리 성능 위주**
//      write한다고 해서 바로바로 출력되지 않습니다.
//      직접 출력 stream에 반영되는 것이 아니라 성능을 위해 buffer에 저장해두었다가
//      BufferedWriter가 flush되거나 close되었을 때 한번에 출력 stream에 반영하기 때문입니다.

        bw.flush();
        bw.close();
    }
}
