package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test036 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int month = sc.nextInt();
            int one = 1;
            int two = 0;
            int three = 0;
            while(--month!=0){
                three += two;
                two = one;
                one = three;
            }
            int count = one + two + three;
            System.out.println(count);
        }

    }
}
