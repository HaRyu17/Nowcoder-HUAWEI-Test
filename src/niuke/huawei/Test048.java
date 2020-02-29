package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/26 - 15:42
 */
//取巧做法
import java.util.Scanner;
public class Test048 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            for(int i=0;i<num;i++){
                System.out.print("ABCD");
            }
            System.out.println("");
        }
        sc.close();
    }
}
