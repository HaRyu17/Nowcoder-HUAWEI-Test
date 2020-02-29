package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/26 - 15:42
 */
import java.util.Scanner;
public class Test045 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            int num = sc.nextInt();
            if(num >= str.length()){
                System.out.println(str);
                continue;
            }
            String cut = "";
            int b = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)<='z'){
                    b++;
                }else{
                    b+=2;
                }
                if(b == num){
                    cut += str.substring(0,num);
                    break;
                }else if(b>num){
                    cut += str.substring(0,num-2);
                    break;
                }
            }

            System.out.println(cut);
        }
    }
}
