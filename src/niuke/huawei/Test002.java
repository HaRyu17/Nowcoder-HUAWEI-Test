package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:34
 */
import java.util.*;
public class Test002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        char check = sc.next().toUpperCase().charAt(0);
        char [] strArr1 = input.toCharArray();
        int count = 0;
        if(strArr1.length!=0){
            for(char i: strArr1){
                if(check == i){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
