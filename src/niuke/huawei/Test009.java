package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:45
 */
import java.util.Scanner;
public class Test009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String sb = st.substring(st.length()-1);
        for(int i = st.length()-2;i>=0;i--){
            if(!sb.contains(st.substring(i,i+1))){
                sb+=st.substring(i,i+1);
            }
        }
        System.out.println(sb);
    }
}
