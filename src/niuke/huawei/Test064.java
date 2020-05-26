package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/5/27 - 0:04
 */
import java.util.Scanner;
public class Test064 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            String max = a.length()>=b.length()?a:b;
            String min = b.length()>=a.length()?a:b;
            int l = 0;
            String s = "";
            int ab=0;
            for(int i =0;i<min.length();i++){
                for(int j =i+1;j<min.length()+1;j++){
                    if(max.contains(min.substring(i,j))){
                        l = j-i;
                        if(l>ab){
                            ab = l;
                            s = min.substring(i,j);
                        }
                    }
                }
            }
            System.out.println(s);
        }
    }
}
