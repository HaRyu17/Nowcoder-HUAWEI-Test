package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:45
 */
import java.util.Scanner;
public class Test011 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num2 = num+"";
        StringBuffer num3 = new StringBuffer(num2);
        num3.reverse();
        System.out.println(num3);
    }
}
