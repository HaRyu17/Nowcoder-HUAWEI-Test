package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 22:08
 */
import java.util.Scanner;
public class Test051 {
    //只通过测试样例
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String A = sc.next();
            char[] strA = A.toCharArray();
            String B = sc.next();
            char[] strB = B.toCharArray();
            int min = strA.length<strB.length?strA.length:strB.length;
            int count = strA.length==min?strB.length-min:strA.length-min;
            for(int i = 0;i<min;i++){
                if(strA[i]!=strB[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
