package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:45
 */
import java.util.*;
public class Test004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            spilt(input);
        }
    }
    public static void spilt(String s){
        while(s.length()>=8){
            System.out.println(s.substring(0,8));
            s = s.substring(8);
        }
        if(s.length()<8&&s.length()>0){
            s = s +"00000000";
            System.out.println(s.substring(0,8));
        }

    }
}
