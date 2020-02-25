package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test030 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String z = reverse(s);
            System.out.println(z);
        }
    }
    public static String reverse(String s){
        String[] ss = s.split("[^a-zA-Z]+");
        StringBuffer sb = new StringBuffer();
        for(int i = ss.length;i>0;i--){
            if(i == 1){
                sb.append(ss[i-1]);
            }else{
                sb.append(ss[i-1]);
                sb.append(" ");
            }
        }
        String z = sb.toString().trim();
        return z;
    }
}


