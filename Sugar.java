package contest;
import java.util.*;

public class Sugar {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        int Kg = n.nextInt();
        int result = 0;

        if(Kg / 5 >= 3) {
            result += Kg / 5;
            result += (Kg % 5) / 3;
        }
        else if(Kg / 5 < 3 && Kg/5 != 0){
            if(Kg % 3 == 0)
                result += Kg/3;
            else {
                if((Kg - 5) % 3 != 0)
                    result = -1;
                else
                    result += Kg / 3;
            }
        }
        else {
            result = -1;
        }
        System.out.println(result);
    }
}

//public class Sugar {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int sugar = sc.nextInt();
//        int bag = 0;
//
//        while(true){
//            if(sugar % 5 == 0){
//                bag += sugar / 5;
//                System.out.print(bag);
//                break;
//            }
//            else{
//                sugar -=3;
//                bag++;
//            }
//            if(sugar <0){ // 3kg봉지로 나누다가 -값이 나온다면 정확한 Nkg로 배달이 안되기 때문에 -1 출력(ex 4, 7)
//                System.out.print("-1");
//                break;
//            }
//        }
//    }
//}
