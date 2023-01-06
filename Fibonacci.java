package contest;
import java.io.*;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[41][2];

        arr[0][0] = 1; arr[0][1] = 0;
        arr[1][0] = 0; arr[1][1] = 1;

        for(int i = 2; i < 41; i++) {
            arr[i][0] = arr[i-2][0] + arr[i-1][0];
            arr[i][1] = arr[i-2][1] + arr[i-1][1];
        }

        for (int i = 2; i < t+2; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[n][0] + " " + arr[n][1] + "\n");
        }

//      **메모리 성능 위주**
//      write한다고 해서 바로바로 출력되지 않습니다.
//      직접 출력 stream에 반영되는 것이 아니라 성능을 위해 buffer에 저장해두었다가
//      BufferedWriter가 flush되거나 close되었을 때 한번에 출력 stream에 반영하기 때문입니다.

        bw.flush();
        bw.close();
    }
}
