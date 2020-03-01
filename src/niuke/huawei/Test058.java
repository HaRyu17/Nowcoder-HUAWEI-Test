package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:54
 */

import java.util.Scanner;
public class Test058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            char[] arrCh = input.toCharArray();
            boolean output = true;
            for (char ch : arrCh) {
                if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                    System.out.println(ch);
                    output = false;
                    break;
                }
            }
            if(output){
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
