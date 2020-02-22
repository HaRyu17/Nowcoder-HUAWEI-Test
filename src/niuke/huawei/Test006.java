package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:45
 */
import java.util.Scanner;
public class Test006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long ulDataInput = sc.nextInt();
        System.out.println(getResult(ulDataInput));
    }
    public static String getResult(long ulDataInput){
        StringBuffer result = new StringBuffer();
        for(int i = 2;;i++){
            while(ulDataInput%i==0){
                ulDataInput = ulDataInput/i;
                result.append(i+" ");
            }
            if(ulDataInput == 1){
                break;
            }
        }
        String st = result.toString();
        return st;
    }
}
