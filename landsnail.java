package contest;
import java.util.Scanner;

public class landsnail {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        int Up = n.nextInt();
        int Down = n.nextInt();
        int H = n.nextInt();
        int Goal = 0;
        int Day = 0;

        while(Goal < H) {
            Goal += Up;
            Goal -= Down;
            if(Goal == H) {
                break;
            }
            Day += 1;
//            System.out.println(Up + " and " + Down + " With " + Goal);
        }
        System.out.println(Day);
    }
}
