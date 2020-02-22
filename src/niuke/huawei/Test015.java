package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/22 - 11:00
 */
import java.util.Scanner;
public class Test015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String bs = Integer.toBinaryString(num);
        char[] bc = bs.toCharArray();
        int out = 0;
        for(int i = 0; i < bc.length; i++){
            if(bc[i] == '1'){
                out++;
            }
        }
        System.out.println(out);
    }
}
