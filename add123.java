package contest;
import java.io.*;

public class add123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] arr;

        while (t > 0) {
            t -= 1;
            int n = Integer.parseInt(br.readLine());
            arr = new int[12];

            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 4;

            for (int i = 3; i < arr.length; i++) {
                arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
            }
            bw.write(arr[n - 1] + "\n");
        }

//  **메모리 성능 위주**
//  write한다고 해서 바로바로 출력되지 않습니다.
//  직접 출력 stream에 반영되는 것이 아니라 성능을 위해 buffer에 저장해두었다가
//  BufferedWriter가 flush되거나 close되었을 때 한번에 출력 stream에 반영하기 때문입니다.

        bw.flush();
        bw.close();
    }
}
