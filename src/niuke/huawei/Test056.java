package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:54
 */
import java.math.BigInteger;
import java.util.Scanner;
public class Test056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            BigInteger a = new BigInteger(str1);
            BigInteger b = new BigInteger(str2);
            System.out.println(a.add(b));
        }
        sc.close();
    }
}
