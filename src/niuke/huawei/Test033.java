package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
import java.util.Arrays;
public class Test033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine();
            char[] c = input.toCharArray();
            Arrays.sort(c);
            System.out.println(c);
        }
    }
}
