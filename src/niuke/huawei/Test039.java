package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String strLow = str.toLowerCase();
            int num = 0;
            int asd = 0;
            int kongge = 0;
            int $$$ = 0;
            char[] c = strLow.toCharArray();
            for(int i = 0;i<c.length;i++){
                if(c[i] == ' '){
                    kongge++;
                }else if(c[i]>= 'a'&&c[i]<='z'){
                    asd++;
                }else if(c[i]>= '0'&&c[i]<='9'){
                    num++;
                }else if(c[i]>= '!'&&c[i]<='/'||c[i]>= ':'&&c[i]<='@'
                        ||c[i]>= '['&&c[i]<='`'||c[i]>= '{'&&c[i]<='~'){
                    $$$++;
                }
            }
            System.out.println(asd);
            System.out.println(kongge);
            System.out.println(num);
            System.out.println($$$);
        }
    }
}
