package contest;
import java.io.*;
import java.util.StringTokenizer;

//public class cardbuy {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int num = Integer.parseInt(br.readLine());
//        int[] result = new int[num+1];
//        int[] oneave = new int[num+1];
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        long sum = 0;
//
//        for(int i = 1; i < num+1; i++) {
//            result[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i = 1; i < num+1; i++) {
//            if(num % i == 0) {
//                oneave[i] = result[i] * num / i;
//            }
//            else if(i == num)
//                oneave[i] = result[i];
//            else if(num % i != 0)
//                oneave[i] = (result[i] * (num/i)) + result[(num-((num/i)*i))];
//            sum = Math.max(sum, oneave[i]);
//            System.out.println(result[i]+ " , " + num/i + " , " + i + " , " + num%i + " , " + num + " , " + result[(num-((num/i)*i))] + " , " + oneave[i] + " , " + sum);
//        }
//
//        bw.write(String.valueOf(sum));
//        bw.flush();
//        bw.close();
//    }

public class cardbuy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 1; i <= N; i++){
            dp[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], dp[j] + dp[i-j]);
            }
        }
        System.out.println(dp[N]);
    }
}

//}

//10
//5 10 11 12 13 30 35 40 45 47
// 98, 50이 나와야됨

//4
//3 5 15 16
//15, 18이 나와야됨