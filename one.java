package contest;
import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int start = 0;
//
//        while(n != 0) {
//            if(n % 3 != 0) {
////                System.out.println("a");
//                n -= 1;
//                start++;
////                System.out.println(n);
//            }
//             else if (n % 3 == 0) {
//                n /= 3;
////                System.out.println("b");
//                start++;
////                System.out.println(n);
//            }
//            else if (n % 2 == 0) {
//                n /= 2;
//                start++;
//            }
//        }
//        System.out.println(start-1);
        int[] arr = new int[1000001];

        for(int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + 1;
            if(i % 2 == 0)
                arr[i] = Math.min(arr[i], arr[i/2] + 1);
            if(i % 3 == 0)
                arr[i] = Math.min(arr[i], arr[i/3] + 1);
        }

        System.out.println(arr[n]);
    }
}
