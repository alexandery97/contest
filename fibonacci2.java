package contest;
import java.io.*;

public class fibonacci2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        long [] fib = new long[num + 3];
        fib[0] = 0;
        fib[1] = fib[2] = 1;

        for(int i = 3; i <= num; i++)
            fib[i] = fib[i-1] + fib[i-2];
        bw.write(String.valueOf(fib[num]));
        bw.flush();
        bw.close();
    }
}