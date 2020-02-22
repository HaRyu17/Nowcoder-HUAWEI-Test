package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:45
 */
import java.util.Scanner;
public class Test012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuffer in = new StringBuffer(input);
        in.reverse();
        System.out.println(in);
    }
}