package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:45
 */
import java.util.Scanner;
import java.math.*;
public class Test005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine().substring(2);
            int i = Integer.parseInt(input, 16);
            System.out.println(i);
        }

    }
}