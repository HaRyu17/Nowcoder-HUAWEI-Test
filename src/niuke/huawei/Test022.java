package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num == 0){
                continue;
            }
            int cola = num/2;
            System.out.println(cola);
        }

    }
}
